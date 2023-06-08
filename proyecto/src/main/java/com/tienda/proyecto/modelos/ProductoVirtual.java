package com.tienda.proyecto.modelos;

public class ProductoVirtual extends Producto {

	enum TipoVirtual{MUSICA, VIDEO, IMAGEN, VIDEOJUEGO, PROGRAMA}
	
	private TipoVirtual tipo;
	private long pesoByte;
	private String URLDescarga;
	
	public ProductoVirtual(String nombre, double precio, IVA iva, DetalleProducto detalle,
			TipoVirtual tipo, long pesoByte, String URLDescarga) {
		super(nombre, precio, iva, detalle);
		this.tipo = tipo;
		this.pesoByte = pesoByte;
		this.URLDescarga = URLDescarga;
	}

	public TipoVirtual getTipo() {
		return tipo;
	}

	public long getPesoByte() {
		return pesoByte;
	}

	public String getURLDescarga() {
		return URLDescarga;
	}

	public void setTipo(TipoVirtual tipo) {
		this.tipo = tipo;
	}

	public void setPesoByte(long pesoByte) {
		this.pesoByte = pesoByte;
	}

	public void setURLDescarga(String uRLDescarga) {
		URLDescarga = uRLDescarga;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductoVirtual [sku=");
		builder.append(sku);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", iva=");
		builder.append(iva);
		builder.append(", detalle=");
		builder.append(detalle);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", pesoByte=");
		builder.append(pesoByte);
		builder.append(", URLDescarga=");
		builder.append(URLDescarga);
		builder.append("]");
		return builder.toString();
	}

	public boolean toPDF() {
		return true;
	}
	
	public double getImporte() {
		double importe = precio * (1 * this.calculoIVA());
		
		return importe;
	}
	
}
