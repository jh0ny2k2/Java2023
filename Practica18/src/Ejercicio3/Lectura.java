package Ejercicio3;

import java.time.LocalDateTime;
import java.util.Objects;

public class Lectura {

	private int id;
	private double temperatura;
	private double humedad;
	private LocalDateTime momento;
	private Finca finca;
	
	public Lectura(int id, double temperatura, double humedad, LocalDateTime momento, Finca finca) {
		super();
		this.id = id;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.momento = momento;
		this.finca = finca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getHumedad() {
		return humedad;
	}

	public void setHumedad(double humedad) {
		this.humedad = humedad;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public Finca getFinca() {
		return finca;
	}

	public void setFinca(Finca finca) {
		this.finca = finca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lectura [id=");
		builder.append(id);
		builder.append(", temperatura=");
		builder.append(temperatura);
		builder.append(", humedad=");
		builder.append(humedad);
		builder.append(", momento=");
		builder.append(momento);
		builder.append(", finca=");
		builder.append(finca);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lectura other = (Lectura) obj;
		return id == other.id;
	}
	
	
	
	
	
}
