package scotify;

import java.util.ArrayList;
import java.util.Objects;

public class Multimedia implements Reproducible{

	protected String nombre;
	protected int duracion;
	protected int anio;
	protected ArrayList<Autor> autores;
	protected int reproducciones;
	

	public Multimedia(String nombre, int duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.anio = anio;
		this.autores = autores;
		this.reproducciones = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}

	public int getReproducciones() {
		return reproducciones;
	}

	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Multimedia [nombre=");
		builder.append(nombre);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", autores=");
		builder.append(autores);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return duracion == other.duracion && Objects.equals(nombre, other.nombre);
	}
	
	//METODO PARA AÑADIR AUTORES
	
	public void addAutor (Autor autor){
		
		autores.add(autor);
	}
	
	//METODO PARA ELIMINAR AUTORES
	
	public void deleteAutor (Autor autor) {
		
		autores.remove(autor);
	}
	
	//METODO PARA REPRODUCIR
	
	public void reproducir() {
		
		System.out.println("Reproduciendo " + this.nombre);
		this.reproducciones++;
	}
	
	//METODO PARA CONTAR LAS REPRODUCCIONES DE UNA CANCION
	
	public void getReproducciones1() {
		
		System.out.println("Se ha reproducido un total de " + this.reproducciones + " veces");
	}


	
}
