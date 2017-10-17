package infanteria;

public class Soldado extends Unidad {

	private int energia;

	public Soldado() {
		this.distanciaMin = 0;
		this.distanciaMax = 1;
		this.energia = 100;
		this.salud = 200;
		this.puntosDa�o = 10;
	}

	public void beberAgua() {
		this.energia = 100;
	}	
	
	@Override
	public int getPuntosDa�o() {
		return this.puntosDa�o;
	}

	@Override
	protected boolean puedeAtacar(Unidad obj, int distancia) {
		if(!super.puedeAtacar(obj, distancia) || this.energia<10)
			return false;
		energia-=10;
		return true;
	}

}
