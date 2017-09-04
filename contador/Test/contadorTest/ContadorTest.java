package contadorTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import contador.Contador;

public class ContadorTest {
	
	private Contador c;
	
	@Before
	public void antesDeCadaPrueba() {
		c = new Contador();
	}
	
	@Test
	public void queInicieEnCero() {
		Assert.assertEquals(0,c.mostrar());
	}
	
	@Test
	public void queCuenteHastaUno() {
		c.contar();
		Assert.assertEquals(1,c.mostrar());
	}
	
	@Test
	public void queCuenteHastaUnMillon() {
		for(int i=0 ; i< 1_000_000 ; i++)
			c.contar();
		Assert.assertEquals(1_000_000, c.mostrar());
	}
	
	@Test
	public void queReinicieContador() {
		c.reiniciar();
		Assert.assertEquals(0, c.mostrar());
	}

}
