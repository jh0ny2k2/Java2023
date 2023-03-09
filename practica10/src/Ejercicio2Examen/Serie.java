package Ejercicio2Examen;

import java.util.ArrayList;

public class Serie extends Multimedia {

	private ArrayList<Temporada> temporadas;

	public Serie(String titulo, boolean plus, int precio) {
		super(titulo, plus, precio);
		this.temporadas = new ArrayList<>();
	}

	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", temporadas=");
		builder.append(temporadas);
		builder.append("]");
		return builder.toString();
	}
	
	public void getNumeroTemporadas() {
		int contador = 0;
		
		for (Temporada t:temporadas) {
			
			contador++;
		}
	}
	
	public void addTemporada(Temporada t) {
		
		t.setSerie(this);
		
		this.temporadas.add(t);
	}
	
	public void delTemporada(Temporada t) {
		
		temporadas.remove(t);
	}
	
}
