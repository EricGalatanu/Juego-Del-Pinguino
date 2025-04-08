package controlador;

import java.util.*;

public class Inventario {

	private ArrayList<Dado> dados;
	private int peces;
	private int bolasDeNieve;

	Random r = new Random();

	public Inventario(ArrayList<Dado> dados, int peces, int bolasDeNieve) {
		this.dados = dados;
		this.peces = peces;
		this.bolasDeNieve = bolasDeNieve;
	}

	public ArrayList<Dado> getDados() {
		return dados;
	}

	public void setDados(ArrayList<Dado> dados) {
		this.dados = dados;
	}

	public int getPeces() {
		return peces;
	}

	public void setPeces(int peces) {
		this.peces = peces;
	}

	public int getBolasDeNieve() {
		return bolasDeNieve;
	}

	public void setBolasDeNieve(int bolasDeNieve) {
		this.bolasDeNieve = bolasDeNieve;
	}

	public void obtenerPescado(Inventario inventarioJugador) {

		if (inventarioJugador.peces < 2) {
			peces++;
			if (inventarioJugador.peces == 1) {
				System.out.println("Has obtenido un pez! Tienes " + peces + " pez en el inventario");
			} else {
				System.out.println("Has obtenido un pez! Tienes " + peces + " peces en el inventario");
			}

		} else {
			System.out.println("Tienes el máximo de peces permitidos, no se ha añadido el pez al inventario.");
		}
	}

	public void obtenerBolasdeNieve(Inventario inventarioJugador) {

		int generador = r.nextInt(3) + 1;

		// Muestra cuantas bolas se han obtenido.
		if (generador == 1) {
			System.out.println("Has obtenido una bola de nieve!");
		} else {
			System.out.println("Has obtenido " + generador + " bolas de nieve!");
		}

		// Verifica si tiene el máximo de bolas permitidas.
		if (inventarioJugador.bolasDeNieve >= 6) {
			System.out.println("Tienes el máximo de bolas de nieve permitidas.");
		} else {
			// Calcula el total después de agregar las bolas generadas.
			int bolasTotales = inventarioJugador.bolasDeNieve + generador;

			// Si el total excede el permitido lo actualiza a 6.
			if (bolasTotales >= 6) {
				inventarioJugador.bolasDeNieve = 6;
				System.out.println("Tienes el máximo de bolas de nieve permitidas.");

			} else {
				// Si no excede el total se añaden las generadas y nada más.
				inventarioJugador.bolasDeNieve = bolasTotales;
			}

			if (inventarioJugador.bolasDeNieve == 1) {
				System.out.println("Tienes 1 bola de nieve en el inventario.");

			} else {
				// Fuera del bucle y una vez actualizado se muestra el total de bolas
				System.out.println("Tienes " + inventarioJugador.bolasDeNieve + " bolas de nieve en el inventario.");
			}

		}

	}

	public static void main(String[] args) {

		Inventario invJugador = new Inventario(null, 2, 0);

		invJugador.obtenerBolasdeNieve(invJugador);


	}

}
