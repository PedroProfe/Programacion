package colecciones;
/**
 *La clase ArrayList implementa la lógica para trabajar con listas genéricas, 
 *es decir podemos insertar y extraer elementos de cualquier parte de la lista. 
 *La diferencia del ArrayList con la clase LinkedList es la implementación interna de 
 *los algoritmos. La clase LinkedList emplea una lista doblemente encadenada y la clase 
 *ArrayList utiliza un arreglo que se redimensiona en forma automática según se efectúan 
 *inserciones y extracciones de datos. La principal ventaja de emplear la clase ArrayList 
 *es que el acceso a un elemento de la lista es inmediato mediante el método 'get', en cambio 
 *la implementación del método 'get' en la clase LinkedList requiere recorrer en forma secuencial 
 *la lista hasta llegar a la posición a buscar. 
 *Si la lista no va ha tener grandes cambios en inserciones y extracciones 
 *durante la ejecución del programa es más común utilizar la clase ArrayList en lugar de LinkedList. 
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
