package claseCirculo;

import claseRectangulo.Rectangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(7,7);
		Circulo c1 = new Circulo(2,p1);
		Circulo c2 = new Circulo(3,p2);
		System.out.println(c1.seIntersectan(c2)?"Se intersectan":"No se intersectan");
	
		Punto p3 = new Punto(6,5);
		Punto p4 = new Punto(9,4);
		Rectangulo r1 = new Rectangulo(p3,p4);
		r1.puntoMedio().verPunto();
		
	}

}
