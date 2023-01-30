package ejercicio2;

public class coche {
	
	private int velocidad;
	coche () {
		velocidad = 0;
	}
	
	public coche(int velocidad) {
		super();
		this.velocidad = velocidad;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	
	
	
	@Override
	public String toString() {
		return "coche [velocidad=" + velocidad + "]";
	}

	public int getvelocidad() {
		return velocidad;
	}
	
	public void acelera() {
		velocidad++;
	}
	
	public void frena() {
		velocidad--;
	}
	
	
	
}
