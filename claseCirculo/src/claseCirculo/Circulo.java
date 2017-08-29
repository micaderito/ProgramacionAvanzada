package claseCirculo;

public class Circulo {
	
	private double radio;
	private Punto centro;
	
	public Circulo(double r, Punto c) {
		radio = r;
		centro = c;
	}
	
	public boolean contienePunto(Punto p) {
		return centro.distanciaHasta(p) <= radio;
	}

}
