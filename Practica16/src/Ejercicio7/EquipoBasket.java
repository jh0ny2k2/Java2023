package Ejercicio7;

import java.util.HashMap;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EquipoBasket {

	private HashMap <Integer, JugadorBasket> hm;
	private LinkedList<JugadorBasket> jugadores;
	
	public EquipoBasket(HashMap<Integer, JugadorBasket> hm) {
		super();
		this.hm = new HashMap<>();
	}
	
	public JugadorBasket BuscarJugador (JugadorBasket j) {
		LinkedList<JugadorBasket> jugador= new LinkedList <> (jugadores);
		
		Collections.sort((List<T>) jugador);
	
		int indice = Collections.BinarySearch(jugador, j);
		
		return (indice <=0) ? jugador.get(indice) : null;
		
	}
	
	
	
}
