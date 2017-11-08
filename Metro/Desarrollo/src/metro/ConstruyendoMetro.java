package metro;

import java.io.File;

public class ConstruyendoMetro {

	public static void main(String[] args) {

		File archIn = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\Metro\\Preparación de la prueba\\Lote de prueba\\01_EjemploDado.in");
		File archOut = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\Metro\\Ejecución de la prueba\\Salida Obtenido\\01_EjemploDado.out");
		
		Ciudad c1 = new Ciudad(archIn, archOut);
		c1.resolver();
	}
}
