package ejercicio1sp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca la palabra a buscar: ");
		String pa = sc.nextLine();
		System.out.println("Introduzca el número de jugadores.");
		int nj = sc.nextInt();

		Ahorcado ah = new Ahorcado(pa,nj);

		sc.close();

		Jugador[] ju = new Jugador[nj];
		for (int i = 0; i < ju.length; i++) {
			ju[i] = new Jugador(ah,i);
			ju[i].start();
		}
		
	}

}
