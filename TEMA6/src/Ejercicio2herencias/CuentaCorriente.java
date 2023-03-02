package Ejercicio2herencias;

public class CuentaCorriente extends CuentaBancaria {

	private double modifcomisiones = 0.4;
	
	public CuentaCorriente (double saldo, double comisiones) {
		super(saldo, true, true, comisiones);
		this.comisiones = this.comisiones * this.modifcomisiones;
	}
	
	public CuentaCorriente(CuentaCorriente otra) {
		super(otra);
	}
}
