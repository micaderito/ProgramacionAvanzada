package kMasPequeño;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Numero {
	
	private int valor;
	private int[] vecEntrada;
	private int[] vecSalida;
	private int cantElem;
	private int k;
	
	public Numero(){}
	
	private void procesarEntrada() throws FileNotFoundException {
		
		String miPath = "C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\kMasPequenio\\Preparacion de la prueba\\Lote de prueba\\Entrada\\datos.in";
		Scanner sc = new Scanner(new File (miPath));
		cantElem = sc.nextInt();
		k = sc.nextInt();
		vecEntrada = new int[cantElem];
		vecSalida = new int[k];
		for(int i = 0; i<vecEntrada.length ; i++)
			vecEntrada[i] = sc.nextInt();
		sc.close();	
	}
	
	public void resolver() throws FileNotFoundException {
		
		procesarEntrada();
		int i = 0;
		int j;
		int kObtenidos = 0;
		while(i < k) {
			j=0;
			while( j < (cantElem-i-1) ) {
				if(vecEntrada[j+1] < vecEntrada[j])
				{
					int aux = vecEntrada[j+1];
					vecEntrada[j+1] = vecEntrada[j];
					vecEntrada[j] = aux;
				}
				j++;
			}
			if(i>0 && (vecEntrada[i] == vecEntrada[i-1]))
					k++;
			else { if(i>0) {				
					kObtenidos++;
					vecSalida[kObtenidos-1] = vecEntrada[i];
					}
			}
			i++;
		}
		procesarSalida(kObtenidos);
	}
	
	void procesarSalida(int kObtenidos) throws FileNotFoundException {
		
		String miPath = "C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\kMasPequenio\\Ejecucion de la prueba\\Salida obtenida\\salida.out";		
		PrintWriter pr = new PrintWriter(new File(miPath));
		pr.println(kObtenidos);
		for(int i = 0; i< vecSalida.length; i++) {
			pr.println(vecSalida[i]);
		}
		pr.close();
	}

}
