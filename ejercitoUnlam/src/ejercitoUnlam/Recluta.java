package ejercitoUnlam;

public abstract class Recluta {

	protected double volDisp;
	
	protected double pesoDisp;
	
	protected double distMax;
	
	protected int cantArmas;


	public final boolean equipar(Arma arma) {
		if(puedoCargar(arma)) {
			cargo(arma);
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedoCargar(Arma arma);
	protected abstract void cargo(Arma arma);
}
