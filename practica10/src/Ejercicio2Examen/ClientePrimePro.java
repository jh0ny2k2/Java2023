package Ejercicio2Examen;

public class ClientePrimePro extends Cliente {
	
	public ClientePrimePro() {
		super();
	}

	public ClientePrimePro(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual = 5;
	}

	public boolean esPro() {
		return true;
	}

	public double getPrecioMensual1() {
		return 5;
	}

}
