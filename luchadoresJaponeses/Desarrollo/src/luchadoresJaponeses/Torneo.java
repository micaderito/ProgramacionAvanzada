package luchadoresJaponeses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

import unlam.edu.pa.EjercicioOIA;

public class Torneo extends EjercicioOIA {

	private Luchador[] vec;
	private Integer[] vecSalida;
	private Integer cantElem;
	
	public Torneo(File archIn, File archOut) throws FileNotFoundException {
		super(archIn, archOut);
		procesarEntrada(entrada);
		// TODO Auto-generated constructor stub
	}
	
	
	void procesarEntrada(File entrada) throws FileNotFoundException {
		/*** LEEER ARCHIVO Y CARGAR CANT ELEM Y EL VECTOR */

		Scanner sc = new Scanner(entrada);
		sc.useLocale(Locale.ENGLISH);
		cantElem = sc.nextInt();
		vec = new Luchador[cantElem];  /** vector para almacenar la lectura*/
		
		for (int i = 0; i < vec.length ; i++) {
			vec[i] = new Luchador(sc.nextInt(),sc.nextInt());
			System.out.println( vec[i]);
		}
		
		vecSalida = new Integer[cantElem];
		for(int i=0; i<cantElem;i++)
			vecSalida[i]=0;
		sc.close();
	}

	@Override
	public void resolver(){
		Integer luchComp = 0;
		Integer pos = 0;
		while(luchComp < cantElem) {
			while(pos < cantElem) {
				if(pos!= luchComp) {
					if(vec[luchComp].domina(vec[pos]))
						vecSalida[luchComp]++;					
				}
				pos++;				
			}
			luchComp++;
			pos=0;
		}
		procesarSalida(salida);
	}
	
	void procesarSalida(File salida) {
		
		try {
			PrintWriter sal;
			sal = new PrintWriter(new FileWriter(salida));
			for(int i = 0; i<cantElem; i++) {
				sal.println(vecSalida[i]);
			}
			sal.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}