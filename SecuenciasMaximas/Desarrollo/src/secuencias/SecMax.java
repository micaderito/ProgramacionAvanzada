package secuencias;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class SecMax {
	
	public SecMax() {
		
	} 
	
public void resolver() throws IOException {
		
		int cantElem = 0;
		int secAct = 0; 
		int cantV = 0;
		int pos = 0;
		int secMax=0;
	
		
		String miPath = "C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\SecuenciasMaximas\\Preparacion de la prueba\\Lote de prueba\\Entrada\\";
		Scanner sc = new Scanner(new File(miPath+"datos07.in"));
		sc.useLocale(Locale.ENGLISH);
		cantElem=sc.nextInt();
		Integer [] vec = new Integer[cantElem];  /** vector para almacenar la lectura*/
		
		for (int i = 0; i < vec.length ; i++) {
			vec[i] = sc.nextInt() ;
			System.out.println( vec[i]);
		}
		
		sc.close();
		
		while (pos < cantElem)
		{
			if(esValido(vec[pos]))
			{
				cantV++;
				secAct++;
				pos++;
				while(secAct!=0 && pos<cantElem)
				{
					if(esValido(vec[pos]))
					{
						secAct++;
						cantV++;
					}
					else 
					{
						if(secMax < secAct)
						{
							secMax = secAct;
						}
						secAct = 0;
					}
					pos++;	
				}
				if(pos == cantElem)
					if(secMax < secAct)
						secMax = secAct;
			}
			else
				pos++;
		}
		System.out.println("Cantidad de valores Válidos = " + cantV + "\nSecuencia Máxima = " + secMax);
		grabarSalida(cantV,secMax);
		
	}
	
	void grabarSalida(int cantV, int secMax) throws IOException {
		
		String miPath="C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\SecuenciasMaximas\\Ejecucion de la prueba\\Salida obtenida\\";
		PrintWriter salida = new PrintWriter(new FileWriter(miPath+"salida07.out"));  //  preparo el arch de salida
	     
	    salida.print(cantV + "\r\n" + secMax);      
		salida.close();
	}

	Boolean esValido(int num) {
		
		if(num == 0)
			return true;
		
		if(num % 2 == 0 || num % 3 == 0 || num % 5 == 0)
			return false;
		else
			return true;
	
	}
}
