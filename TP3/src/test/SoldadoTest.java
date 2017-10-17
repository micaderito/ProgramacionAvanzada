package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import infanteria.Arquero;
import infanteria.Caballero;
import infanteria.Lancero;
import infanteria.Pu�al;
import infanteria.Soldado;
import infanteria.Unidad;

public class SoldadoTest {
	
	private Unidad soldado;
	
	/**
	 * Test soldado ataca a otras unidades
	 * 
	 * SOLDADO:
	 * Salud = 200
	 * Energ�a = 100
	 * Puntos de da�o = 10
	 * Recibir ataque = -10 puntos de salud
	 * 
	 * Restaurar�n energ�a al beber una poci�n de agua.
	 * 
	 * ADICI�N DE ITEMS:
	 * 
	 * PU�AL:
	 * Puntos de da�o = 13
	 * Recibir ataque = -13 puntos de salud
	 * 
	 * CAPA:
	 * Energ�a = La duplica
	 * Puntos de da�o = Los reduce en un 10%
	 * 
	 * ESCUDO:
	 * Recibir ataque = Recibir� solo el 40% del ataque del oponente
	 * 
	 */
	
	@Before
	public void inicializarSoldado() {
		soldado = new Soldado();
	}
	
	/** ATAQUE SIN ITEMS ENTRE SOLDADO Y OBJETIVO*/
	
	@Test /**Se testea que un soldado inflija 10 puntos de da�o a otro Soldado*/
	public void soldadoAtacaCon10aSoldado() {
		Unidad objetivo = new Soldado();
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(190, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado inflija 10 puntos de da�o a un Arquero*/
	public void soldadoAtacaCon10aArquero() {
		Unidad objetivo = new Arquero();
		Assert.assertEquals(50,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(40, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado inflinja 10 puntos de da�o a un Lancero*/
	public void soldadoAtacaCon10aLancero() {
		Unidad objetivo = new Lancero();
		Assert.assertEquals(150,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(140, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado inflinja 10 puntos de da�o a un Caballero*/
	public void soldadoAtacaCon10aCaballero() {
		Unidad objetivo = new Caballero();
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(190, objetivo.getSalud());
	}
	
	/** ATAQUE ENTRE SOLDADO CON PU�AL Y OBJETIVO SIN ITEMS */
	
	@Test /**Se testea que un soldado con pu�al inflija 13 puntos de da�o a Soldado*/
	public void soldadoAtacaCon13aSoldado() {
		soldado = new Pu�al(soldado);
		Unidad objetivo = new Soldado();
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(187, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado con pu�al inflija 13 puntos de da�o a Arquero*/
	public void soldadoAtacaCon13aArquero() {
		soldado = new Pu�al(soldado);
		Unidad objetivo = new Arquero();
		Assert.assertEquals(50,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(37, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado con pu�al inflija 13 puntos de da�o a Lancero*/
	public void soldadoAtacaCon13aLancero() {
		soldado = new Pu�al(soldado);
		Unidad objetivo = new Lancero();
		Assert.assertEquals(150,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(137, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado con pu�al inflija 13 puntos de da�o a Caballero*/
	public void soldadoAtacaCon13aCaballero() {
		soldado = new Pu�al(soldado);
		Unidad objetivo = new Caballero();
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(187, objetivo.getSalud());
	}

	/** ATAQUE ENTRE SOLDADO CON PU�AL Y OBJETIVO CON PU�AL */
	
	@Test /**Se testea que un soldado con pu�al inflija 16 puntos de da�o a Soldado con pu�al*/
	public void soldadoAtacaCon16aSoldado() {
		soldado = new Pu�al(soldado);
		Unidad objetivo = new Pu�al(new Soldado());
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(184, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado con pu�al inflija 16 puntos de da�o a Arquero con pu�al*/
	public void soldadoAtacaCon16aArquero() {
		soldado = new Pu�al(soldado);
		Unidad objetivo = new Pu�al(new Arquero());
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(184, objetivo.getSalud());
	}
	
	
	/*
	 * TEST DISTANCIA
	 */
	
	/*
	 * TEST BEBER AGUA
	 */
	
	/**
	 * TEST SOLDADO SIN ENERGIA
	 */
	
	
	//Falta probar escudo y capa en soldado
	/**
	 * @Test
	 * public void soldadoConEscudo();
	 * 
	 * 
	 * 
	 * @Test
	 * public void soldadoConCapa();
	 * 
	 */
	
	//Hacer este test en Arquero, Lancero y Caballero
	

}
