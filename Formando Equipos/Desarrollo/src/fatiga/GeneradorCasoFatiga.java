package fatiga;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class GeneradorCasoFatiga {
	
	public static void main(String[] args) {
		List<String> letras = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n",
									"o","p","q","r","s","t","u","v","w","x","y","z");
		
		try {
			PrintWriter pw = new PrintWriter(new File("C:\\Users\\Facundo\\Desktop\\Formando Equipos\\Preparación de Prueba\\Lote de Prueba\\Entrada\\08_CasoFatiga2.in"));
			pw.println(50);
			pw.println(100);
			for(int i=0;i<100;i++) {
				String aux = "";
				for(int j=0;j<50;j++) {
					aux+=letras.get((int) (Math.random()*(0-letras.size())+letras.size()));
				}
				pw.println(aux);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error al crear Caso Fatiga");
		}
	}

}
