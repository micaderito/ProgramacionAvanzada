package caosEnvasadora;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Envasadora envasar = new Envasadora("PATH DEL ARCHIVO");
		envasar.resolver();
	}

}
