package colecciones;

import java.util.HashMap;
import java.util.Map;

/**
 *https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=70&codigo=148&inicio=60
 *
 * Esta clases: HashMap, TreeMap y LinkedHashMap nos permite almacenar elementos 
 * asociando a cada clave un valor. 
 * Para cada clave tenemos un valor asociado. Podemos después buscar fácilmente 
 * un valor para una determinada clave. Las claves en el diccionario no pueden repetirse.

 *	Algunos ejemplos donde podríamos usar un Mapa:

 *	Guardar en la clave las extensiones de archivos y en el valor los nombres de archivos que lo pueden abrir
 *	En una agenda podemos guardar como 'clave' la fecha y hora y las actividades en el 'valor'.
 * 
 *  Problema: 
 *  Almacenar un diccionario las palabras en castellano como 'clave' y las traducciones 
 *  de las mismas en el 'valor'. 
 *  Probar los métodos más significativos de la clase HashMap.
 * */
public class Ejemplo_HashMap_TreeMap_LinkedHashMap {

	public static void main(String[] args) {
		 Map<String, String> mapa1 = new HashMap<String, String>();
	        mapa1.put("rojo", "red");
	        mapa1.put("verde", "green");
	        mapa1.put("azul", "blue");
	        mapa1.put("blanco", "white");
	        System.out.println("Listado completo de valores");
	        for (String valor : mapa1.values())
	            System.out.print(valor + "-");
	        System.out.println();
	        System.out.println("Listado completo de claves");
	        for (String clave : mapa1.keySet())
	            System.out.print(clave + "-");
	        System.out.println();
	        System.out.println("La traducción de 'rojo' es:" + mapa1.get("rojo"));
	        if (mapa1.containsKey("negro"))
	            System.out.println("No existe la clave 'negro'");
	        System.out.println("La traducción de 'marron' es:" + mapa1.getOrDefault("marrón", "No existe la clave marrón"));
	        mapa1.remove("rojo");
	        System.out.println(mapa1);

	}

}
