package monticulo;

public class Monticulo {

	private int []vector;
	private int cantElem;
	private String tipo;
	
	public Monticulo(int tam, String tipo) {
		vector = new int[tam];
		cantElem = 0;
		this.tipo = tipo;
	}
	
	public Boolean addItem (int n) {
		if(this.estaLleno())
			return false;
		cantElem++;
		vector[cantElem] = n;
		int i=cantElem;
		int aux;
		if(tipo == "max") {
			while(esMayorQueElPadre(n, i)) {
				aux = vector[i/2];
				vector[i/2] = n;
				vector[i] = aux;
				i = i/2;
			}
			return true;
		}
		else if(tipo == "min")
		{
			while(esMenorQueElPadre(n,i)) {
				aux = vector[i/2];
				vector[i/2] = n;
				vector[i] = aux;
				i = i/2;
			}
			return true;			
		}
		return false;
	}
	
	public int getItem() {
		if(cantElem == 0)
			return -1;
		int resultado = vector[1];
		vector[1] = vector[cantElem];
		cantElem--;
		if(tipo == "max") {
			//(while(esMayorQueElPadre())
		}
		else if(tipo == "min") {
			
		}
		return 1;
		
	}
	
	public Boolean esMenorQueElHijoIzq(int n, int i) {
		return n < vector[i*2];
	}
	
	public Boolean esMenorQueElHijoDer(int n, int i) {
		return n < vector[i*2+1];
	}
	
	public Boolean esMayorQueElPadre(int n, int i) {
		return n > vector[i/2];
	}
	
	public Boolean esMenorQueElPadre(int n, int i) {
		return n < vector[i/2];
	}
	public Boolean estaLleno() {
		return cantElem == vector.length;
	}
	
	
}
