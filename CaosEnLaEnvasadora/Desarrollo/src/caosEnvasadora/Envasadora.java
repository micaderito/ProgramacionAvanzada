package caosEnvasadora;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Envasadora {

	private ArrayList<String> list = new ArrayList<String>();
			
	public Envasadora(String arch) throws FileNotFoundException {
		procesarArchivo(arch);
	}
	
	private void procesarArchivo(String entrada) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(entrada));
		Boolean leer = true;
		while(leer) {
			String letra = sc.next();
			if(letra == "F")
				leer=false;
			else {
				list.add(letra);
			}
		}
		sc.close();
	}
	
	public void resolver() {
		//while()
	}
}
