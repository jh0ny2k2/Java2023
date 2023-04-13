package Ejercicio4;

import java.util.Objects;

public abstract class Vehiculo implements Comparable<Vehiculo>{
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String color;
	protected double precio;
	protected Integer caballos;
	protected boolean reaparado;
	
	public Vehiculo(String matricula, String marca, String modelo, String color, double precio, Integer caballos,
			boolean reaparado) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.caballos = caballos;
		this.reaparado = reaparado;
	}
	
	public Vehiculo(Vehiculo  otro) {
		super();
		this.matricula = otro.matricula;
		this.marca = otro.marca;
		this.modelo = otro.modelo;
		this.color = otro.color;
		this.precio = otro.precio;
		this.caballos = otro.caballos;
		this.reaparado = otro.reaparado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Integer getCaballos() {
		return caballos;
	}

	public void setCaballos(Integer caballos) {
		this.caballos = caballos;
	}

	public boolean isReaparado() {
		return reaparado;
	}

	public void setReaparado(boolean reaparado) {
		this.reaparado = reaparado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", caballos=");
		builder.append(caballos);
		builder.append(", reaparado=");
		builder.append(reaparado);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(matricula, other.matricula);
	}
	
	
	
	
	
	
	
	
	
}
