package Ejercicio7;

import java.util.ArrayList;

public class Agenda {

	private ArrayList <Contacto> contactos;

	public Agenda() {
		super();
		this.contactos =  new ArrayList <> ();
	}
	
	public boolean existeContacto (Contacto c) {
		int contador = 0;
		
		for (Contacto contacto : contactos) {
			
			if (contacto.getNumero().equals(c.getNumero())) {
				contador = 1;
			}
			
		}
		
		if (contador == 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public void addContacto(Contacto contacto) {
		
		contactos.add(contacto);
		
	}
	
	public void listarContacto () {
		
		for ( Contacto contacto : contactos) {
			System.out.println(contacto.toString());
		}
	}
	
	
	
	public void buscarContacto (String nombre) {
		int contador = 0;
		
		for (Contacto contacto : contactos) {
			
			if (contacto.getNumero().equals(nombre)) {
				contador ++;
			}
			
			if (contador == 0) {
				System.out.println("El contacto no existe");
			} else {
				System.out.println(contacto.getNumero());
			}
			
		}
	}
	
	public void eliminarContacto(Contacto c) {
		contactos.remove(c);
	}
	
	protected Contacto obtenerContacto(int posicionContacto) {
		return contactos.get(posicionContacto);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Agenda [contactos=");
		builder.append(contactos);
		builder.append("]");
		return builder.toString();
	}
	
}
