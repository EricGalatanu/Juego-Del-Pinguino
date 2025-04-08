package modelo;

import java.util.Scanner;

import testRepte.Inventario;
import testRepte.Pinguino;

public class Pinguino {

private String nombre;
	public String color;
	public int posicion;
	private int id;
	public Inventario inv;
	public String tipo;
	
	public Pinguino (String nombre, String color, int id, int posicion, Inventario inv, String tipo) {
		this.nombre = nombre;
		this.color = color;
		this.id = id;
		this.posicion = 0;
		this.inv = inv;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getColor() {
		return color;
	}
	
	public void  setColor(String color) {
		this.color = color;
	}
	
	public int getPosicion() {
		return posicion;
	}
	
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Pinguino crearPinguino(Pinguino pingu) {
		Scanner s = new Scanner(System.in);
		int identificador = 1;
		String nombre = "";
		String color = "";
		int posicion = 0;
		Inventario inv = new Inventario(0, 0, 0);
		String tipo = "Jugador";
		System.out.println("Introduzca su nombre");
		nombre = s.nextLine();
		System.out.println("Introduzca el color de su pingüino");
		color = s.nextLine();

		pingu.setNombre(nombre);
		pingu.setColor(color);
		pingu.setId(identificador);
		pingu.setPosicion(posicion);
		pingu.setInventario(inv);
		pingu.setTipo(tipo);

		System.out.println("Se ha creado su pingüino correctamente!");
		
		return pingu;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Inventario getInv() {
		return inv;
	}

	public void setInv(Inventario inv) {
		this.inv = inv;
	}

	public void avanzar() {
		this.posicion++;
	}
	
	public void retroceder() {
		this.posicion--;
	}
	
}