package coleccionesYDiccionarios;

import java.io.IOException;
import java.util.HashMap;

import utiles.Teclado;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 * 
 * @author Álvaro Leiva Toledano
 * @version 1.0
 */
public class Ejercicio10 {

	public static void main(String[] args) throws IOException {
		
		//Colección diccionario (HashMap)
		HashMap<String, String> diccionario = new HashMap<String, String>();
    
    diccionario.put("gato", "cat");
    diccionario.put("perro", "dog");
    diccionario.put("casa", "house");
    diccionario.put("carta", "card");
    diccionario.put("arbol", "tree");
    diccionario.put("rojo", "red");
    diccionario.put("amarillo", "yellow");
    diccionario.put("verde", "green");
    diccionario.put("azul", "blue");
    diccionario.put("ordenador", "computer");
    diccionario.put("raton", "mouse");
    diccionario.put("mesa", "table");
    diccionario.put("silla", "chair");
    diccionario.put("montaña", "mountain");
    diccionario.put("baloncesto", "basketball");
    diccionario.put("juego", "game");
    diccionario.put("caballo", "horse");
    diccionario.put("mar", "sea");
    diccionario.put("sonido", "sound");
    diccionario.put("musica", "music");
    
    String palabra = Teclado.leerCadena("Introduce una palabra en español y la traduzco.");
    
    if (diccionario.containsKey(palabra)) {
      System.out.print(palabra + " - " + diccionario.get(palabra));
      } else {
      System.out.print("La palabra introducida no existe en el diccionario.");
      } 
  }

}
