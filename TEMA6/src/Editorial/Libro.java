package Editorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Libro extends Publicacion {

	enum Genero {NOVELA, POESIA, DRAMA, ENSAYO}
	
	private String isbn;
	private int numcapitulos;
	private ArrayList<Autor> autores;
	private Genero genero;
	
	
	public Libro(String titulo, String editorial, LocalDate fechapubli, int numpaginas, double precio,String isbn, int numcapitulos, Genero genero) {
		super(titulo, editorial, fechapubli, numpaginas, precio);
		this.isbn = isbn;
		this.numcapitulos = numcapitulos;
		this.autores = new ArrayList<>();
		this.genero = genero;
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumcapitulos() {
		return numcapitulos;
	}

	public void setNumcapitulos(int numcapitulos) {
		this.numcapitulos = numcapitulos;
	}

	public ArrayList<Autor> getAutor() {
		return autores;
	}

	public void setAutor(ArrayList<Autor> autor) {
		this.autores = autor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [isbn=");
		builder.append(isbn);
		builder.append(", numcapitulos=");
		builder.append(numcapitulos);
		builder.append(", autor=");
		builder.append(autores);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", editorial=");
		builder.append(editorial);
		builder.append(", fechapubli=");
		builder.append(fechapubli);
		builder.append(", numpaginas=");
		builder.append(numpaginas);
		builder.append(", precio=");
		builder.append(precio);
		builder.append("]");
		return builder.toString();
	}
	
	public void addAutor(Autor a) {
		
		if(autores.indexOf(a)<0) {
			autores.add(a);
		}
		
	}
	
	
	
	@Override
	public ArrayList<Autor> getAutores() {
		// TODO Auto-generated method stub
		return null;
	}

}

