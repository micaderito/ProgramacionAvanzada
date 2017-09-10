package ejercitoUnlam;

public class Nene extends Recluta {
	
	private static final double PESO_MAXIMO = 120;
	
	private static final int CANT_ARMAS_MAX = 2;
	
	public Nene() {
		this.pesoDisp = PESO_MAXIMO;
		this.cantArmas = 0;
	}
	
	@Override
	public boolean puedoCargar(Arma arma) {
		return (this.pesoDisp>=arma.getPeso() && this.cantArmas<CANT_ARMAS_MAX);
	}
	
	@Override
	public void cargo(Arma arma) {
		this.cantArmas++;
		this.pesoDisp-=arma.getPeso();
	}

}
