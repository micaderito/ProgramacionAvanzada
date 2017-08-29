package luchadoresJaponeses;

public final class Luchador {

	private Integer peso;
	private Integer altura;

	
	public Luchador ( Integer peso, Integer altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public boolean domina(Luchador l)
	{
		if((this.peso >= l.peso && this.altura > l.altura) || (this.altura >= l.altura && this.peso > l.peso))
			return true;
		return false;
	}
}
