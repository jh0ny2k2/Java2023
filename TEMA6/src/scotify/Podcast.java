package scotify;

public class Podcast extends Multimedia {

	private String fecha;
	private int capitulo;
	
	public Podcast(String nombre, int duracion, String fecha, int capitulo) {
		super(nombre, duracion);
		this.fecha = fecha;
		this.capitulo = capitulo;
	}

	public void reproducir() {
		
		System.out.println("Reproduciendo " + this.nombre + " en " + this.fecha + " capitulo " + this.capitulo);
		this.reproducciones++;
		
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(int capitulo) {
		this.capitulo = capitulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Podcast [fecha=");
		builder.append(fecha);
		builder.append(", capitulo=");
		builder.append(capitulo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
