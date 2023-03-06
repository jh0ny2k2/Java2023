package scotify;

import java.util.ArrayList;

import Ejercicio7.Contacto;

public class Disco {

	private String titulo;
	private String fecha;
	private String Autor;
	private String grupo;
	private String discografia;
	private ArrayList<Cancion> canciones;
	
	public Disco(String titulo, String fecha, String grupo, String discografia) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.grupo = grupo;
		this.discografia = discografia;
		this.canciones = new ArrayList<>();
	}
	
	
	//METODO PARA AÑADIR CANCIONES AL DISCO 
	
	public void addCanciones (Cancion c) {
		
		canciones.add(c);
	}
	
	//METODO PARA ELIMINAR CANCIONES DEL DISCO
	
	public void delCanciones (Cancion c) {
		
		canciones.remove(c);
	}
	
	//METODO PARA OBTENER TODAS LAS CANCIONES
	
	public void obtenerCanciones (Cancion c) {
		
		for (Cancion cancion : canciones) {
			System.out.println(cancion.toString());
		}
	}
	
	//METODO PARA CALCULAR LA DURACION TOTAL DEL DISCO
	
	public int getDuracion() {
		int contador = 0;
		
		for (Cancion cancion : canciones) {
			contador++;
		}
		
		return contador;
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disco [titulo=");
		builder.append(titulo);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", Autor=");
		builder.append(Autor);
		builder.append(", grupo=");
		builder.append(grupo);
		builder.append(", discografia=");
		builder.append(discografia);
		builder.append(", canciones=");
		builder.append(canciones);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
