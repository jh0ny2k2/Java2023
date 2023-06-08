package com.tienda.proyecto.modelos;

import java.time.LocalDateTime;

public class DetalleProducto extends Producto{

	private String url;
	private String cadena;
	private String categorias;
	private String marca;
	private LocalDateTime fechaCreacion;
	
	public DetalleProducto(String nombre, double precio, IVA iva, DetalleProducto detalle, String url,
			String cadena, String categorias, String marca, LocalDateTime fechaCreacion) {
		super(nombre, precio, iva, detalle);
		this.url = url;
		this.cadena = cadena;
		this.categorias = categorias;
		this.marca = marca;
		this.fechaCreacion = fechaCreacion;
	}

	public String getUrl() {
		return url;
	}

	public String getCadena() {
		return cadena;
	}

	public String getCategorias() {
		return categorias;
	}

	public String getMarca() {
		return marca;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DetalleProducto [sku=");
		builder.append(sku);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", iva=");
		builder.append(iva);
		builder.append(", detalle=");
		builder.append(detalle);
		builder.append(", url=");
		builder.append(url);
		builder.append(", cadena=");
		builder.append(cadena);
		builder.append(", categorias=");
		builder.append(categorias);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", fechaCreacion=");
		builder.append(fechaCreacion);
		builder.append("]");
		return builder.toString();
	}


	

}
