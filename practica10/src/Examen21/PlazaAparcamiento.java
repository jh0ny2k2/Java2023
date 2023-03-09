package Examen21;

import java.util.Objects;

public class PlazaAparcamiento {

	private int numeroPlazas;
	private boolean estaLibre;
	
	public PlazaAparcamiento() {
		this.numeroPlazas = 0;
		this.estaLibre = true;
	}

	public PlazaAparcamiento(int numeroPlazas) {
		super();
		this.numeroPlazas = numeroPlazas;
		this.estaLibre = true;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	public boolean isEstaLibre() {
		return estaLibre;
	}

	public void setEstaLibre(boolean estaLibre) {
		this.estaLibre = estaLibre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PlazaAparcamiento [numeroPlazas=");
		builder.append(numeroPlazas);
		builder.append(", estaLibre=");
		builder.append(estaLibre);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroPlazas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlazaAparcamiento other = (PlazaAparcamiento) obj;
		return numeroPlazas == other.numeroPlazas;
	}
	
	
	
	
	
}
