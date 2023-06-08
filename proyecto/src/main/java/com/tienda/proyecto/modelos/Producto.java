package com.tienda.proyecto.modelos;

public class Producto implements VistaPDF{
	
	public enum IVA{GENERAL, REDUCIDO, SUPERREDUCIDO};
	
	protected String sku;
	protected String nombre;
	protected double precio;
	protected IVA iva;
	
	protected DetalleProducto detalle;

	public Producto (String nombre, double precio, IVA iva, DetalleProducto detalle) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.detalle = detalle;
	}

	public String getSku() {
		return sku;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public IVA getIva() {
		return iva;
	}

	public DetalleProducto getDetalle() {
		return detalle;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setIva(IVA iva) { 
		this.iva = iva;
	}

	public void setDetalle(DetalleProducto detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [sku=");
		builder.append(sku);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", iva=");
		builder.append(iva);
		builder.append(", detalle=");
		builder.append(detalle);
		builder.append("]");
		return builder.toString();
	}
	
	
	private String generarSku() {
		int contador = 0;
		String codigo = "prod-" + contador;
		contador++;
		
		return null;
	}
	
	public double calculoIVA() {
		double precio1 = 0;
		
		if (this.iva.GENERAL != null) {
			precio1 = precio * 0.21;
		} else if (this.iva.REDUCIDO != null) {
			precio1 = precio * 0.10;
		} else {
			precio1 = precio * 0.04;
		}
		
		return precio1;
	}

	@Override
	public boolean toPDF() {
		return false;
	}
	
}
