package infanteria;

public class Puņal extends ItemDecorator {

	public Puņal(Unidad unidad) {
		super(unidad);
	}

	@Override
	public void recibiAtaque(int puntosDaņo2) {
		unidad.recibiAtaque(puntosDaņo2 + 3);		
	}
	
	@Override
	public int getPuntosDaņo() {
		return unidad.getPuntosDaņo() + 3;
	}
	
	public int getSalud() {
		return super.getSalud();
	}

}
