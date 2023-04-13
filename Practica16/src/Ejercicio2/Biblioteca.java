package Ejercicio2;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Publicacion> publicaciones;
	private String direccion;
	
	public Biblioteca(String direccion) {
		super();
		this.direccion = direccion;
		this.publicaciones = new ArrayList <> ();
	}

	public ArrayList<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public void adquirirMaterial(Publicacion unaPub) {
		
		publicaciones.add(unaPub);		
	}
	
	public void Buscar(String titulo) {

		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Biblioteca [publicaciones=");
		builder.append(publicaciones);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}

}
