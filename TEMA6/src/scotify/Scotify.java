package scotify;

import java.util.ArrayList;
import Ejercicio7.Contacto;

public class Scotify {

	private ArrayList<Multimedia> multimedia;

	public Scotify(ArrayList<Multimedia> multimedia) {
		super();
		this.multimedia = new ArrayList<>();
	}
	
	//METODO PARA AÑADIR MULTIMEDIA
	
	public void addMultimedia (Multimedia m) {
		
		multimedia.add(m);
	}
	
	//METODO PARA ELIMINAR MULTIMEDIA
	
	public void removeMultimedia (Multimedia m) {
		
		multimedia.remove(m);
	}
	
	//METODO PARA BUSCAR MULTIMEDIA
	
	public void buscarMulti (String nombre) {
		int contador = 0;
		
		for (Multimedia m : multimedia) {
			
			if (m.getNombre().equals(nombre)) {
				contador ++;
			}
			
			if (contador == 0) {
				System.out.println("El contacto no existe");
			} else {
				System.out.println(m.getNombre());
			}
			
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Scotify [multimedia=");
		builder.append(multimedia);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
