package infanteria;

public abstract class Unidad {
	
	protected int salud;
	protected int distanciaMin;
	protected int distanciaMax;
	protected int puntosDa�o;
	
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
		objetivo.recibiAtaque(getPuntosDa�o());
	}

	protected void recibiAtaque(int puntosDa�o2) {
		this.salud-=puntosDa�o2;
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
	
	protected abstract int getPuntosDa�o();
	
}
