package ejercicio4;

public class finanzas {

	private String tipo;
	private int cantidad;
	
	public finanzas(String tipo, int cantidad) {
		super();
		this.tipo = tipo;
		this.cantidad = cantidad;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "finanzas [tipo=" + tipo + ", cantidad=" + cantidad + "]";
	}
	
	public int finanzas() {
		int total=0;
		
		if (this.tipo == "dolares") {
			this.cantidad = (int) (this.cantidad * 1.36);
			total=this.cantidad;
		}else if (this.tipo == "euros") {
			this.cantidad = (int) (this.cantidad / 1.36);
			total=this.cantidad;
		}
		return this.cantidad;
 	}
	
}
