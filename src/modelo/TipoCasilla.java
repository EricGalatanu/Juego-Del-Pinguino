package modelo;

public class TipoCasilla extends Casilla {

	private String pinguino;
	private String oso;
	private String agujero;
	private String interrogante;
	private String sueloQuebradizo;

	public TipoCasilla (String tipo, int id,String pinguino, String oso, String agujero, String interrogante, String sueloQuebradizo) {
	super(tipo,id);
	this.pinguino = pinguino;
	this.oso = oso;
	this.agujero = agujero;
	this.interrogante = interrogante;
	this. sueloQuebradizo = sueloQuebradizo;
	}
	
	public String getPinguino() {
		return pinguino;
	}

	public void setPinguino(String pinguino){
		this.pinguino = pinguino;
	}

	public String getOso() {
		return oso;
	}

	public void setOso(String oso){
		this.oso = oso;
	}

	public String getAgujero() {
		return agujero;
	}

	public void setAgujero(String agujero){
		this.agujero = agujero;
	}

	public String getInterrogante() {
		return interrogante;
	}

	public void setInterrogante(String interrogante){
		this.interrogante = interrogante;
	}

	public String getSueloQuebradizo() {
		return sueloQuebradizo;
	}

	public void setSueloQuebradizo(String sueloQuebradizo){
		this.sueloQuebradizo = sueloQuebradizo;
	}
}
