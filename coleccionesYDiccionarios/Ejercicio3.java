package coleccionesYDiccionarios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import utiles.Teclado;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y
 * almacenados en un objeto de la clase ArrayList.
 * 
 * @author Álvaro Leiva Toledano
 * @version 1.0
 */
public class Ejercicio3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// Colección numeros.
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			numeros.add(Teclado.leerEntero("Introduce el valor nº" + i + ":"));
		}

		System.out.println("ArrayList sin ordenar: " + numeros);
		
		Collections.sort(numeros);
		
		System.out.println("ArrayList ordenado: " + numeros);

	}

}