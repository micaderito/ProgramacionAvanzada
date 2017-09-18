package tp2Test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import polinomios.Polinomio;

public class Tp2Test {
	
	private Polinomio p1;
	
	@Before
	public void setUp() {
		double[] vec = {4,7,2,-9,-10,1};
		p1 = new Polinomio(vec);
	}
	
	//region TIEMPOS DE EJECUCIÓN
	
	@Test
	public void queEvalueMultSuc() {
		long start = System.nanoTime(); //
		Assert.assertEquals(201, p1.evaluarMSucesivas(2), 0.1);
		long fin = System.nanoTime() - start;
		System.out.println("Tiempo que tardó Multiplicación Sucesivas: " + fin); //nanosegungos
	}
	
	@Test
	public void queEvalueConProgDinamica() {
		long start = System.nanoTime(); //
		Assert.assertEquals(201, p1.evaluarProgDinamica(2), 0.1);
		long fin = System.nanoTime() - start;
		System.out.println("Tiempo que tardó Programación Dinámica: " + fin); //nanosegundos		
	}
	
	@Test
	public void queEvalueRecursiva() {
		long start = System.nanoTime(); //
		Assert.assertEquals(201, p1.evaluarRecursiva(2), 0.1);
		long fin = System.nanoTime() - start;
		System.out.println("Tiempo que tardó Recursiva: " + fin); //nanosegundos		
	}
	
	@Test 
	public void queEvalueRecursivaPar() {
		long start = System.nanoTime(); //
		Assert.assertEquals(201, p1.evaluarRecursivaPar(2), 0.1);
		long fin = System.nanoTime() - start;
		System.out.println("Tiempo que tardó evaluar Recursiva Par: " + fin); //nanosegundos
	}
	
	@Test
	public void queEvalueMejorado() {

		long start = System.nanoTime(); //
		Assert.assertEquals(201, p1.evaluarMejorada(2), 0.1);
		long fin = System.nanoTime() - start;
		System.out.println("Tiempo que tardó evaluar Mejorada: " + fin); //nanosegundos
	}
	
	@Test
	public void queEvaluePow() {
		long start = System.nanoTime(); //
		Assert.assertEquals(201, p1.evaluarPow(2), 0.1);
		long fin = System.nanoTime() - start;
		System.out.println("Tiempo que tardó evaluar Pow: " + fin); //nanosegundos
	}

	@Test
	public void queEvalueHorner(){
		long start = System.nanoTime(); //
		Assert.assertEquals(201, p1.evaluarHorner(2), 0.1);
		long fin = System.nanoTime() - start;
		System.out.println("Tiempo que tardó evaluar Horner: " + fin); //nanosegundos
	}
	
	//endregion 
}
