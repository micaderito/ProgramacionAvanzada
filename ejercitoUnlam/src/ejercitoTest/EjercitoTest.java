package ejercitoTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ejercitoUnlam.Arma;
import ejercitoUnlam.Nene;

public class EjercitoTest {
	
	private Nene nenito;
	
	private Arma armita;
	
	@Before
	public void antesDeCadaPrueba() {
		nenito = new Nene();
	}
	
	@Test
	public void queNOCargueArmaNene() {
		armita = new Arma(130,0.5);
		Assert.assertEquals(false, nenito.equipar(armita));
	}
	
	@Test
	public void queCargueArmaNene() {
		armita = new Arma(10,0.5);
		Arma armita2 = new Arma(40,0.1);
		Assert.assertEquals(true,( nenito.equipar(armita) && nenito.equipar(armita2)));
	}

}
