package aCorrer;

import java.io.File;

public abstract class Abstracta {

		protected File entrada;
		protected File salida;
		
		public Abstracta(File entrada, File salida)
		{
			this.entrada = entrada;
			this.salida = salida;
		}
		
		public abstract void resolver();
}
