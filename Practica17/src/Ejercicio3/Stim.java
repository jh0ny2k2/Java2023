package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;

public class Stim {

	private ArrayList<Juego> juegos;
	private LinkedList<Usuario> usuarios;
	
	public Stim() {
		super();
		this.juegos = new ArrayList<>();
		this.usuarios = new LinkedList<>();
	}

	public ArrayList<Juego> getJuegos() {
		return juegos;
	}

	public LinkedList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	//METODO PARA AÑADIR UN NUEVO JUEGO	
	
	public void addJuego (Juego j) {
		
		if (!juegos.contains(j)) {
			juegos.add(j);
		}
	}
	
	//METODO PARA ELIMINAR UN JUEGO
	public void delJuego (Juego j) {
		
		juegos.remove(j);
		
	}
	
	//METODO PARA AÑADIR UN NUEVO USUARIO
	public void addJugador (Usuario u) {
		
		if (!usuarios.contains(u)) {
			usuarios.add(u);
		}
	}
	
	//METODO PARA ELIMINAR UN USUARIO
	public void delJugador (Usuario u) {
		
		usuarios.remove(u);
	}
	
	//METODO PARA LISTAR LOS JUGADORES
	public void  listarJugadores () {
		
		for ( Usuario u: usuarios) {
			System.out.println(u);
		}
	}
	
	//METODO PARA LISTAS LOS JUEGOS
	public void  listarJuegos () {
		
		for ( Juego j : juegos) {
			System.out.println(j);
		}
	}
	
	//METODO PARA OBTENER TODAS LAS PUNTUACIONES Y GUARDARLO EN UN TREEMAP
	public TreeMap<Puntuacion,Usuario> obtenerPuntuaciones(Juego juego) {
		
		TreeMap<Puntuacion,Usuario> puntos = new TreeMap<>();
		
		int indexJuego = juegos.indexOf(juego);
		if (indexJuego < 0)
			return null;
		else {
			for(Usuario u : usuarios) {
				Puntuacion punt = u.getPuntuacion(juego);
				if (punt != null) {
					puntos.put(punt,u);
				}
			}			
		} 
		
		return puntos;
	}
	
	//METODO PARA LA BUSQUEDA DE UNA PUNTUACION 
	
	public Puntuacion buscarPuntuacion(Juego j, Usuario u) {
		Puntuacion punt = null;
		
		int indexUsuario = usuarios.indexOf(u);
		if (indexUsuario < 0)
			return null; //No existe el usuario
		else {
			int indexJuego = juegos.indexOf(j);
			if (indexJuego < 0)
				return null;
			else {
				return usuarios.get(indexUsuario).getPuntuacion(juegos.get(indexJuego));
			}
		}
	}
	
	//METODO PARA SACAR EL RANKING DE PUNTUACIONES
	public void pintarRankingJuegos() {
		for(Juego j: juegos) {
			System.out.println("Juego --> " + j);
			
			TreeMap<Puntuacion,Usuario> datos = this.obtenerPuntuaciones(j);
			Set<Puntuacion> punts = datos.keySet();
			
			for(Puntuacion p : punts) {
				System.out.println(datos.get(p).getNick() + " --> Puntos: " + p.getPuntos());
				
			}
		}
	}
	
	
}
