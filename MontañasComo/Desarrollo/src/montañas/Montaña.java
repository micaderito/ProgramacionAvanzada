package monta�as;

import java.io.File;
import java.io.FileNotFoundException;

public class Monta�a {

		public static void main(String[] args) throws FileNotFoundException {

			File archIn = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\Monta�asComo\\Preparaci�n de la prueba\\Lote de prueba\\Entrada\\01_casoprueba.in");
			File archOut = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\Monta�asComo\\Ejecuci�n de la prueba\\Salida Obtenida\\01_casoprueba.out");
			
			Recorrido r = new Recorrido(archIn, archOut);
			r.resolver();
		}
}