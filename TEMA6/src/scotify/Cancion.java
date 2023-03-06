package scotify;

public class Cancion extends Multimedia {

	enum Genero{ROCK, POP, DISCO, HIPHOP, TRAP, SOUL, JAZZ, ELECTRONICA, METAL, CLASICA, LATINO}
	
	private int posicion;
	private Genero genero;
	
	public Cancion(String nombre, int duracion, int posicion, Genero genero) {
		super(nombre, duracion);
		this.posicion = posicion;
		this.genero = genero;
	}



	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cancion [nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", posicion=");
		builder.append(posicion);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}



	
	
	
	
	
	
}
