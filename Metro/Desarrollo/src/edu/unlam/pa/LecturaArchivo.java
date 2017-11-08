package edu.unlam.pa;

import java.io.File;

public abstract class LecturaArchivo {

	protected File entrada;
	protected File salida;
	
	public LecturaArchivo(File entrada, File salida) {
		this.entrada = entrada;
		this.salida = salida;
	}
	
	public abstract void resolver();

}
