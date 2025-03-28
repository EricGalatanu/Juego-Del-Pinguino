package controlador;
import java.util.Random;
import java.util.Scanner;
public class Dado {

	private String tipo;
	private int valor; 
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	 public Dado (String tipo, int valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	
	
}
