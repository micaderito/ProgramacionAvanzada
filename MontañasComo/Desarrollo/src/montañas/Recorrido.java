package montañas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import edu.unlam.pa.EjercicioOIA;

public class Recorrido extends EjercicioOIA{
	
	private int cantElem;
	private int[] vector;
	private Carrito c;
	
	public Recorrido(File entrada, File salida) {
		super(entrada, salida);
		procesarEntrada(entrada);
	}

	
	private void procesarEntrada(File entrada) {
		try {
				Scanner sc = new Scanner(entrada);
				cantElem = sc.nextInt();
				vector = new int[cantElem];
				for(int i = 0; i<cantElem; i++) {
					vector[i] = sc.nextInt();
				}
				c = new Carrito();
				c.setPosX(sc.nextInt());
				sc.close();
		}
		catch(Exception e)
		{
			System.out.println("Error al leer el archivo");
		}
	}

	@Override
	public void resolver() {
		c.setPosY(vector[0]- c.getPosX()); /** posición inicial en y */
		c.setCapAsc(c.getPosY()); /** capacidad de ascenso inicial */ 
		/** PRIMERA BAJADA AL VALLE */
		c.setCapAsc(c.getCapAsc()-1);
		c.setPosX(vector[0]-vector[1]); 
		c.setPosY(vector[1]); /** baje al valle*/ 
		boolean puedaSeguir = true;
		int pos = 2; /** comienzo en el segundo pico */ 
		while(puedaSeguir && pos< cantElem)
		{
			int movimiento = c.getPosX() + Math.abs(vector[pos]-vector[pos-1]);
			if(pos%2 == 0 && c.puedeSubir(vector[pos])) {
				c.setPosX(movimiento);
				c.setPosY(vector[pos]);
			}
			else {
				if(pos%2 != 0) {
					c.setCapAsc(c.getCapAsc()-1);
					c.setPosY(vector[pos]);
					c.setPosX(movimiento);
				}
				else {
					puedaSeguir=false;
					c.setPosX(c.getPosX() + c.getCapAsc() - c.getPosY());
					c.setPosY(c.getCapAsc());
					
				}
			}
			pos++;
		}
		procesarSalida(salida);
	}


	private void procesarSalida(File salida) {
		try {
			PrintWriter pw = new PrintWriter(salida);
			pw.println(c.getPosX() + " " + c.getPosY());
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error al grabar el archivo de salida");
		}
	}
}
