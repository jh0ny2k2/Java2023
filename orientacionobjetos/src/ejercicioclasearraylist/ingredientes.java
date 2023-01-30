package ejercicioclasearraylist;

import java.util.Objects;

public class ingredientes {
	
	String nombre;
	int cantidad;
	
	
	/**
	 * Constructor de campos
	 */
	public ingredientes(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}


	//Constructor copia
	 

	
	// Getters and setters
	 
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}


	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	//To string
	 
	@Override
	public String toString() {
		return "ingredientes [nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}

	//Equals

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ingredientes other = (ingredientes) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	

}
