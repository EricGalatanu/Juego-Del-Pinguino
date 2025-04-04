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
		
		if(inventarioJugador.bolasDeNieve < 6) {
			bolasDeNieve += generador;
			if(inventarioJugador.bolasDeNieve == 1) {
				System.out.println("Has obtenido una bola de nieve! Tienes " + bolasDeNieve + " bola de nieve en el inventario");
			} else {
				System.out.println("Has obtenido " + generador + " bolas de nieve! Tienes " + bolasDeNieve + " bolas de nieve en el inventario");
			}
		} else {
			System.out.println("Tienes el máximo de bolas de nieve permitidas, no se ha añadido la bola de nieve al inventario");
		}
	}
	
//	public static void main(String[] args) {
//		Inventario invJugador = new Inventario(null, 2, 0);
//		
//		invJugador.obtenerBolasdeNieve(invJugador);
//		
//		System.out.println(invJugador.getBolasDeNieve());
//	}

}
