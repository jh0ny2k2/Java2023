package Examen21;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Coche extends Vehiculo implements Descontable {

	enum Combustible {ELECTRICO, HIDROGENO, HIBRIDOENCHUFABLE, HIBRIDO, GASOLINA, DIESEL};
	
	private Combustible combustible;
	
	public Coche() {
		super();
		this.combustible = combustible.DIESEL;
	}

	public Coche(String matricula, String marca, Combustible combustible) {
		super(matricula, marca);
		this.combustible = combustible.DIESEL;
	}

	public Coche(Coche otro) {
		super(otro);
		this.combustible = otro.combustible;
	}
	
	public Combustible getCombustible() {
		return combustible;
	}

	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", minutos=");
		builder.append(minutos);
		builder.append(", plaza=");
		builder.append(plaza);
		builder.append(", combustible=");
		builder.append(combustible);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public double calcularImporte() {
		double importe = 0;
		
		importe = (1 - this.descuento()) * Parking.preciobaseporminuto * this.calcularMinutos();
		return importe;
	}

	@Override
	public double descuento() {
		double descuento = 0;
		long minutos = this.calcularMinutos();
		
		if (minutos > 120) {
			descuento = 0.05;
		} else if (minutos > 3600) {
			descuento = 0.30;
		}
		
		if (LocalDate.now().getDayOfWeek().equals(DayOfWeek.SATURDAY) || LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			descuento += 0.1;
		}
		
		if (this.combustible.equals(combustible.DIESEL) || this.combustible.equals(combustible.GASOLINA)) {
			descuento -= 0.1;
		}else {
			descuento += 0.1;
		}
		
		return descuento;
	}
	
}
