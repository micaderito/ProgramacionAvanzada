package infanteria;

public class Pu�al extends ItemDecorator {

	public Pu�al(Unidad unidad) {
		super(unidad);
	}

	@Override
	public void recibiAtaque(int puntosDa�o2) {
		unidad.recibiAtaque(puntosDa�o2 + 3);		
	}
	
	@Override
	public int getPuntosDa�o() {
		return unidad.getPuntosDa�o() + 3;
	}
	
	public int getSalud() {
		return super.getSalud();
	}

}
