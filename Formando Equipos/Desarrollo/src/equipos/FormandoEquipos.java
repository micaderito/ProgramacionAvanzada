package equipos;

import java.io.File;

public class FormandoEquipos {

	public static void main(String[] args) {
		
		File archIn = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\Formando Equipos\\Preparaci�n de Prueba\\Lote de Prueba\\Entrada\\08_CasoFatiga2.in");
		File archOut = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\Formando Equipos\\Ejecuci�n de Prueba\\Salida Obtenida\\08_CasoFatiga2.out");
		
		Coincidencia c1 = new Coincidencia(archIn,archOut);
		c1.resolver();
	}
	
}
