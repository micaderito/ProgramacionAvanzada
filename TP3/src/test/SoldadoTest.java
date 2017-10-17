package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import infanteria.Arquero;
import infanteria.Caballero;
import infanteria.Lancero;
import infanteria.Puñal;
import infanteria.Soldado;
import infanteria.Unidad;

public class SoldadoTest {
	
	private Unidad soldado;
	
	/**
	 * Test soldado ataca a otras unidades
	 * 
	 * SOLDADO:
	 * Salud = 200
	 * Energía = 100
	 * Puntos de daño = 10
	 * Recibir ataque = -10 puntos de salud
	 * 
	 * Restaurarán energía al beber una poción de agua.
	 * 
	 * ADICIÓN DE ITEMS:
	 * 
	 * PUÑAL:
	 * Puntos de daño = 13
	 * Recibir ataque = -13 puntos de salud
	 * 
	 * CAPA:
	 * Energía = La duplica
	 * Puntos de daño = Los reduce en un 10%
	 * 
	 * ESCUDO:
	 * Recibir ataque = Recibirá solo el 40% del ataque del oponente
	 * 
	 */
	
	@Before
	public void inicializarSoldado() {
		soldado = new Soldado();
	}
	
	/** ATAQUE SIN ITEMS ENTRE SOLDADO Y OBJETIVO*/
	
	@Test /**Se testea que un soldado inflija 10 puntos de daño a otro Soldado*/
	public void soldadoAtacaCon10aSoldado() {
		Unidad objetivo = new Soldado();
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(190, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado inflija 10 puntos de daño a un Arquero*/
	public void soldadoAtacaCon10aArquero() {
		Unidad objetivo = new Arquero();
		Assert.assertEquals(50,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(40, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado inflinja 10 puntos de daño a un Lancero*/
	public void soldadoAtacaCon10aLancero() {
		Unidad objetivo = new Lancero();
		Assert.assertEquals(150,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(140, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado inflinja 10 puntos de daño a un Caballero*/
	public void soldadoAtacaCon10aCaballero() {
		Unidad objetivo = new Caballero();
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(190, objetivo.getSalud());
	}
	
	/** ATAQUE ENTRE SOLDADO CON PUÑAL Y OBJETIVO SIN ITEMS */
	
	@Test /**Se testea que un soldado con puñal inflija 13 puntos de daño a Soldado*/
	public void soldadoAtacaCon13aSoldado() {
		soldado = new Puñal(soldado);
		Unidad objetivo = new Soldado();
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(187, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado con puñal inflija 13 puntos de daño a Arquero*/
	public void soldadoAtacaCon13aArquero() {
		soldado = new Puñal(soldado);
		Unidad objetivo = new Arquero();
		Assert.assertEquals(50,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(37, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado con puñal inflija 13 puntos de daño a Lancero*/
	public void soldadoAtacaCon13aLancero() {
		soldado = new Puñal(soldado);
		Unidad objetivo = new Lancero();
		Assert.assertEquals(150,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(137, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado con puñal inflija 13 puntos de daño a Caballero*/
	public void soldadoAtacaCon13aCaballero() {
		soldado = new Puñal(soldado);
		Unidad objetivo = new Caballero();
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(187, objetivo.getSalud());
	}

	/** ATAQUE ENTRE SOLDADO CON PUÑAL Y OBJETIVO CON PUÑAL */
	
	@Test /**Se testea que un soldado con puñal inflija 16 puntos de daño a Soldado con puñal*/
	public void soldadoAtacaCon16aSoldado() {
		soldado = new Puñal(soldado);
		Unidad objetivo = new Puñal(new Soldado());
		Assert.assertEquals(200,objetivo.getSalud());
		soldado.atacar(objetivo, 0);
		Assert.assertEquals(184, objetivo.getSalud());
	}
	
	@Test /**Se testea que un soldado con puñal inflija 16 puntos de daño a Arquero con puñal*/
	public void soldadoAtacaCon16aArquero() {
		soldado = new Puñal(soldado);
		Unidad objetivo = new Puñal(new Arquero());
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
