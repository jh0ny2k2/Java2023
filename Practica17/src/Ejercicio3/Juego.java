package Ejercicio3;

public class Juego {

	private static long contador=1;
	
	private long id;
	private String nombre;
	private String plataforma;
	
	public Juego(String nombre, String plataforma) {
		super();
		this.id = Juego.contador++;
		this.nombre = nombre;
		this.plataforma = plataforma;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Juego [nombre=");
		builder.append(nombre);
		builder.append(", plataforma=");
		builder.append(plataforma);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
