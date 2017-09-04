package contador;

public class Contador {
	
	private int valor = 0;
	
	public void contar()
	{
		valor++;
	}
	
	public void reiniciar()
	{
		valor=0;
	}
	
	public int mostrar() {
		return valor;
	}

}
