package modelo;
import java.util.ArrayList;
import java.util.Random;
import controlador.*;
public class TipoCasilla extends Casilla {

	private String pinguino;
	private String oso;
	private String agujero;
	private String interrogante;
	private String sueloQuebradizo;
	private String trineo;

	public TipoCasilla (String tipo, int id,String pinguino, String oso, String agujero, String interrogante, String sueloQuebradizo,String trineo) {
	super(tipo,id);
	this.pinguino = pinguino;
	this.oso = oso;
	this.agujero = agujero;
	this.interrogante = interrogante;
	this.sueloQuebradizo = sueloQuebradizo;
	this.trineo = trineo;
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
	
	public Pinguino casillaOso(Pinguino pingu) {
		int pecesJugador = pingu.getInventario().getPeces();
		System.out.println("¡" + pingu.getNombre() + " se ha encontrado a un oso!");
		
		if (pingu.getInventario().getPeces() > 1) {
			System.out.println("¡Jugador +" + pingu.getNombre() + "ha usado un pez para sobornar al oso!" );
			pingu.getInventario().setPeces(pecesJugador - 2);;
		} else {
			pingu.setPosicion(0);
		}
		
		return pingu;
	}

	public Pinguino casillaAgujeroHielo (Pinguino pingu, ArrayList<Evento> casillas) {
		int agujeroActual = pingu.getPosicion();
		int agujeroAnterior = 0;
		boolean agujeroAnteriorEncontrado = false;
		if (agujeroActual > 0 && casillas.get(agujeroActual).getIDEvento() == 3) {
			System.out.println("Has caído en un agujero de hielo!");
			for (int j = agujeroActual - 1; j >= 0; j--) {
				if (!agujeroAnteriorEncontrado && casillas.get(j).getIDEvento() == 3) {
					agujeroAnterior = j;
					agujeroAnteriorEncontrado = true;
				} 
	
			}
		}
	
	
	if (agujeroAnteriorEncontrado && agujeroAnterior != 0) {
		System.out.println("Has retrocedido " + (agujeroActual - agujeroAnterior) + " casillas :(");
		pingu.setPosicion(agujeroAnterior);
	} else if (agujeroAnterior == 0){
		System.out.println("No se ha encontrado ningún agujero anterior a este, no has sido penalizado");
	}
		return pingu;
	}
	
	public Pinguino casillaTrineo (Pinguino pingu, ArrayList<Evento> casillas) {
		int trineoActual = pingu.getPosicion();
		int trineoSiguiente = 0;
		boolean trineoPosteriorEncontrado = false;
		
		if (trineoActual > 0 && casillas.get(trineoActual).getIDEvento() == 4) {
			System.out.println("Has caído en un trineo!");
			for (int j = trineoActual + 1; j < casillas.size(); j++) {
				if (!trineoPosteriorEncontrado && casillas.get(j).getIDEvento() == 4) {
					trineoSiguiente = j;
					trineoPosteriorEncontrado = true;
				}

			}
		}

		if (trineoPosteriorEncontrado && trineoSiguiente != 0) {

			System.out.println("Has avanzado " + (trineoSiguiente - trineoActual) + " casillas!");
			pingu.setPosicion(trineoSiguiente); 
		} else if (trineoSiguiente == 0) {
			System.out.println("No se ha encontrado ningún trineo posterior a este, no has avanzado ninguna casilla");
		}

		
			
		return pingu;
	}
	
	public static Pinguino accionInterrogante(Pinguino pingu) {
	
		Random random = new Random();
		
		System.out.println("¡Jugador " + pingu.getNombre() + " ha activado una casilla de interrogante!");

		int esdeveniment = 0;
        switch (esdeveniment) { 
            case 0:
                System.out.println("¡Jugador " + pingu.getNombre() + "ha obtenido un pez!");
                pingu.obtenerPescado(pingu);
                break;
            case 1:
                System.out.println("¡Jugador " + pingu.getNombre() + "ha obtenido una/s bola de nieve!");
                pingu.obtenerBolasdeNieve(pingu.inv);
                break;
            case 2:
 
            	if(pingu.getInventario().getDados() < 3) { 
            	int  dados = random.nextInt(10) + 1;
            	
            	switch (dados) {
            	case 1:
            		 System.out.println("Jugador " + pingu.getNombre() + "ha obtenido un dado rápido");
                     if (pingu.getInventario().getDados() >= 3) {
                    	 System.out.println("No se pueden añadir más dados al inventario");
                     } else {
                    	 
                     }
                     break;
            	case 2:
            		System.out.println("Jugador " + pingu.getNombre() + "ha obtenido un dado rápido");
            		if (pingu.getInventario().getDados() >= 3) {
                   	 System.out.println("No se pueden añadir más dados al inventario");
                    } else {
                    	pingu.getInventario().setDados(pingu.getInventario().getDadosR() + 1);
                    	pingu.getInventario().setDados(pingu.getInventario().getDados() + 1);
                    }
                    break;
            	case 3 :
            		System.out.println("Jugador " + pingu.getNombre() + "ha obtenido un dado rápido");
            		if (pingu.getInventario().getDados() >= 3) {
                      	 System.out.println("No se pueden añadir más dados al inventario");
                       } else {
                       	pingu.getInventario().setDadosR(pingu.getInventario().getDadosR() + 1);
                       	pingu.getInventario().setDados(pingu.getInventario().getDados() + 1);
                       }
                    break;
            	default:
            		System.out.println("Jugador " + pingu.getNombre() + "ha obtenido un dado lento");
            		if (pingu.getInventario().getDados() >= 3) {
                   	 System.out.println("No se pueden añadir más dados al inventario");
                    } else {
                    	pingu.getInventario().setDadosL(pingu.getInventario().getDadosL() + 1);
                       	pingu.getInventario().setDados(pingu.getInventario().getDados() + 1);
                    }
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
	
	public Pinguino obtenerPescado(Pinguino pingu) {
		
		int pecesJugador = pingu.getInventario().getPeces();
		if (pecesJugador < 2) {
			pingu.getInventario().setPeces(pecesJugador + 1);
			if (pingu.getInventario().getPeces() == 1) {
				System.out.println("Has obtenido un pez! Tienes " + pingu.getInventario().getPeces() + " pez en el inventario");
			} else {
				System.out.println("Has obtenido un pez! Tienes " + pingu.getInventario().getPeces() + " peces en el inventario");	
			}
			
		} else {
			System.out.println("Tienes el máximo de peces permitidos, no se ha añadido el pez al inventario.");
		}

		return pingu;
		
	}
	
	public boolean comprobarCasilla (Pinguino pingu, ArrayList<Evento> casillas, int idEvento) {
		int posicion = pingu.getPosicion();
		 if (posicion > 0 && posicion < casillas.size()) {
		        return casillas.get(posicion).getIDEvento() == idEvento;
		    }
		    return false;
	}
}
