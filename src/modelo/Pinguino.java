package modelo;

public class Pinguino {


private String nombre;
	public String color;
	public int posicion;
	public String inventario;
	public String tipo;
	
	public Pinguino (String nombre, String color, int posicion, String inventario, String tipo) {
		this.nombre = nombre;
		this.color = color;
		this.posicion = posicion;
		this.inventario = inventario;
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
	
	public String getInventario() {
		return inventario;
	}
	
	public void setInventario(String inventario) {
		this.inventario = inventario;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
