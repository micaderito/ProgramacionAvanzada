package infanteria;

public class Escudo extends ItemDecorator{

	public Escudo(Unidad unidad) {
		super(unidad);
	}
	
	@Override
	public void recibiAtaque(int puntosDaņo2) {
		unidad.recibiAtaque(puntosDaņo2*60/100);
	}

	@Override
	protected int getPuntosDaņo() {
		return unidad.getPuntosDaņo();
	}
	
}
