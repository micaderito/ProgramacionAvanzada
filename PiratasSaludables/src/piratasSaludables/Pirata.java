package piratasSaludables;

public class Pirata {

	private Estado estado;
	private int puntos;
	private int ataque;
	private int defensa;
	
	public Pirata() {
		this.estado = new Saludable();
		this.puntos = 0;
	}
	
	public void beberJugo() {
		this.estado.beberJugo(this);
	}
	
	public void tomarGrog() {
		this.estado.beberGrog(this);
	}
	
	public void atacar(Pirata objetivo) {
		this.estado.atacar(this, objetivo);
	}
	
	public Estado verEstado() {
		return this.estado;
	}
}
