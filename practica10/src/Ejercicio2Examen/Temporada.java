package Ejercicio2Examen;

import java.util.ArrayList;

public class Temporada {

	private int numero;
	private ArrayList<Episodio> episodios;
	private Serie serie;
	
	public Temporada(int numero, Serie serie) {
		super();
		this.numero = numero;
		this.episodios = episodios;
		this.serie = serie;
		this.episodios = new ArrayList<>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Temporada [numero=");
		builder.append(numero);
		builder.append(", episodios=");
		builder.append(episodios);
		builder.append(", serie=");
		builder.append(serie);
		builder.append("]");
		return builder.toString();
	}
	
	public void addEpisodios(Episodio e) {
		e.setTemporada(this); 
		
		this.episodios.add(e);
	}
	
	public void getNumEpisodios() {
		int contador = 0;
		
		for (Episodio e:episodios) {
			contador++;
		}
	}
	
	public void delEpisodio(Episodio e) {
		
		episodios.remove(e);
	}
	
	
	
}
