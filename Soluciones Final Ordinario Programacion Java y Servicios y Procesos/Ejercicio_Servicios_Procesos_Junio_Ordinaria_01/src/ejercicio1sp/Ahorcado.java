package ejercicio1sp;

public class Ahorcado {
	
	private boolean haJugadoUno = false;
	String palabra;
	boolean []acertados;
	int []njugadoresErr;
	public Ahorcado(String palab, int njugador) {
		this.palabra = palab;
		acertados = new boolean[this.palabra.length()];
		this.njugadoresErr = new int[njugador];
	}
	
	public synchronized boolean comprobarLetra(char letra, int idJugador) {
		//System.out.println("El jugador "+ idJugador + " va a probar la letra " + letra);
		if (!haJugadoUno && idJugador != 0) {
			notifyAll();
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		haJugadoUno = true;
		if (!juegoTerminado()) {//el jugador uno o cualquier otro podría haber terminado el juego					
			
			
			if (estaLetraenPalabra(letra)) {
				System.out.println("El jugador "+idJugador+ " ha adivinado la letra: "+letra+" en la palabra. ");
				System.out.println("La palabra ha quedado así: "+escribePalabra());
				if (juegoTerminado()) {
					System.out.println("Juego terminado..");
					Jugador.pararTodosLosJugadores(true);
					System.out.println("Se parará el jugador: "+idJugador);
					notifyAll();	
					return false;
				}
				notifyAll();
				if (quedanJugadores(idJugador)) {//si quedan jugadores que no sea el mío me voy a dormir hasta que alguien me libere
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return true;
			}else {
				njugadoresErr[idJugador]++;
				if (njugadoresErr[idJugador]>=10) {
					System.out.println("El jugador "+idJugador + " ha agotado todas sus oportunidades y termina.");
					notifyAll();
					return false;
				}else {
					notifyAll();
					System.out.println("Lo siento jugador " +idJugador + " letra: "+ letra +" no encontrada vuelve a intentarlo.");
					if (quedanJugadores(idJugador)) {//si quedan jugadores que no sea el mío me voy a dormir hasta que alguien me libere
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					return true;
				}
			}
		}
		System.out.println("Se parará el jugador: "+idJugador);
		return false;//si llega aquí es porque el juego ha terminado en algún punto
		
	}

	private boolean juegoTerminado() {
		for (int i = 0; i < acertados.length; i++) {
			if (!acertados[i]) {
				return false;
			}
		}
		return true;
	}

	private boolean quedanJugadores(int idJugador) {
		for (int i = 0; i < njugadoresErr.length; i++) {
			if (njugadoresErr[i]<3 && (i != idJugador)) {//si quedan jugadores y es distinto del jugador que lo comprueba
				return true;
			}
		}
		return false;
	}

	private String escribePalabra() {
		char []letrasPalabra = this.palabra.toCharArray();
		String texto="";
		for (int i = 0; i < letrasPalabra.length; i++) {
			if (acertados[i]) {
				texto = texto + letrasPalabra[i];
			}else {
				texto += " _ ";
			}
		}
		return texto;
	}

	private boolean estaLetraenPalabra(char letra) {
		char []letras = palabra.toCharArray();
		boolean acierto=false;
		for (int i = 0; i < letras.length; i++) {
			if (letras[i] == letra) {
				acertados[i] = true;
				acierto = true;
			}
		}
		return acierto;
	}

}
