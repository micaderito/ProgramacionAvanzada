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
			vecCF[i].setEdadMin(sc.nextInt());
			vecCF[i].setEdadMax(sc.nextInt());
		}
		
		vecCM = new Categoria[cm];
		for( int i = 0;i<cm;i++) {
			vecCM[i].setEdadMin(sc.nextInt());
			vecCM[i].setEdadMax(sc.nextInt());
		}
		
		vecComp = new Competidor[cantIns];
		for( int i = 0;i<cantIns;i++) {
			vecComp[i].setEdad(sc.nextInt());
			vecComp[i].setSexo(sc.next());
		}
		
		vecL = new int[l];
		for( int i = 0;i<l;i++) {
			vecL[i] = sc.nextInt();
		}
		
		sc.close();
	}
	
	
	public void cargarSalida(int cat,Categoria[]vecCat, String sexo) {
		for( int i = 0;i<cat;i++) {
			for(int k = 0;k<4;k++)
				vecSalida[k]=0;
			vecSalida[0]=i+1;
			int j = 0;
			int p = 0;
			while(j<l) {
				int posComp = vecL[j]-1;
				if(vecComp[posComp].getSexo()== sexo) {
					if((vecComp[posComp].verCategoria(vecCat)) == vecSalida[0]) {
						p++;
						vecSalida[p] = posComp+1;
					}	
				}
				j++;
			}
			procesarSalida(salida);
		}
	}
	@Override
	public void resolver() {
		vecSalida = new int[4];
			cargarSalida(cf, vecCF, "F");
			cargarSalida(cm, vecCM, "M");
		
	}
	
	void procesarSalida(File salida) {
		
		try {
			PrintWriter sal;
			sal = new PrintWriter(new FileWriter(salida));
			for(int i = 0; i<vecSalida.length; i++) {
				sal.print(vecSalida[i]);
			}
			sal.println(" ");
			sal.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File archIn = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\aCorrer\\Preparación de la prueba\\Lote de prueba\\Entrada\\01_medallasErroneas.in");
		File archOut = new File("C:\\Users\\micad\\Documents\\UNLaM\\Programacion Avanzada\\Workspace\\Problemas\\ProgramacionAvanzada\\aCorrer\\Ejecucion de la prueba\\Salida obtenida\\01_medallasErroneas.out");
				
		Carrera c1 = new Carrera(archIn,archOut);
		c1.resolver();
		
	}
	
	
	
	
}
