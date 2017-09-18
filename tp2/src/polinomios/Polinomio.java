package polinomios;


public class Polinomio {
	private int grado;
	private double[] coeficientes;
	
	public Polinomio(double[] coeficientes) {
		this.grado=coeficientes.length-1;
		this.coeficientes=coeficientes;
	}

	public double evaluarMSucesivas(double x) {
		double resultado = 0;
		double multSuc = 1;
		for(int i=0;i<coeficientes.length;i++) {
			multSuc = 1;
			for(int j = 0;j<grado-i;j++) {
				multSuc*=x;
			}
			resultado+= coeficientes[i]*multSuc;
		}
		return resultado;
	}
	
	public double evaluarRecursiva(double x) {
		double potencia;
		double suma = 0;
		for(int i = 0; i<coeficientes.length;i++) {
			potencia = potencia(x,grado-i);
			suma+=coeficientes[i]*potencia;
		}
		return suma;
	}
	
	public double potencia(double x, int n) {
		if(n==0)
			return 1;
		return x*potencia(x,n-1);
	}
	
	public double evaluarRecursivaPar(double x) { //VER
		double potencia = 1;
		double suma = 0;
		int n = grado;
		for(int i = 0; i<coeficientes.length;i++) {
			if( n % 2 == 0)
				potencia = potencia(x*x,n/2);
			if( n % 2 != 0)
				potencia = x*potencia(x,n-1);
			suma+=coeficientes[i]*potencia;
			n--;
		}
		return suma;
	}
	
	public double evaluarProgDinamica(double x) {
		double resultado = coeficientes[grado];
		double potencia = 1;
		for(int i = grado; i > 0; i--) {
			potencia*=x;
			resultado+= potencia*coeficientes[i-1];
		}
		return resultado;
	}
	
	public double evaluarMejorada(double x) {
		double suma = 0;
		int n = grado;
		for(int i = 0; i < coeficientes.length; i++) {
			if( n % 2 == 0)
				suma+= coeficientes[i]*potencia(x*x,n/2);
			if( n % 2 != 0)
				suma+= coeficientes[i]*(x*potencia(x,n-1));
			n--;
		}
		return suma;
	}
	
	public double evaluarPow(double x) {
		double resultado = 0;
		for(int i=0;i<coeficientes.length;i++) {
			resultado+= coeficientes[i]*Math.pow(x, grado-i);
		}
		return resultado;
	}
	
	public double evaluarHorner(double x) {
		double suma = coeficientes[0];
		for(int i = 1; i<=grado ; i++) {
			suma*=x;
			suma+=coeficientes[i];
		}
		return suma;
	}

	public static void main(String[] args) {
		
		
		double[] vec = {4,7,2,-9,-10,1};
		Polinomio p1 = new Polinomio(vec);
		System.out.println("Suc: " + p1.evaluarMSucesivas(2));
		System.out.println("Recursiva: " + p1.evaluarRecursiva(2));
		System.out.println("Recursiva Par: " + p1.evaluarRecursivaPar(2));
		System.out.println("ProgDinamica: " + p1.evaluarProgDinamica(2));
		System.out.println("Evaluar Mejorada: " + p1.evaluarMejorada(2));
		System.out.println("POW: " + p1.evaluarPow(2));
		System.out.println("Horner: " + p1.evaluarHorner(2));
		
	}
		
}
