package Ejercicio2Examen;

public class Genero {

	enum Generos{THRILLER, ACCION, AVENTURAS, ROMANTICA, TERROR, INFANTIL, SCIFI, DRAMA, COMEDIA, ORIENTAL} 
	
	private Genero generos;

	public Genero(Genero generos) {
		super();
		this.generos = generos;
	}

	public Genero getGeneros() {
		return generos;
	}

	public void setGeneros(Genero generos) {
		this.generos = generos;
	}	
	
	
}
