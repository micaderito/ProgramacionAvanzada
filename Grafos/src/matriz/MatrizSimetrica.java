package matriz;

public class MatrizSimetrica {
	
	private boolean[] v;
	private int cantNodos;
	
	public MatrizSimetrica(int cantNodos){
		int tam = (cantNodos * (cantNodos - 1) ) / 2;
		this.cantNodos = cantNodos;
		v = new boolean[tam];
	}

	public void setIJ (int i, int j){
		if(i>j)
			setIJ(j,i);
		int pos = i * cantNodos + j - (i*i + 3 * i + 2)/2;
		v[pos] = true;
	}
}
