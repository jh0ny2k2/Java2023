package scotify;

public class Autor {

	private String nombre;
	private String informacion;
	

	public Autor(String nombre, String informacion) {
		super();
		this.nombre = nombre;
		this.informacion = informacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor [nombre=");
		builder.append(nombre);
		builder.append(", informacion=");
		builder.append(informacion);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
