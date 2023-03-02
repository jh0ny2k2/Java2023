package Ejercicio7;

import java.util.Objects;

public class Contacto {

	private String nombre;
	private String numero;
	
	public Contacto(String nombre, String numero) {
		this.nombre = nombre;
		this.numero = numero;
	}
	
	public Contacto(String nombre) {
		this.nombre = nombre;
		this.numero = "0";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

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
		Contacto other = (Contacto) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contacto [nombre=");
		builder.append(nombre);
		builder.append(", numero=");
		builder.append(numero);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
