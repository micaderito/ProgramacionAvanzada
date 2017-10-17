package infanteria;

public class Puñal extends ItemDecorator {

	public Puñal(Unidad unidad) {
		super(unidad);
	}

	@Override
	public void recibiAtaque(int puntosDaño2) {
		unidad.recibiAtaque(puntosDaño2 + 3);		
	}
	
	@Override
	public int getPuntosDaño() {
		return unidad.getPuntosDaño() + 3;
	}
	
	public int getSalud() {
		return super.getSalud();
	}

}
