package infanteria;

public class Capa extends ItemDecorator{

	public Capa(Soldado soldado) {
		super(soldado);
	}

	@Override
	protected int getPuntosDa�o() {
		return 0;
	}
	

}
