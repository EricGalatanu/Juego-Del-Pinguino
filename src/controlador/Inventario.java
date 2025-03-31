package controlador;
import java.util.*;
public class Inventario {

	private ArrayList<Dado> dados;
	private int peces;
	private int bolasDeNieve;
	
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
	
	
	
	
	
	
	
	
	
}
