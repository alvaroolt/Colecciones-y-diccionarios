package coleccionesYDiccionarios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import utiles.Teclado;

/**
 * Realiza un programa que escoja al azar 5 palabras en español del
 * minidiccionario del ejercicio anterior. El programa irá pidiendo que el
 * usuario teclee la traducción al inglés de cada una de las palabras y
 * comprobará si son correctas. Al final, el programa deberá mostrar cuántas
 * respuestas son válidas y cuántas erróneas.
 * 
 * @author Álvaro Leiva Toledano
 * @version 1.0
 */
public class Ejercicio11 {

	public static void main(String[] args) throws IOException {

		// Colección diccionario (HashMap)
		HashMap<String, String> diccionario = new HashMap<String, String>();

		ArrayList<String> copiaDiccionario = new ArrayList<String>();

		// Colección palabrasAleatorias, donde se almacenarán las 5 palabras en español.
		ArrayList<String> palabrasAleatorias = new ArrayList<String>();

		int aciertos = 0;
		int fallos = 0;

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

		//se añaden todas los valores de diccionario a copiaDiccionario mediante su clave
		copiaDiccionario.addAll(diccionario.keySet());
		Collections.shuffle(copiaDiccionario); //se randomiza el orden

		for (int i = 1; i < 6; i++) {
			palabrasAleatorias.add(copiaDiccionario.remove(0));
		}

		for (String i : palabrasAleatorias) {

			String respuesta = "";
			respuesta = Teclado.leerCadena("Introduzca la traducción de la palabra " + i + ": ");
			if (respuesta.contains(diccionario.get(i))) {
				aciertos++;
			} else {
				fallos++;
			}
		}
		System.out.println("Has acertado " + aciertos + " palabras y has fallado " + fallos + " palabras.");
	}

}
