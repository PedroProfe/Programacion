package colecciones;

import java.util.LinkedList;

/**
 * La clase LinkedList implementa la lógica para trabajar con listas genéricas, 
 * es decir podemos insertar y extraer elementos de cualquier parte de la lista.
 * Confeccionaremos un programa para llamar los principales métodos de esta clase.
 * 
 * 
 * */


public class EjemploLinkedList {

	public static void imprimir(LinkedList<String> lista) {
        for (String elemento : lista)
            System.out.print(elemento + "-");
        System.out.println();
    }
	
	public static void main(String[] args) {
		LinkedList<String> lista1 = new LinkedList<String>();
        lista1.add("juan");
        lista1.add("Luis");
        lista1.add("Carlos");
        imprimir(lista1);
        lista1.add(1, "ana");
        System.out.println("esto lo vamos a sacar..." + lista1.get(2));
        imprimir(lista1);
        lista1.remove(0);
        imprimir(lista1);
        lista1.remove("Carlos");
        imprimir(lista1);
        System.out.println("Cantidad de elementos en la lista:" + lista1.size());
        if (lista1.contains("ana"))
            System.out.println("El nombre 'ana' si esta almacenado en la lista");
        else
            System.out.println("El nombre 'ana' no esta almacenado en la lista");
        System.out.println("El segundo elemento de la lista es:" + lista1.get(1));
        lista1.clear();
        if (lista1.isEmpty())
            System.out.println("La lista se encuentra vacía");
    }

}
