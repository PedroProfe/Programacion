package ejercicio1;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		int [][]mat = {{1,3,5},{3,2,1},{5,1,2}};
		int [][]mat2 = {{3,3,1},{2,2,1},{1,2,1}};
		int [][]resultado = new int[mat.length][mat[0].length];
		double [][]resultadoD = new double[mat.length][mat[0].length];
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------Primera Matriz-------");
		dibujaMat(mat);
		System.out.println("-------------------Segunda Matriz-------");
		dibujaMat(mat2);
		System.out.println("----------------------------------------");
		boolean seguir=true;
		do {
			System.out.println("Escribe una operación a realizar: 1. Suma, 2. Resta, 3 Multipliación,4 Rotar 180º, 5 Salir.");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				resultado = suma(mat,mat2);
				System.out.println("-----------Resultado-------");
				dibujaMat(resultado);
				break;
			case 2:
				System.out.println("Se restará la primera matriz menos la segunda.");
				resultado = resta(mat,mat2);
				System.out.println("-----------Resultado-------");
				dibujaMat(resultado);
				break;
			case 3:
				System.out.println("Escriba el escalar para multiplicar por la primera matriz");
				double escalar = sc.nextDouble();
				resultadoD = multiplicar(mat,escalar);
				System.out.println("-----------Resultado-------");
				dibujaMatD(resultadoD);
				break;
			case 4:
				System.out.println("Se rotará la primera matriz");
				resultado = girar(mat);
				System.out.println("-----------Resultado-------");
				dibujaMat(resultado);
				break;
			case 5:
				seguir = false;
				break;
			default:
				System.out.println("Opción no válida");
				
			}
		}while(seguir);
	

	}


	

	private static int[][] girar(int[][] mat) {
		int [][]r = new int[mat.length][mat[0].length];
		int k;
		for (int i = 0; i < mat.length; i++) {
			k=mat.length-1;
			for (int j = 0; j < mat[0].length; j++) {
				r[i][j]=mat[k][i];
				k--;
			}			
		}
		return r;
	}




	private static double[][] multiplicar(int[][] mat, double escalar) {
		double [][]r = new double[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				r[i][j]=mat[i][j]*escalar;
			}			
		}
		
		return r;
	}




	private static int[][] resta(int[][] mat, int[][] mat2) {
		int [][]r = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				r[i][j]=mat[i][j]-mat2[i][j];
			}
			
		}
		
		return r;
	}




	private static int[][] suma(int[][] mat, int[][] mat2) {
		int [][]r = new int[mat.length][mat[0].length];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				r[i][j]=mat[i][j]+mat2[i][j];
			}
			
		}
		
		return r;
	}

	private static void dibujaMatD(double[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(" "+ mat[i][j] + " ");
			}
			System.out.println();
		}
		
	}


	private static void dibujaMat(int[][] t) {
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				System.out.print(" "+ t[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
