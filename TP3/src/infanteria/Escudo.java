package infanteria;

public class Escudo extends ItemDecorator{

	public Escudo(Unidad unidad) {
		super(unidad);
	}
	
	@Override
	public void recibiAtaque(int puntosDaño2) {
		unidad.recibiAtaque(puntosDaño2*60/100);
	}

	@Override
	protected int getPuntosDaño() {
		return unidad.getPuntosDaño();
	}
	
}
