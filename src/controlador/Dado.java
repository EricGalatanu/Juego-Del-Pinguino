package controlador;

import java.util.Random;
import java.util.Scanner;

public class Dado {

	Random r = new Random();
	Scanner s = new Scanner(System.in);

	private String tipo;
	private int valor;

	public Dado(String tipo, int valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getTipoDado () {
		return tipo;
	}
	
	public int getValorDado () {
		return valor;
	}
	
	public void setValorDado(int valor) {
		this.valor = valor;
	}
	
	public void setTipoDado(String tipo) {
		this.tipo = tipo;
	}

	

}
