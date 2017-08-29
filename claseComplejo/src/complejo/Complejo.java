package complejo;

public class Complejo implements Comparable<Complejo> { /** Para poder comparar los complejos */

	 /** <- atributos de la clase -> */
	
	private double real;
	private double im;
	
	/** <- Fin -> */
	
	public Complejo() {
		
	}
	
	public Complejo(double real, double im) {
		this.im = im;
		this.real = real;
	}
	
	public double getReal() {
		return real;
	}

	public double getIm() {
		return im;
	}

	public void setIm(double im) {
		this.im = im;
	}

	public void setReal(double real) {
		this.real = real;
	}
	
	public Complejo suma(Complejo n) {
		
		Complejo result = new Complejo();
		result.real = real + n.real;
		result.im = im + n.im;
		return result;
	}
	
	public Complejo resta(Complejo n) {
		Complejo result = new Complejo();
		result.real = real - n.real;
		result.im = im - n.im;
		return result;
	}

	@Override
	public String toString() {
		return "Complejo (" + real + " ; " + im + ")";
	}
	
	/** Siempre que hago el equals tengo que hacer el hash code, puede ser que para el equals necesite solo comparar un atributo,
	 * pero el hashcode siempre va a usar los 2
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(im);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) { /** Sirve para comparar dos objetos, adentro de un if por ejemplo */ 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(im) != Double.doubleToLongBits(other.im))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}

	public void igualar(Complejo n) {
		
		this.real = n.real;
		this.im = n.im;
	}
	
	public Complejo clone() {
		return new Complejo(real,im);
	}

	public double modulo() {
		return Math.sqrt(Math.pow(real, 2) + Math.pow(im, 2));
	}
	
	@Override
	public int compareTo(Complejo n) { 
		if(this.modulo() < n.modulo()) /** n1 < n2 */
			return -1;
		if(this.modulo() > n.modulo()) /** n1 > n2 */
			return 1;
		return 0; /** n1 = n2 */
	}

}

