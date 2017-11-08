package montañas;

import java.io.File;
import java.io.FileNotFoundException;

public class Montaña {

		public static void main(String[] args) throws FileNotFoundException {

			File archIn = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\MontañasComo\\Preparación de la prueba\\Lote de prueba\\Entrada\\01_casoprueba.in");
			File archOut = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\MontañasComo\\Ejecución de la prueba\\Salida Obtenida\\01_casoprueba.out");
			
			Recorrido r = new Recorrido(archIn, archOut);
			r.resolver();
		}
}