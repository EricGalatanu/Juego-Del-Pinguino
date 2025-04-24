package vista;
import java.sql.*;
import controlador.Inventario;
import controlador.bbdd;
import modelo.Pinguino;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		bbdd.conectarBaseDatos(con);
		Pinguino pingu = new Pinguino ("", "", 1, 0, null, "");
		Inventario inv = new Inventario (0, 0, 0, 0, 0);
		
		//Creación pinguino
		pingu.crearPinguino(pingu, con);
		
		
	}

}
