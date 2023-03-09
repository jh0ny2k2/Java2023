package Ejercicio2Examen;

public class Episodio{
	
	private String titulo;
	private int duracion;
	private Temporada temporada;
	
	public Episodio() {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.temporada = temporada;
	}

	public Episodio(String titulo, int duracion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.temporada = temporada;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Temporada getTemporada() {
		return temporada;
	}

	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Episodio [titulo=");
		builder.append(titulo);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append("]");
		return builder.toString();
	}
	
	

}
