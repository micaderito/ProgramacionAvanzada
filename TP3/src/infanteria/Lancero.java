package infanteria;

public class Lancero extends Unidad{
	
	public Lancero() {
		this.distanciaMin=1;
		this.distanciaMax=3;
		this.salud=150;
		this.puntosDaņo=25;
	}

	@Override
	protected int getPuntosDaņo() {
		return this.puntosDaņo;
	}

}
