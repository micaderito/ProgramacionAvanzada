package infanteria;

public abstract class Unidad {
	
	protected int salud;
	protected int distanciaMin;
	protected int distanciaMax;
	protected int puntosDaño;
	
	/**
	 * Se crea el metodo final Atacar
	 * Pregunto si puedo atacar con distintas unidades
	 * @param objetivo
	 * @param distancia
	 */
	public final void atacar(Unidad objetivo,int distancia) {
		if(puedeAtacar(objetivo, distancia)) {
			atacar(objetivo);
		}
	}
	
	protected void atacar(Unidad objetivo) {
		objetivo.recibiAtaque(getPuntosDaño());
	}

	protected void recibiAtaque(int puntosDaño2) {
		this.salud-=puntosDaño2;
	}

	protected boolean puedeAtacar(Unidad obj, int distancia) {
		if(this.salud<=0 || obj.getSalud()<=0)
			return false;
		if(distancia<this.distanciaMin || distancia>this.distanciaMax)
			return false;
		return true;
	}
	
	public int getSalud() {
		return salud;
	}
	
	protected abstract int getPuntosDaño();
	
}
