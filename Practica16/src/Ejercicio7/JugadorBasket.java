package Ejercicio7;

public class JugadorBasket {

	enum Posicion {BASE, ALERO, ESCOLTA, ALAPIVOT, PIVOT}
	
	private String nombre;
	private Posicion posicion;
	
	public JugadorBasket(String nombre, Posicion posicion) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
	}
	
	public JugadorBasket(JugadorBasket otro) {
		super();
		this.nombre = otro.nombre;
		this.posicion = otro.posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JugadorBasket [nombre=");
		builder.append(nombre);
		builder.append(", posicion=");
		builder.append(posicion);
		builder.append("]");
		return builder.toString();
	}
	
}
