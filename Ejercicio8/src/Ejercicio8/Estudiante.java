package Ejercicio8;

import java.util.Objects;

public class Estudiante {

	private String dni;
	private String nombre;
	private String apellidos;
	private int fNacimiento;
	private String direccion;
	private String localidad;
	private String email;
	private int numero;
	
	public Estudiante(String dni, String nombre, String apellidos, int fNacimiento, String direccion, String localidad,
			String email, int numero) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fNacimiento = fNacimiento;
		this.direccion = direccion;
		this.localidad = localidad;
		this.email = email;
		this.numero = numero;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getfNacimiento() {
		return fNacimiento;
	}

	public void setfNacimiento(int fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estudiante [dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fNacimiento=");
		builder.append(fNacimiento);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", email=");
		builder.append(email);
		builder.append(", numero=");
		builder.append(numero);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	
	
	
}
