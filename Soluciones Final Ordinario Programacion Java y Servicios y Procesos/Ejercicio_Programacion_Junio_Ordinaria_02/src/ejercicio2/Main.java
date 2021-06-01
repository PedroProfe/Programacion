package ejercicio2;

import java.util.Hashtable;
import java.util.Scanner;

/*
 * Los empleados de una cierta compañía se representan en la base de datos de la compañía por su 
 * nombre,número de empleado y número de la seguridad social.Construir una estructura de tablas 
 * hash que permita acceder al registro de un empleado por cualquiera de estos tres datos.
 * (Nota:No se dispone de memoria suficiente para duplicar los registros de los empleados).
 * */


public class Main {

	static Hashtable<String, Empleado> ht = new Hashtable<String,Empleado>();
	public static void main(String[] args) {
		boolean seguir=true;
		Scanner sc = new Scanner(System.in);
		int cont = 1;
		do {
			System.out.println("Introduzca el nombre del empleado: "+ cont + " o escriba 'salir' para terminar.");
			String nomb = sc.nextLine();
			if (!nomb.equalsIgnoreCase("salir")) {
				System.out.println("Introduzca el número de la seguridad social.");
				String numsegsocial = sc.nextLine();
				String clave = numsegsocial;
				ht.put(clave,new Empleado(numsegsocial,nomb));
				cont++;
			}else {
				seguir=false;
			}			
		}while (seguir);
		
		boolean terminar=true;
		do {
		System.out.println("Introduzca el número de la seguridad social o escriba terminar..");
		String clave = sc.nextLine();
		if (!clave.equalsIgnoreCase("terminar")) {
			try {
				Empleado em = (Empleado) ht.get(clave);
				System.out.println(" Empleado encontrado: " + em.toString());
			}catch (Exception e) {
				System.out.println("Empleado no encontrado..");
			}
		}else 
			terminar=false;
			
		}
		while(terminar);
		
		
	}

}
