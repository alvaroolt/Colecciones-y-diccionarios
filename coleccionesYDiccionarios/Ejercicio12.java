package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;

import coleccionesYDiccionarios.ejercicio8.Carta;
import coleccionesYDiccionarios.ejercicio8.Figuras;
import coleccionesYDiccionarios.ejercicio8.Palos;

/**
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser
 * una estructura de la clase ArrayList que contiene objetos de la clase Carta.
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo
 * → 3, rey → 4; el resto de cartas no vale nada. Ejemplo: as de oros cinco de
 * bastos caballo de espadas sota de copas tres de oros Tienes 26 puntos
 * 
 * @author Álvaro Leiva Toledano
 * @version
 */
public class Ejercicio12 {

	public static void main(String[] args) {

		int puntosTotales = 0;

		// EnumMap recoge las figuras junto a su valor (puntos).
		EnumMap<Figuras, Integer> valorFigura = new EnumMap<Figuras, Integer>(Figuras.class);

		ArrayList<Carta> baraja = new ArrayList<Carta>();
		ArrayList<Carta> descarte = new ArrayList<Carta>();

		// Añadimos elementos dentro de nuestro diccionario asignando a cada carta su
		// valor con la ayuda de la enumeración.
		valorFigura.put(Figuras.AS, 11);
		valorFigura.put(Figuras.DOS, 0);
		valorFigura.put(Figuras.TRES, 10);
		valorFigura.put(Figuras.CUATRO, 0);
		valorFigura.put(Figuras.CINCO, 0);
		valorFigura.put(Figuras.SEIS, 0);
		valorFigura.put(Figuras.SIETE, 0);
		valorFigura.put(Figuras.SOTA, 2);
		valorFigura.put(Figuras.CABALLO, 3);
		valorFigura.put(Figuras.REY, 4);

		// Ciclo que genera la baraja.
		for (Figuras figura : Figuras.values()) {
			for (Palos palo : Palos.values()) {
				baraja.add(new Carta(figura, palo));
			}
		}

		// Randomizo la baraja de cartas
		Collections.shuffle(baraja);

		// For que obtiene las 5 cartas aleatorias
		for (int i = 1; i < 6; i++) {
			descarte.add(baraja.remove(0));
		}

		
		for (Carta carta : descarte) {
			System.out.println(carta);
			puntosTotales += valorFigura.get(carta.getFigura());
		}
		System.out.println("\nPuntos totales: " + puntosTotales);
	}

}