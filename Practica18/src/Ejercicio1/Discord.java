package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Discord {

	private List<Gamer> jugadores;

	public Discord() {
		super();
		this.jugadores = new ArrayList<>();
	}

	public List<Gamer> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Gamer> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Discord [jugadores=");
		builder.append(jugadores);
		builder.append("]");
		return builder.toString();
	}
	
	//DIRECCION DEL FICHERO
	
	Path file = Paths.get("./ficheros/gamers.txt");
	
	//METODO PARA CARGAR LOS GAMER A ARRAYLIST DESDE EL TXT
	
	public void loadGamers() {
		
		try {
			BufferedReader br = Files.newBufferedReader(file);
			
			List<String> lineas;
			lineas = Files.readAllLines(file);
			
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//METODO PARA AÑADIR JUGADORES AL ARRAYLIST
	
	public void addGamer (Gamer j) {
		
		jugadores.add(j);
		
	}
	
	//METODO PARA ELIMINAR JUGADORES DEL ARRAYLIST
	
	public void removeGamer (Gamer j) {
		
		jugadores.remove(j);
		
	}
	
	//METODO PARA BUSCAR JUGADORES
	
	public Gamer findGamer (String nick) {
		
		for (Gamer g : jugadores) {
			if (g.getNick().equals(nick)) {
				return g;
			}
		}
		
		return null;
	}
	
	//METODO PARA LISTAR JUGADORES
	
	public void listarGamers() {
		for (Gamer g : jugadores) {
			System.out.println("Nick: " + g.getNick() + " - Email: " + g.getEmail() 
			+ " - juego: " + g.getJuego() + " - Nivel: " + g.getNivel());
		}
	}
	
	//METODO PARA GUARDAR LO QUE HAS MODIFICADO LLEVANDOLO A TXT DE NUEVO
	
	
}
