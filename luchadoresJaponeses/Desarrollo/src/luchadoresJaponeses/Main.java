package luchadoresJaponeses;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File archIn = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\luchadoresJaponeses\\Preparación de la prueba\\Lote de prueba\\Entrada\\entrada03.in");
		File archOut = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\luchadoresJaponeses\\Ejecucion de la prueba\\Salida obtenida\\salida03.out");
				
		Torneo t1 = new Torneo(archIn,archOut);
		t1.resolver();
	}

}
