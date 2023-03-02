package Ejercicio2herencias;

import java.util.ArrayList;

public class Banco {

	//ATRIBUTOS
	
	private String nombre;
	private ArrayList<CuentaBancaria> cuentas;
	
	//CONSTRUCTOR PARAMETRIZADO
	
	public Banco(String nombre) {
		super();
		this.nombre = nombre;
		this.cuentas = new ArrayList<>();
	}
	
	//METODO PARA AÑADIR CUENTAS
	
	public void añadirCuenta (CuentaBancaria cuenta) {
		int posicion = cuentas.indexOf(cuenta);
		
		if (posicion < 0) {
			cuentas.add(cuenta);
		}
	}

	//TO STRING
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [nombre=");
		builder.append(nombre);
		builder.append(", cuentas= /n");
		
		for(CuentaBancaria cuentas : this.cuentas) {
			builder.append(cuentas.toString());
		}
		
		builder.append("]");
		return builder.toString();
	}
	
	//METODO PARA ENCONTRAR SI ESTA LA CUENTA EN EL ARRAYLIST
	
	public CuentaBancaria getCuenta ( String numeroCuenta ) {
		
		for(CuentaBancaria cb : this.cuentas) {
			if (cb.getNumeroCuenta().equals(numeroCuenta)) {
				return cb;
			}
		}
		
		return null;
	}
	
}
