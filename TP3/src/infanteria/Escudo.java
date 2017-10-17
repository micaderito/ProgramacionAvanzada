package infanteria;

public class Escudo extends ItemDecorator{

	public Escudo(Unidad unidad) {
		super(unidad);
	}
	
	@Override
	public void recibiAtaque(int puntosDa�o2) {
		unidad.recibiAtaque(puntosDa�o2*60/100);
	}

	@Override
	protected int getPuntosDa�o() {
		return unidad.getPuntosDa�o();
	}
	
}
