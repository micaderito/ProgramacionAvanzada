package infanteria;

public class Lancero extends Unidad{
	
	public Lancero() {
		this.distanciaMin=1;
		this.distanciaMax=3;
		this.salud=150;
		this.puntosDa�o=25;
	}

	@Override
	protected int getPuntosDa�o() {
		return this.puntosDa�o;
	}

}
