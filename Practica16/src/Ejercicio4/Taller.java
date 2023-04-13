package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Taller {

	private String nombre;
	private ArrayList<Vehiculo> vehiculos;
	
	public Taller(String nombre, ArrayList<Vehiculo> vehiculos) {
		super();
		this.nombre = nombre;
		this.vehiculos = new ArrayList<>();
	}
	
	public void ingresarVehiculo (Vehiculo vehiculo) {
		
		if (this.vehiculos.indexOf(vehiculo) < 0) {
			this.vehiculos.add(vehiculo);
		}
		
	}
	
	public void vehiculoReparado (Vehiculo vehiculo) {
		
		int posicion = this.vehiculos.indexOf(vehiculo);
		
		this.vehiculos.get(posicion).setReaparado(true);
		
	}
	
	public void eluminarVehiculo (Vehiculo vehiculo) {
		
		if (!this.vehiculos.remove(vehiculo)) {
			System.out.println("No esta el coche");
		} else {
			System.out.println("Coche eliminado");
		}
		
	}
	
	public Vehiculo buscarVehiculo (String matricula) {
		
		Collections.sort(this.vehiculos);
		int posicion = Collections.binarySearch(this.vehiculos, new VehiculoElectrico(matricula, "", "", "", 0.0, 0, false, 0));
		
		return this.vehiculos.get(posicion);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Taller [nombre=");
		builder.append(nombre);
		builder.append(", vehiculos=");
		builder.append(vehiculos);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
