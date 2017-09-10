package ejercitoUnlam;

public class Abuela extends Recluta {
	
	private double DISTANCIA_MAXIMA = 700;
	
	private double VOL_MAX = 1;
	
	public Abuela(){
	
		this.volDisp = VOL_MAX; /** mts cubicos que tiene el bolso */
	}
	
	@Override
	public boolean puedoCargar(Arma arma) {
		return (arma.getVolumen()<=volDisp);		
	}
	
	@Override
	public void cargo(Arma arma) {
		this.volDisp-=arma.getVolumen();		
	}
}
