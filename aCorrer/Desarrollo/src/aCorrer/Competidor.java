package aCorrer;

public class Competidor {
	private int edad;
	private String sexo;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int verCategoria(Categoria[] vecCategoria) {
		
		for( int i = 0; i<vecCategoria.length;i++) {
			if(this.edad>=vecCategoria[i].getEdadMin() && this.edad<=vecCategoria[i].getEdadMax())
				return i+1;
		}
		return 0;
	}
}
