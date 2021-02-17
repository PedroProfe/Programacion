package colecciones;
/**
 *La clase ArrayList implementa la l�gica para trabajar con listas gen�ricas, 
 *es decir podemos insertar y extraer elementos de cualquier parte de la lista. 
 *La diferencia del ArrayList con la clase LinkedList es la implementaci�n interna de 
 *los algoritmos. La clase LinkedList emplea una lista doblemente encadenada y la clase 
 *ArrayList utiliza un arreglo que se redimensiona en forma autom�tica seg�n se efect�an 
 *inserciones y extracciones de datos. La principal ventaja de emplear la clase ArrayList 
 *es que el acceso a un elemento de la lista es inmediato mediante el m�todo 'get', en cambio 
 *la implementaci�n del m�todo 'get' en la clase LinkedList requiere recorrer en forma secuencial 
 *la lista hasta llegar a la posici�n a buscar. 
 *Si la lista no va ha tener grandes cambios en inserciones y extracciones 
 *durante la ejecuci�n del programa es m�s com�n utilizar la clase ArrayList en lugar de LinkedList. 
 * */
public class EjemploArrayList {

	//Utilizaremos las clases Mazo y Carta
	
	public static void main(String[] args) {
		Mazo mazo = new Mazo();
        System.out.println("Mazo de cartas ordenado");
        mazo.imprimir();
        mazo.barajar();
        System.out.println("Mazo de cartas despues de barajar");
        mazo.imprimir();

	}

}
