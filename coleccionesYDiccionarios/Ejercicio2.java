package coleccionesYDiccionarios;

import java.util.ArrayList;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
 * entre 10 y 20 elementos ambos inclusive.
 * 
 * @author Álvaro Leiva Toledano
 * @version 1.0
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		/*
		 * Colección numerosAleatorios
		 */
		ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();

		int suma = 0;
		int media = 0;
		int max = 0;
		int min = 100;
		int cantidadIndices = (int) (Math.random() * 11 + 10); // tamaño arraylist

		// Recorre el arraylist a su vez que le añade valores en los índices.
		for (int i = 0; i < cantidadIndices; i++) {
			numerosAleatorios.add((int) (Math.random() * 101));
		}

		System.out.println("Este es el arraylist de números aleatorios: ");
		System.out.println(numerosAleatorios + "\n");

		for (int n : numerosAleatorios) {
			suma += n;
		}

		media = suma / cantidadIndices;

		System.out.println("Sumatorio = " + suma);
		System.out.println("Media = " + media);

		// este for se encarga de averigar cuál de los valores del arraylist es el mayor
		// y cuál es el menor.
		for (int i : numerosAleatorios) {
			if (i > max) {
				max = i;
			}

			if (i < min) {
				min = i;
			}
		}
		System.out.println();
		System.out.println("Mínimo = " + min);
		System.out.println("Máximo = " + max);
	}

}
