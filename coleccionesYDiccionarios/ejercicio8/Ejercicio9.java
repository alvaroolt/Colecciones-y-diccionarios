package coleccionesYDiccionarios.ejercicio8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Modifica el programa anterior de tal forma que las cartas se muestren
 * ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros.
 * Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota,
 * caballo, rey
 * 
 * @author Álvaro Leiva Toledano
 * @version 0.9
 */
public class Ejercicio9 extends Ejercicio8 {

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

		// Ordena las 10 cartas y las muestra.
		Collections.sort(descarte);
		System.out.println("Nuestras 10 cartas ordenadas son: ");
		for (Carta i : descarte) {
			System.out.println(i);
		}
	}
}