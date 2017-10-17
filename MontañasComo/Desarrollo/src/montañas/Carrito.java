package montañas;

import java.io.File;
import java.util.Scanner;

import edu.unlam.pa.EjercicioOIA;

public class Carrito {
	
	private int posX;
	private int posY;
	private int capAsc;
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getCapAsc() {
		return capAsc;
	}
	public void setCapAsc(int capAsc) {
		this.capAsc = capAsc;
	}
	
	public boolean puedeSubir(int y) {	
		return capAsc >= (y- posY);
	}
	
	public void restarCap() {
		this.capAsc--;
	}

}
