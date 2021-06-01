package ejercicio2;

import java.util.Random;
import java.util.Scanner;



public class Main {

	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();
	public static void main(String[] args) {
		
		
		int [][] matriz = generaMatrizAleatoria();
		int [][]respuesta = new int[matriz.length][matriz[0].length];
		mostrarMatriz(matriz);
		
		Runtime rt = Runtime.getRuntime();
		int numCores = 4;//rt.availableProcessors();
		System.out.println();
		int rango =(int) Math.floor(matriz.length/numCores);
		int posIni = 0;
		int posFin = rango;
		//System.out.println(rango);
		
		Thread [] th = new Thread [numCores];
		for (int i = 0; i < th.length; i++) {
			th[i] = new Thread (new RHilo(posIni, posFin, matriz,respuesta));
			th[i].start();
			posIni = posFin;
			posFin += rango;
			if (i == th.length-2) {
				posFin = matriz.length;
			}
		}
		for (int i = 0; i < th.length; i++) {
			try {
				th[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		mostrarMatriz(respuesta);

	}
	
	private static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
		
		private static int[][] generaMatrizAleatoria() {
			boolean seguir = true;
			int tama;
			do {
				System.out.println("Introduce la dimensión de la matriz mayor o igual que 6");
				tama = sc.nextInt();
				if (tama >= 6) {
					System.out.println("Correcto..");
					seguir = false; 
				}				
			}while(seguir);
			
			int [][] resu = new int [tama][tama];
			
			for (int i = 0; i < resu.length; i++) {
				for (int j = 0; j < resu[i].length; j++) {
					resu[i][j] = r.nextInt(9)+1; 
				}
			}
			return resu;
		}
		
}


