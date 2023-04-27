package Ejercicio3;

import java.util.HashMap;
import java.util.Objects;

public class Usuario {

	private static long contador=1;
	
	private long id;
	
	private String nombre;
	private String email;
	private String nick;
	private HashMap<Juego, Puntuacion> puntuaciones;
	
	public Usuario(String nombre, String email, String nick) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.nick = nick;
		this.puntuaciones = new HashMap<>();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public HashMap<Juego, Puntuacion> getPuntuaciones() {
		return puntuaciones;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [email=");
		builder.append(email);
		builder.append(", nick=");
		builder.append(nick);
		builder.append("]");
		return builder.toString();
	}
	
	//METODO PARA AÑADIR UNA PUNTUACION 
	
	public void addPuntuacion (Juego j, boolean haGanado, int puntosObtenidos) {
		
		Puntuacion puntos = puntuaciones.get(j);
		
		if (puntos == null) {
			if (haGanado) {
				puntuaciones.put(j, new Puntuacion(puntosObtenidos, 1, 1, 0));
			} else {
				puntuaciones.put(j, new Puntuacion (puntosObtenidos, 1, 0, 1));
			}
		} else {
			if (haGanado) {
				puntuaciones.put(j, new Puntuacion(puntosObtenidos+puntos.getPuntos(), puntos.getPartidasJugadas()+1, puntos.getPartidasGanadas()+1, puntos.getPartidasPerdidas()));
			} else {
				puntuaciones.put(j, new Puntuacion(puntosObtenidos+puntos.getPuntos(), puntos.getPartidasJugadas()+1, puntos.getPartidasGanadas(), puntos.getPartidasPerdidas()+1));
			}
			
		}
		
	}
	
	//METODO PARA DAR POR PANTALLA LAS PUNTUACIONES OBTENIDAS HASTA EL MOMENTO
	
	public Puntuacion getPuntuacion (Juego j) {
		if ( puntuaciones.get(j) ==  null) {
			return null;
		} else {
			return puntuaciones.get(j);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}
	
	
	
	
	
	
	
}
