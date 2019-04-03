package coleccionesYDiccionarios.ejercicio8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Álvaro Leiva Toledano
 * @version 1.0
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		// Coleccióon baraja, donde se encuentran todas las cartas.
		ArrayList<Carta> baraja = new ArrayList<Carta>();

		// Colección descarte, son las cartas que sacamos de la baraja y se encuentran
		// en nuestra mano
		ArrayList<Carta> descarte = new ArrayList<Carta>();

		// Crea las cartas con las enumeraciones Figuras y Palos, y las añaden al
		// arraylist baraja
		for (Figuras figura : Figuras.values()) {
			for (Palos palo : Palos.values()) {
				baraja.add(new Carta(figura, palo));
			}
		}

		// shuffle reordena la lista de manera aleatoria (baraja la baraja).
		Collections.shuffle(baraja);

		// Obtener 10 cartas
		for (int i = 1; i <= 10; i++) {
			descarte.add(baraja.remove(0)); // 0 porque cogemos la carta de más arriba, es decir, el inicio (primer índice)
		}

		// Mostrar la mano con las 10 cartas
		for (Carta i : descarte) {
			System.out.println(i);
		}
	}
}