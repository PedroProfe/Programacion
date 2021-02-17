package colecciones;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Diferencias entre HASHTABLE Y HASHMAP
 * 
 * El HashMap solo permite un null key y cualquier cantidad de null values, 
 * en cambio un Hashtable no permite ningún null ya sea en key o en value.
 * Thread Safe, Hashtable es ideal para usarlo en aplicaciones multi threaded 
 * (multi hilos), internamente todos sus métodos son synchronized a diferencia del HashMap 
 * que no es recomendable en aplicaciones multi threaded.
 * La diferencia anterior nos lleva al performance, ¿cual tiene mejor rendimiento? Todos
 * los componentes, estructuras de datos, variables... que no sean syncronized tienen 
 * un mejor performance que las que lo son, lo que quiere decir que en cuestiones de 
 * rendimiento es mejor utilizar un HashMap.
 * Que es lo que más se utiliza, últimamente se ha usado más HashMap sobre Hashtable, 
 * eso tiene una razón, Hashtable es legacy class , y por esa razón es preferible utilizar HashMap.
 * 
 * 
 * Con el listado de nuestros constructores pasemos a ver algunos metodos disponibles:

* void clear(), resetea y limpia la tabla hash
* Object clone(), devuelve un duplicado del objeto invocador
* boolean contains(Objeto valor), devuelve verdadero si el valor informado es igual a alguno de la tabla de lo contrario devuelve falso
* boolean containsKey(Objeto clave), devuelve verdadero si la clave informada se encuentra en la tabla de lo contrario devuelve falso
* boolean containsValue(Objeto valor), devuelve verdadero si el valor informado se encuentra en la tabla de lo contrario devuelve falso
* Enumeration elements(), devuelve una enumeracion de los elementos de la tabla
* Object get(Object key), devuelve el valor asociado a la clave informada en caso contrario devuelve un valor nulo
* boolean isEmpty(), devuelve verdadero en caso de que la tabla este vacia y si posee aunque sea un elemento (clave o valor) devuelve falso
* Enumeration keys(), devuelve una enumeracion de todas las claves unicamente de la tabla
* Object put(Object clave, Object valor), ingresa una clave y un valor a la tabla, en caso de la clave no estar preparada devuelve un valor nulo y en caso de existir alguna devuelve el valor previo
* void rehash(), incrementa el tamaño de la tabla y resetea las valores hash de las claves
* Object remove(Object clave), remueve la clave y el valor de la clave informada, devuelve el valor asociado y en caso de no existir devuelve un valor nulo
* int size(), devuelve el numero de entradas en una tabla
* String toString(), devuelve el equivalente en cadena de una tabla hash
 * */




public class Ejemplo_Hashtable {

	public static void main(String[] args) {
		// Create a hash map
	      Hashtable<String,Alumno> alumnos = new Hashtable<String,Alumno>();
	      Enumeration names;
	      String str;
	      double bal;

	      alumnos.put("111k", new Alumno("Ana"));
	      alumnos.put("222h", new Alumno("Pepe"));
	      alumnos.put("333t", new Alumno("Juan"));
	      alumnos.put("444y", new Alumno("Carlos"));
	      alumnos.put("555z", new Alumno("Marta"));

	      // Show all balances in hash table.
	      names = alumnos.keys();
	      
	      while(names.hasMoreElements()) {
	         str = (String) names.nextElement();
	         System.out.println(str + ": " + (alumnos.get(str)).getNombre());
	      }        
	      System.out.println();
	      
	      // Deposit 1,000 into Zara's account
	      String nomb = ((Alumno)alumnos.get("222h")).getNombre();
	      alumnos.put("222h", new Alumno("Pedro"));
	      System.out.println("Nuevo Nombre para 222h: " + (alumnos.get("222h")).getNombre());

	}

}
