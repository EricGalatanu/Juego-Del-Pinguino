package controlador;

public class Evento {

	private int idEvento;
	private String infoEvento;
	
	public Evento (int idEvento, String infoEvento) {
		this.idEvento = idEvento;
		this.infoEvento = infoEvento;
	
	}
	
	public int getIDEvento() {
		return idEvento;
	}

	public String getInfoEvento() {
		return infoEvento;
	}

	public void setIDEvento(int idEvento) {
		this.idEvento = idEvento;
	}
		
	public void setInfoEvento(String infoEvento) {
		this.infoEvento = infoEvento;
	}
					
	public void obtenerPez(Pinguino pingu,Inventario inv) {
		pingu.inv.obtenerPescado(inv);
	}
					
	public void obtenerBolasDeNieve(Pinguino pingu, Inventario inv) {
		pingu.inv.obtenerBolasdeNieve(inv);
	}
					
				
}