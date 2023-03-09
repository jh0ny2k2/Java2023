package Examen21;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Furgoneta extends Vehiculo implements Descontable {

	private float longitud;
	
	public Furgoneta() {
		super();
		this.longitud = 0;
	}

	public Furgoneta(String matricula, String marca) {
		super(matricula, marca);
		this.longitud = longitud;
	}

	public Furgoneta(Furgoneta otro) {
		super(otro);
		this.longitud = otro.longitud;
	}
	
	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Furgoneta [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append(", longitud=");
		builder.append(longitud);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double descuento() {
		
		double descuento = 0;
		long minutos = this.calcularMinutos();
		
		if (minutos > 120) {
			descuento = 0.05;
		} else if (minutos > 3600) {
			descuento = 0.20;
		}
		
		if (LocalDate.now().getDayOfWeek().equals(DayOfWeek.SATURDAY) || LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			descuento += 0.10;
		}
		
		return 0;
	}

	@Override
	public double calcularImporte() {
		double importe = 0;
		
		importe = (1 - this.descuento()) * (Parking.preciobaseporminuto * this.calcularMinutos() + this.longitud);
		return importe;
	}

}
