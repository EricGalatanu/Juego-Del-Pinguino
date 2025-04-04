package modelo;
import java.util.ArrayList;
import java.util.Random;
public class Tablero {

	private int numeroCasillas;
	private ArrayList<Evento> tableroCasillas = new ArrayList<>();

	public Tablero (int numeroCasillas) {
	this.numeroCasillas = 50;
	this.tableroCasillas = tableroCasillas;
	}

	public void setnumeroCasillas(String numeroCasillas){
		this.numeroCasillas = 50;
		}

	public int getNumeroCasillas() {
		return numeroCasillas;
	}
	
	public Tablero creacionTablero () {
		int generador = 0;
		Evento evt = null;
		int contadorOso = 0;
		Random r = new Random();
		int contadorCasillas = 0;
		int casillasVacias = 0;
		
		while (contadorCasillas < 50) {
			generador = r.nextInt(15) + 1; 
			
			
			switch (generador) {
			case 1:
				evt = new Evento(1, "Casilla vacía");
				break;
			case 2:
				
				if (contadorOso < 2) {
				evt = new Evento(2, "Oso");
				contadorOso++;
				
				} else if (casillasVacias < 25){
					evt = new Evento (1, "Casilla vacía");
					casillasVacias++;
				}
				break;
			case 3:
				evt = new Evento(3, "Agujero en el hielo");
				break;
			case 4:
				evt = new Evento (4, "Trineo");
				break;
			case 5:
				evt = new Evento (5, "Moto de Nieve");
				break;
			case 6:
				evt = new Evento (6, "Interrogante");
				break;
			case 7:
				evt = new Evento (7, "Obtener Pez");
				break;
			case 8:
				evt = new Evento (8, "Obtener bolas de nieve");
				break;
			case 9:
				evt = new Evento (9, "Obtener dado");
				break;
			default:
				if (casillasVacias < 25) {
				evt = new Evento (1, "Casilla vacía");
				casillasVacias++;
				}
			break;	
			
			
			}
			
			tableroCasillas.add(evt);
			contadorCasillas++;
			
		}
	}

	
}
