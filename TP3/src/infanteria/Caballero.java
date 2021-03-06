package infanteria;

public class Caballero extends Unidad {
	
	public int ataquesRecibidos;
	
	public Caballero() {
		this.distanciaMin=1;
		this.distanciaMax=2;
		this.salud=200;
		this.puntosDaņo=50;
		this.ataquesRecibidos=0;
	}

	public void beberAgua() {
		this.ataquesRecibidos=0;
	}

	@Override
	protected int getPuntosDaņo() {
		return this.puntosDaņo;
	}
	
	@Override
	protected void recibiAtaque(int puntosDaņo2) {
		this.ataquesRecibidos++;
		super.recibiAtaque(puntosDaņo2);
	}
	
	@Override
	protected boolean puedeAtacar(Unidad obj, int distancia) {
		if(!super.puedeAtacar(obj, distancia) || this.ataquesRecibidos>=3)
			return false;
		return true;
	}

	
}
