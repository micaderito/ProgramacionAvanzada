package infanteria;

public class Caballero extends Unidad {
	
	public int ataquesRecibidos;
	
	public Caballero() {
		this.distanciaMin=1;
		this.distanciaMax=2;
		this.salud=200;
		this.puntosDaño=50;
		this.ataquesRecibidos=0;
	}

	public void beberAgua() {
		this.ataquesRecibidos=0;
	}

	@Override
	protected int getPuntosDaño() {
		return this.puntosDaño;
	}
	
	@Override
	protected void recibiAtaque(int puntosDaño2) {
		this.ataquesRecibidos++;
		super.recibiAtaque(puntosDaño2);
	}
	
	@Override
	protected boolean puedeAtacar(Unidad obj, int distancia) {
		if(!super.puedeAtacar(obj, distancia) || this.ataquesRecibidos>=3)
			return false;
		return true;
	}

	
}
