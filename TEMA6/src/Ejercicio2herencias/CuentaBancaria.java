package Ejercicio2herencias;

import java.util.Objects;

public class CuentaBancaria {

	//PROPIEDADES
	
	protected String numeroCuenta;
	protected double saldo;
	protected boolean tieneTarjetaCredito;
	protected boolean tieneTarjetaDebito;
	protected double comisiones;
	
	//CONSTRUCTOR PARAMETRIZADO
	
	public CuentaBancaria(double saldo, boolean tieneTarjetaCredito, boolean tieneTarjetaDebito,
			double comisiones) {
		super();
		this.numeroCuenta = generarNumeroCuenta();
		this.saldo = saldo;
		this.tieneTarjetaCredito = tieneTarjetaCredito;
		this.tieneTarjetaDebito = tieneTarjetaDebito;
		this.comisiones = comisiones;
	}

	//CONSTRUCTOR COPIA
	
	public CuentaBancaria(CuentaBancaria otra) {
		this.numeroCuenta = otra.numeroCuenta;
		this.saldo = otra.saldo;
		this.tieneTarjetaCredito = otra.tieneTarjetaCredito;
		this.tieneTarjetaDebito = otra.tieneTarjetaDebito;
		this.comisiones = otra.comisiones;
	}
	
	//METODO PARA GENERAR UN NUMERO DE CUENTA
	
	private String generarNumeroCuenta() {
		
		StringBuilder sb = new StringBuilder(20);
		sb.append("ES");
		
		for(int i=0; i<18; i++) {
			sb.append( (int) (Math.random() * 10)  );
		}
		
		return sb.toString();
	}

	//GETTERS AND SETTERS

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isTieneTarjetaCredito() {
		return tieneTarjetaCredito;
	}

	public void setTieneTarjetaCredito(boolean tieneTarjetaCredito) {
		this.tieneTarjetaCredito = tieneTarjetaCredito;
	}

	public boolean isTieneTarjetaDebito() {
		return tieneTarjetaDebito;
	}

	public void setTieneTarjetaDebito(boolean tieneTarjetaDebito) {
		this.tieneTarjetaDebito = tieneTarjetaDebito;
	}

	public double getComisiones() {
		return comisiones;
	}

	public void setComisiones(double comisiones) {
		this.comisiones = comisiones;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	//TO STRING
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaBancaria [numeroCuenta=");
		builder.append(numeroCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", tieneTarjetaCredito=");
		builder.append(tieneTarjetaCredito);
		builder.append(", tieneTarjetaDebito=");
		builder.append(tieneTarjetaDebito);
		builder.append(", comisiones=");
		builder.append(comisiones);
		builder.append("]");
		return builder.toString();
	}

	//EQUALS
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroCuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(numeroCuenta, other.numeroCuenta);
	}
	
	//METODO PARA INGRESAR DINERO
	
	public void ingresar(double cantidad) {
		if ( cantidad >= 0 )
			this.saldo += cantidad;
	}
	
	//METODO PARA RETIRAR DINERO
	
	public boolean retirar(double cantidad) {
		if ( (this.saldo - cantidad) >= 0 ) {
			this.saldo -= cantidad;
			return true;
		} else {
			return false;
		}
		
	}

	
	
	
	
}