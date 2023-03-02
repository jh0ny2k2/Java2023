package Ejercicio5;

import java.util.Objects;

public class Producto {

	//ATRIBUTOS
	
	private int id;
	private String descripcion;
	private double preciounitario;
	private int unidadesdisponibles;
	private int stockmax;
	private double descuento;
	
	//CONSTRUCTOR POR DEFECTO
	
	public Producto() {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.preciounitario = preciounitario;
		this.unidadesdisponibles = unidadesdisponibles;
		this.stockmax = stockmax;
		this.descuento = descuento;
	}

	//CONSTRUCTOR PARAMETRIZADO
	
	public Producto(int id, String descripcion, double preciounitario, int unidadesdisponibles, int stockmax,
			double descuento) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.preciounitario = preciounitario;
		this.unidadesdisponibles = unidadesdisponibles;
		this.stockmax = stockmax;
		this.descuento = descuento;
	}

	//GETTERS AND SETTERS
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPreciounitario() {
		return preciounitario;
	}

	public void setPreciounitario(double preciounitario) {
		this.preciounitario = preciounitario;
	}

	public int getUnidadesdisponibles() {
		return unidadesdisponibles;
	}

	public void setUnidadesdisponibles(int unidadesdisponibles) {
		this.unidadesdisponibles = unidadesdisponibles;
	}

	public int getStockmax() {
		return stockmax;
	}

	public void setStockmax(int stockmax) {
		this.stockmax = stockmax;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	//EQUALS
	
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Producto other = (Producto) obj;
			return id == other.id;
		}
	
	//TO STRING
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", preciounitario=");
		builder.append(preciounitario);
		builder.append(", unidadesdisponibles=");
		builder.append(unidadesdisponibles);
		builder.append(", stockmax=");
		builder.append(stockmax);
		builder.append(", descuento=");
		builder.append(descuento);
		builder.append("]");
		return builder.toString();
	}

	public boolean vender(int cantidad) {
		if ( (cantidad <= 0) || (this.unidadesdisponibles < cantidad)) {
			
			return false;
		} else {
			this.unidadesdisponibles -= cantidad;
			
			return true;
		}
	}
	
	public int reponer() {
		int diferencia;
		
		diferencia = this.stockmax - this.unidadesdisponibles;
		this.unidadesdisponibles = this.stockmax;
		
		return diferencia; 
	}
	
	
	
}
