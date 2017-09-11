package aCorrer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Carrera extends Abstracta{
	
	private Competidor[] vecComp;
	private int[] vecL;
	private Categoria[] vecCF;
	private Categoria[] vecCM;
	private int cantIns;
	private int cf;
	private int cm;
	private int l;
	private int[] vecSalida;
	PrintWriter sal;
	
	public Carrera(File archIn,File archOut) throws FileNotFoundException {
		super(archIn,archOut);
		procesarEntrada(entrada);
	}
	
	public void procesarEntrada(File entrada) throws FileNotFoundException {
		
		Scanner sc = new Scanner(entrada);
		
		cantIns = sc.nextInt();
		cf = sc.nextInt();
		cm = sc.nextInt();
		l = sc.nextInt();
		
		vecCF = new Categoria[cf];
		for( int i = 0; i<cf;i++) {
			Categoria aux = new Categoria();
			aux.setEdadMin(sc.nextInt());
			aux.setEdadMax(sc.nextInt());
			vecCF[i] = aux;
		}
		
		vecCM = new Categoria[cm];
		for( int i = 0;i<cm;i++) {
			Categoria aux = new Categoria();
			aux.setEdadMin(sc.nextInt());
			aux.setEdadMax(sc.nextInt());
			vecCM[i] = aux;
		}
		
		vecComp = new Competidor[cantIns]; 
		for( int i = 0;i<cantIns;i++) {
			Competidor aux = new Competidor();
			aux.setEdad(sc.nextInt());
			aux.setSexo(sc.next());
			vecComp[i] = aux;
		}
		
		vecL = new int[l];
		for( int i = 0;i<l;i++) {
			vecL[i] = sc.nextInt();
		}
		
		sc.close();
	}
	
	
	public void cargarSalida(int cat,Categoria[]vecCat, String sexo) {
		vecSalida = new int[4];
		for( int i = 0;i<cat;i++) {
			for(int k = 0;k<4;k++)
				vecSalida[k]=0;
			vecSalida[0]=i+1;
			int j = 0;
			int p = 1;
			while(j<l) {
				int posComp = vecL[j]-1;
				if(vecComp[posComp].getSexo().charAt(0) == sexo.charAt(0)) {
					if((vecComp[posComp].verCategoria(vecCat)) == vecSalida[0] && p<4) {
						vecSalida[p] = posComp+1;
						p++;
					}	
				}
				j++;
			}
			procesarSalida(salida);
		}
	}
	@Override
	public void resolver() {
		try {
			sal = new PrintWriter(new FileWriter(salida));
			cargarSalida(cf, vecCF, "F");
			cargarSalida(cm, vecCM, "M");
			sal.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void procesarSalida(File salida) {
		
		for(int i = 0; i<vecSalida.length; i++) {
			sal.print(vecSalida[i]+" ");
		}
		sal.println(" ");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File archIn = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\aCorrer\\Preparación de la prueba\\Lote de prueba\\Entrada\\07_carrera.in");
		File archOut = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\aCorrer\\Ejecución de la prueba\\Salida obtenida\\07_carera.out");
				
		Carrera c1 = new Carrera(archIn,archOut);
		c1.resolver();
		
	}
	
	
	
	
}
