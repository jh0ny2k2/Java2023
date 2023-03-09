package Examen21;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Vehiculo {

	protected String matricula;
	protected String marca;
	protected LocalDateTime fechaEntrada;
	protected int minutos;
	protected PlazaAparcamiento plaza;
	
	public Vehiculo() {
		super();
		this.matricula = "";
		this.marca = "";
		this.fechaEntrada = LocalDateTime.now();
		this.minutos = 0;
		this.plaza = null;
	}
	public Vehiculo(String matricula, String marca) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.fechaEntrada = fechaEntrada;
		this.minutos = minutos;
		this.plaza = plaza;
	}
	
	public Vehiculo(Vehiculo otro) {
		super();
		this.matricula = otro.matricula;
		this.marca = otro.marca;
		this.fechaEntrada = otro.fechaEntrada;
		this.minutos = otro.minutos;
		this.plaza = otro.plaza;
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
	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(LocalDateTime fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public PlazaAparcamiento getPlaza() {
		return plaza;
	}
	public void setPlaza(PlazaAparcamiento plaza) {
		this.plaza = plaza;
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
	
	public long calcularMinutos() {
		
		Duration d = Duration.between(fechaEntrada, LocalDate.now());
		
		return d.toMinutes();
	}
	
	public abstract double calcularImporte();
	
	public abstract double descuento();
	
	
	
}
