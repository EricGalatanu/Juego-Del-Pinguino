package modelo;

public class Pinguino {

private String nombre;
	public String color;
	public int posicion;
	public Inventario inv;
	public String tipo;
	
	public Pinguino (String nombre, String color, int posicion, Inventario inv, String tipo) {
		this.nombre = nombre;
		this.color = color;
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
	
	public String getInventario() {
		return inv;
	}
	
	public void setInventario(Inventario inv) {
		this.inv = inv;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void avanzar() {
		this.posicion++;
	}
	
	public void retroceder() {
		this.posicion--;
	}
	
}