package ejercicioclasearraylist;

import java.util.ArrayList;

public class receta {

	String nombre;
	ArrayList <ingredientes> ingredientes;
	
	
	//CONSTRUCTOR
	
	public receta(String nombre) {
		super();
		this.nombre = nombre;
		
		this.ingredientes = new ArrayList<>();
		
	}

	//GETTERS AND SETTERS
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//TO STRING ( HACIENDO QUE SALGAN TAM
	
	
	
	//ADD INGREDIENTES ( INGREDIENTE I)
	
	public void addingredientes(ingredientes i) {
		
			this.ingredientes.add(i);
			
	}
	
	// ELIMINAR INGREDIENTES (INGREDIENTES I)
	
	
	public boolean eliminar (ingredientes i) {
		int posicion = this.ingredientes.indexOf(i);
		
		if (posicion >= 0) {
			this.ingredientes.remove(posicion);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public String toString() {
		int contador = 0;
		
		StringBuilder builder = new StringBuilder();
		builder.append("receta ");
		builder.append(nombre);
		builder.append("\n");
		builder.append("\n");
		
		for (ingredientes i : this.ingredientes) {
			builder.append(contador++ + " ");
			builder.append(i.getNombre() + "-" + i.getCantidad());
			builder.append("\n");
		}
		
		return builder.toString();
	}
}
