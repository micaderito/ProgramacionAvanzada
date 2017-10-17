package infanteria;

public class Capa extends ItemDecorator{

	public Capa(Soldado soldado) {
		super(soldado);
	}

	@Override
	protected int getPuntosDaño() {
		return 0;
	}
	

}
