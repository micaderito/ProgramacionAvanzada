package metro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import edu.unlam.pa.LecturaArchivo;

public class Ciudad extends LecturaArchivo{

	private int cantIslas;
	private int tuneles;
	private int puentes;
	private Grafo planos;
	private int cantMinPuentes;
	
	
	public Ciudad(File entrada, File salida) {
		super(entrada, salida);
		procesarEntrada(entrada);
	}

	private void procesarEntrada(File entrada) {
		try {
			Scanner sc = new Scanner(entrada);
			cantIslas = sc.nextInt();
			tuneles = sc.nextInt();
			puentes = sc.nextInt();
			planos = new Grafo(cantIslas);
			for(int i= 0; i<tuneles; i++) {
				planos.agregarArista(sc.nextInt()-1, sc.nextInt()-1, 0);
			}
			for(int i= 0; i<puentes;i++) {
				planos.agregarArista(sc.nextInt()-1, sc.nextInt()-1, 1);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el archivo");
		}		
	}

	@Override
	public void resolver() {
//		cantMinPuentes = planos.prim();
		cantMinPuentes = planos.kruskal();
		procesarSalida(salida);		
	}

	private void procesarSalida(File salida) {
		try {
			PrintWriter pw = new PrintWriter(salida);
			pw.println(cantMinPuentes);
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error al guardar archivo");
		}
		
		
	}
	
	

}
