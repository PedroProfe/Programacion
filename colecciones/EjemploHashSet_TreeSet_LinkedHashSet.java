package colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *  La diferencia fundamental entre las clases HashSet, TreeSet, LinkedHashSet con
 *  respecto a las listas ArrayList y LinkedList es que no puede haber elementos 
 *  repetidos en las colecciones que implementan la interfaz Set.A su vez se han creado 
 *  estas tres clases que tienen pequeñas diferencias entre una y otras:

 *		HashSet: El conjunto de datos no se almacena en un orden específico, 
 *				 si bien se garantiza que no hay duplicados.
 *		TreeSet: Los elementos del conjunto se almacenan de menor a mayor.
 *		LinkedHashSet: Los elementos del conjunto se encuentran en el orden que se 
 *                     insertan, similar a una lista pero sin dejar ingresar valores repetido.
 * 
 * 
 * */


public class EjemploHashSet_TreeSet_LinkedHashSet {

	public static void main(String[] args) {
		 Set<Integer> conjunto1 = new HashSet<Integer>();
	        conjunto1.add(20);
	        conjunto1.add(10);
	        conjunto1.add(1);
	        conjunto1.add(5);
	        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
	        conjunto1.add(20);
	        // La impresión no asegura un orden específico
	        for (int elemento : conjunto1)
	            System.out.print(elemento + " - ");
	        System.out.println();

	        Set<Integer> conjunto2 = new TreeSet<Integer>();
	        conjunto2.add(20);
	        conjunto2.add(10);
	        conjunto2.add(1);
	        conjunto2.add(5);
	        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
	        conjunto2.add(20);
	        // Los elementos se muestran de menor a mayor
	        for (int elemento : conjunto2)
	            System.out.print(elemento + " - ");
	        System.out.println();

	        Set<Integer> conjunto3 = new LinkedHashSet<Integer>();
	        conjunto3.add(20);
	        conjunto3.add(10);
	        conjunto3.add(1);
	        conjunto3.add(5);
	        // El valor 20 no se inserta en el conjunto ya que se encuentra repetido
	        conjunto3.add(20);
	        // Los elementos se muestran en el orden que se insertaron
	        for (int elemento : conjunto3)
	            System.out.print(elemento + " - ");
	        System.out.println();

	}

}
