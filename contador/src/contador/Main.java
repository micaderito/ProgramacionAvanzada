package contador;


public class Main {

	public static void main(String[] args) {
		Contador c = new Contador();
		System.out.println(c.mostrar() == 0);
		
		c.contar();
		c.contar();
		System.out.println(c.mostrar() == 2);
		
		c.reiniciar();
		System.out.println(c.mostrar() == 0);
	}
}
