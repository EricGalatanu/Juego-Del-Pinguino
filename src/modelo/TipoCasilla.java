package modelo;
import java.util.Random;

public class TipoCasilla extends Casilla {

	private String pinguino;
	private String oso;
	private String agujero;
	private String interrogante;
	private String sueloQuebradizo;
	private String trineo;
	private int ultimaPosicion;

	public TipoCasilla (String tipo, int id,String pinguino, String oso, String agujero, String interrogante, String sueloQuebradizo,String trineo, int ultimaPosicion) {
	super(tipo,id);
	this.pinguino = pinguino;
	this.oso = oso;
	this.agujero = agujero;
	this.interrogante = interrogante;
	this.sueloQuebradizo = sueloQuebradizo;
	this.trineo = trineo;
	this.ultimaPosicion = ultimaPosicion;
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
	
	public String getTrineo() {
		return trineo;
	}
	
	public void setTrineo(String trineo) {
		this.trineo = trineo;
	}
	
	public int getUltimaPosicion() {
		return ultimaPosicion;
	}
	
	public void setUltimaPosicion(int ultimaPosicion) {
		this.ultimaPosicion = ultimaPosicion;
	}
	
	public void casillaOso(Pinguino pinguino,Inventario inventarioJugador) {
		System.out.println("¡Jugador" + pinguino.getNombre() + "se ha encontrado a un oso!");
		
		if (inventarioJugador.peces > 1) {
			System.out.println("¡Jugador +" + pinguino.getNombre() + "ha usado un pez para sobornar al oso!" );
			inventarioJugador.peces--;
		} else {
			pinguino.setPosicion(0);
		}
	}

	public void casillaAgujero (Pinguino pinguino) {
		System.out.println("¡Jugador" + pinguino.getNombre() + "ha caido en un agujero de hielo!");
		pinguino.setPosicion(ultimaPosicion);
	}
	
	public void actualizaUltimaPosicio(int Posicion) {
        this.ultimaPosicion = Posicion;
    }
	
	public static Pinguino accionInterrogante(Pinguino pingu) {
	
		Random random = new Random();
		
		System.out.println("¡Jugador " + pingu.getNombre() + " ha activado una casilla de interrogante!");

		int esdeveniment = 0;
        switch (esdeveniment) { 
            case 0:
                System.out.println("¡Jugador " + pingu.getNombre() + "ha obtenido un pez!");
                pingu.inv.obtenerPescado(pingu.inv);
                break;
            case 1:
                System.out.println("¡Jugador " + pingu.getNombre() + "ha obtenido una/s bola de nieve!");
                pingu.inv.obtenerBolasdeNieve(pingu.inv);
                break;
            case 2:
            	
            	if(pingu.inv.getDados() < 3) { 
            	int  dados = random.nextInt(10) + 1;
            	
            	switch (dados) {
            	case 1:
            		 System.out.println("Jugador " + pingu.getNombre() + "ha obtenido un dado rápido");
                     pingu.inv.dadorapido++;
                     break;
            	case 2:
            		System.out.println("Jugador " + pingu.getNombre() + "ha obtenido un dado rápido");
                    pingu.inv.dadorapido++;
                    break;
            	case 3 :
            		System.out.println("Jugador " + pingu.getNombre() + "ha obtenido un dado rápido");
            		pingu.inv.dadorapido++;
                    break;
            	default:
            		System.out.println("Jugador " + pingu.getNombre() + "ha obtenido un dado lento");
                    pingu.inv.dadoLento++;
                    break;
            	}
            	} else {
            		System.out.println("No se ha añadido un dado al inventario, ya posees el máximo de dados permitido.");
            		break;
            	}
               break;      	
        }
		return pingu;
	}
	
	public void accionTrineo(Pinguino pinguino) {
		System.out.println("¡Jugador " + pinguino.getNombre() + "se ha montando en un trineo!");
	}
}
