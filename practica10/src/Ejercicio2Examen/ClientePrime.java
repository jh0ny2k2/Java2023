package Ejercicio2Examen;

public class ClientePrime extends Cliente {

	public ClientePrime(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual = 3;
	}

	public boolean esPro() {
		return false;
	}

	public double getPrecioMensual1() {
		return 3;
	}

}
