package Examen21;

import java.util.ArrayList;

public class Parking {

	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<PlazaAparcamiento> plazas;
	private int plazasDisponibles;
	private float saldoAcumulado;
	static final float preciobaseporminuto = 0.04f;
	static final float preciobasepormetro = 0.2f;
	
	
	public Parking() {
		super();
		this.vehiculos = new ArrayList<>();
		this.plazas = new ArrayList<>();
		//CREAR 100 PLAZAS Y METERLAS EN EL ARRAYLIST
		for (int i = 0; i<=100; i++) {
			plazas.add(new PlazaAparcamiento(i));
		}
		this.plazasDisponibles = 100;
		this.saldoAcumulado = 0;
	}


	public int getPlazasDisponibles() {
		return plazasDisponibles;
	}


	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}


	public float getSaldoAcumulado() {
		return saldoAcumulado;
	}
	
	public String imprimePlazas() {
		
		StringBuilder sb = new StringBuilder();
		
		for (PlazaAparcamiento p:plazas) {
			sb.append(p.getNumeroPlazas());
			sb.append(" - ");
			sb.append(p.isEstaLibre());
			sb.append(" \n");
		}
		
		return sb.toString();
	}
	
	public String registrarentradavehiculo(Vehiculo v) {
		
		StringBuilder sb = new StringBuilder();
		
		if (this.plazasDisponibles == 0) {
			return "El parking esta lleno";
		}
		
		
		return sb.toString();
	}
	
	public PlazaAparcamiento buscarPlaza() {
		
		for (PlazaAparcamiento p : plazas) {
			if (p.isEstaLibre());
			return p;
		}
		
		return null;
	}
	
	
}
