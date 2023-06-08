package com.tienda.proyecto.modelos;

public class ProductoBase extends Producto {

	enum Dimensiones{LARGO, ANCHO, ALTO}
	
	private Dimensiones dimensiones;
	private double peso;
	private boolean esRegalo;
	
	public ProductoBase(String nombre, double precio, IVA iva, DetalleProducto detalle,
			Dimensiones dimensiones, double peso, boolean esRegalo) {
		super(nombre, precio, iva, detalle);
		this.dimensiones = dimensiones;
		this.peso = peso;
		this.esRegalo = esRegalo;
	}

	public Dimensiones getDimensiones() {
		return dimensiones;
	}

	public double getPeso() {
		return peso;
	}

	public boolean isEsRegalo() {
		return esRegalo;
	}

	public void setDimensiones(Dimensiones dimensiones) {
		this.dimensiones = dimensiones;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setEsRegalo(boolean esRegalo) {
		this.esRegalo = esRegalo;
	}

	public double gastoTransporte(double costeFlete, double pesoFlete) {
		double costePrecio = 0;
		
		if (pesoFlete < 10) {
			costePrecio = pesoFlete * 5;
		} else if (pesoFlete >= 10 && pesoFlete <= 50) {
			costePrecio = pesoFlete * 10;
		} else {
			costePrecio = pesoFlete * 20;
		}
		
		
		return costePrecio + costeFlete;
	}
	
	
	public double getImporte() {
		
		double importe = 0;
		
		if (esRegalo) {
			importe = 0;
		} else {
			//importe = precioBase + gastoTransporte + gastosRegalo + calculoIVA()
		}
		
		return importe;
	}
	
	

}
