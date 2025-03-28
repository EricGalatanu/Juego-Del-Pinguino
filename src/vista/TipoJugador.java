package vista;

public class TipoJugador {

	private String humano;
	private String cpu;
	
	public TipoJugador (String humano, String cpu) {
		this.humano = humano;
		this.cpu = cpu;
	}
	
	public String getHumano() {
		return humano;
	}
	
	public void setHumano(String humano) {
		this.humano = humano;
	}
	
	
	public String getCpu() {
		return cpu;
	}
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}	
}
