package Ejercicio2herencias;

public class CuentaJoven extends CuentaBancaria{
	
	private double modifComisiones = 0.25;
	
	public CuentaJoven(double saldo, double comisiones) {
		super(saldo, false, false, comisiones);
		this.comisiones = this.comisiones * this.modifComisiones;
	}

	public CuentaJoven(CuentaJoven otra) {
		super(otra);
	}
	

}
		
	
