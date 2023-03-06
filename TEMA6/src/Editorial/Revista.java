package Editorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Revista extends Publicacion {

	enum Tematica {HISTORIA, GEOGRAFIA, BIOLOGIA, ECONOMIA, MODA, DEPORTES}
	
	private int numero;
	private Tematica tematica;
	private ArrayList<Articulo> articulos;
	
	public Revista(String titulo, String editorial, LocalDate fechapubli, int numpaginas, double precio, int numero, Tematica tematica) {
		super(titulo, editorial, fechapubli, numpaginas, precio);
		this.numero = numero;
		this.tematica = tematica;
		this.articulos = new ArrayList<>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Tematica getTematica() {
		return tematica;
	}

	public void setTematica(Tematica tematica) {
		this.tematica = tematica;
	}

	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revista [titulo=");
		builder.append(titulo);
		builder.append(", editorial=");
		builder.append(editorial);
		builder.append(", fechapubli=");
		builder.append(fechapubli);
		builder.append(", numpaginas=");
		builder.append(numpaginas);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", tematica=");
		builder.append(tematica);
		builder.append(", articulos=");
		builder.append(articulos);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public ArrayList <Autor> getAutores(){
		
		ArrayList<Autor> autores = new ArrayList<>();
		
		for (Articulo ar : this.articulos) {
			autores.add(ar.getAutor());
		}
		
		return autores;
	}
	
	
}
