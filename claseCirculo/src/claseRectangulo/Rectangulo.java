package claseRectangulo;

import claseCirculo.Punto;

public class Rectangulo {
	
	private Punto bordeSupIzq;
	private Punto bordeInfDer;

	public Rectangulo(Punto bs, Punto bi) {
		this.bordeSupIzq = bs;
		this.bordeInfDer = bi;
	}
	
	public Punto puntoMedio() {
		return new Punto((this.bordeSupIzq.x + this.bordeInfDer.x)/2,(this.bordeSupIzq.y + this.bordeInfDer.y)/2);
	}
	
	public boolean seIntersectan(Rectangulo r) {
		return true;
		
	}
	
	public double diagonalMedia() {
		return bordeSupIzq.distanciaHasta(bordeInfDer);
	}
}
