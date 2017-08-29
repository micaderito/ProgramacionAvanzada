package claseCirculo;

public class Punto {

	public double x;
	public double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distanciaHasta(Punto p) {
		return (Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2)));
	}
}
