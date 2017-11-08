package metro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Grafo{
	
	private int[][] matAdy;
	private int cantNodos;
	
	public Grafo(int cantNodos) {
		this.cantNodos = cantNodos;
		this.matAdy = new int[cantNodos][cantNodos];
		for(int i = 0; i<cantNodos;i++) {
			for(int j=0;j<cantNodos;j++) {
				if(i==j) 
					matAdy[i][j]=0;
				else 
					matAdy[i][j]=Integer.MAX_VALUE;
			}
		}
	}
	
	public void agregarArista(int n1, int n2, int peso) {
		matAdy[n1][n2] = peso;
		matAdy[n2][n1] = peso;
	}
	
	public int prim() {
		return 0;
	}
	
	public int kruskal() {
		ArrayList<Conexion> listaKruskal = new ArrayList<>();
		Collections.sort(listaKruskal, new Comparator<Conexion>() {
			@Override
			public int compare(Conexion c1, Conexion c2) {
				return new Integer(c1.getPeso()).compareTo(new Integer(c2.getPeso()));
			}
		});
		return 0;
	}

	public int[][] getMatAdy() {
		return matAdy;
	}

	public void setMatAdy(int[][] matAdy) {
		this.matAdy = matAdy;
	}

	public int getCantNodos() {
		return cantNodos;
	}

	public void setCantNodos(int cantNodos) {
		this.cantNodos = cantNodos;
	}
	
	
	

}
