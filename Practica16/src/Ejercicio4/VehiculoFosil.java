package Ejercicio4;

import Ejercicio4.VehiculoHibrido.tipo;

public class VehiculoFosil extends Vehiculo{

	enum tipo {DIESEL, GASOLINA};
	
	private tipo tipo;
	private Integer deposito;
	
	public VehiculoFosil(String matricula, String marca, String modelo, String color, double precio, Integer caballos,
			boolean reaparado) {
		super(matricula, marca, modelo, color, precio, caballos, reaparado);
		this.tipo = tipo;
		this.deposito = deposito;
	}
	
	public VehiculoFosil(VehiculoFosil otro) {
		super(otro);
		this.tipo = otro.tipo;
		this.deposito = otro.deposito;
	}

	public tipo getTipo() {
		return tipo;
	}

	public void setTipo(tipo tipo) {
		this.tipo = tipo;
	}

	public Integer getDeposito() {
		return deposito;
	}

	public void setDeposito(Integer deposito) {
		this.deposito = deposito;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoFosil [tipo=");
		builder.append(tipo);
		builder.append(", deposito=");
		builder.append(deposito);
		builder.append(", matricula=");
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
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
