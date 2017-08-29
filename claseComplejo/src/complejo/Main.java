package complejo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo numero = new Complejo(1,2);
		Complejo numero2 = new Complejo(3, 4);
		Complejo numero3 = numero.suma(numero2);
		Complejo numero4 = numero.resta(numero2);
		Complejo numero5 = numero4;
		Complejo numero6 = new Complejo();
//		System.out.println("(" + numero3.getReal() + ";" + numero3.getIm() + ")");
//		System.out.println("(" + numero4.getReal() + ";" + numero4.getIm() + ")");
		numero5.setReal(45); /** Modifico los dos, numero5 y numero4 , porque los dos tienen la misma referencia */
		/** numero6.igualar(numero2); Asi no modifica el numero2, no copio la referencia, lo igualo */ 
		Complejo numero7 = numero2.clone(); /** Lo clono, creo uno igual */ 
		numero6.setReal(12);
		System.out.println(numero2);
		System.out.println(numero3);
		System.out.println(numero4);
		System.out.println(numero5);
		System.out.println(numero6);
		System.out.println(numero7);
		if(numero5.equals(numero4))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintos");
		if(numero.compareTo(numero2) == -1)
			System.out.println(numero + " es menor que " + numero2);
		if(numero.compareTo(numero2) == 1)
			System.out.println(numero + " es mayor que " + numero2);
		if(numero.compareTo(numero2) == 0)
			System.out.println(numero + " es igual que " + numero2);
		
		Complejo vec[] = new Complejo[] {numero3,numero2,numero};
		
		System.out.println("vector de complejos antes de ordenar = ");
		
		for(int i=0;i<vec.length;i++)
		{
			System.out.println(vec[i]);
		}
		
		System.out.println("vector de complejos despues de ordenar = ");
		
		Arrays.sort(vec);
		
		for(int i=0;i<vec.length;i++)
		{
			System.out.println(vec[i]);
		}
		
		
		
	} 
}
