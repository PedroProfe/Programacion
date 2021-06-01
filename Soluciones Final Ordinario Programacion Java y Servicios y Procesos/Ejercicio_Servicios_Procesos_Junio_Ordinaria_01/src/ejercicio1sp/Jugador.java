package ejercicio1sp;

import java.util.Random;

public class Jugador extends Thread{

	Ahorcado ah;
	int idJugador;
	static boolean seguir = true;
	public Jugador(Ahorcado a, int id) {
		this.ah=a;
		this.idJugador = id;
	}
	
	
	
	public void run() {
		//Random random = new Random();
		//entre 18 y 65
		//char n = (char) ((int) (Math.random() * (91 - 65)) + 65);
		//char letra = (char) n;
		//System.out.println("Letra generada por el jugador "+ idJugador+" es la letra: "+ letra);
		while(ah.comprobarLetra((char) ((int) (Math.random() * (91 - 65)) + 65), idJugador) && (seguir));

	}



	public static void pararTodosLosJugadores(boolean b) {
			seguir = b;
		
	}
}
