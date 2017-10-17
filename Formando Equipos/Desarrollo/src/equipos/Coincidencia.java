package equipos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Coincidencia extends EjercicioOIA{
	
	private int cantColaboradores;
	private int cantPreguntas;
	private ArrayList<String> respuestas;
	private LinkedHashSet<String> subcadenas;
	private int[] cantCoincidencias;
	private String mayor;
	private int posMayor;
	
	
	public Coincidencia(File entrada, File salida) {
		super(entrada, salida);
		procesarEntrada(entrada);
	}


	private void procesarEntrada(File entrada) {
		try {
			Scanner sc = new Scanner(entrada);
			cantPreguntas = sc.nextInt();
			cantColaboradores = sc.nextInt();
			respuestas = new ArrayList<String>();
			subcadenas = new LinkedHashSet<String>();
			for(int i = 0;i<cantColaboradores; i++) {
				respuestas.add(sc.next());
			}
			cantCoincidencias = new int[cantColaboradores];
			sc.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error al leer el archivo");
		}
		
		
	}

	
	@Override
	public void resolver() {
		int pos = 0;
		for(int i = 0; i<cantColaboradores; i++) {
			System.out.println(i);
			int coincidencias = 0;
			int cantRespuestas = cantPreguntas-1;
			String aux = respuestas.get(i);
			for(int j = 0; j<cantColaboradores; j++) {
				if(respuestas.get(j).startsWith(aux)) {
					coincidencias++;
				}
				if(coincidencias == 1 && j==cantColaboradores-1 && cantRespuestas>0) {
					aux = aux.substring(0, cantRespuestas);
					cantRespuestas--;
					coincidencias = 0;
					j=-1;
				}
				if(coincidencias > 1 && j==cantColaboradores-1) {
					if(subcadenas.add(aux)) {
						cantCoincidencias[pos] = coincidencias;
						pos++;
					}
				}
			}
		}
		//Cargar el mayor
		Iterator<String> it = subcadenas.iterator();
		mayor = it.next();
		posMayor = 0;
		for(int i=1; i<subcadenas.size();i++) {
			String sig = it.next();
			if(mayor.length() < sig.length()){
				mayor = sig;
				posMayor = i;
			}
			if(mayor.length() == sig.length()) {
				if(cantCoincidencias[i] > cantCoincidencias[pos]) {
					mayor = sig;
					posMayor = i;
				}
			}
		}
		procesarSalida(salida);
	}


	private void procesarSalida(File salida) {
		try {
			PrintWriter pw = new PrintWriter(salida);
			int afinidad = (int) (cantCoincidencias[posMayor] * Math.pow(mayor.length(),2));
			pw.println(afinidad);
			pw.println(mayor);
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo grabar el archivo");
		}
		
	}
}
