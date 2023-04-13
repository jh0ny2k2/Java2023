package Ejercicio2;

import java.util.Collections;

public class Publicacion implements Prestable,Comparable<Publicacion>{

	protected String isbn;
	protected String titulo;
	protected int ano;
	protected int paginas;

	public Publicacion(String isbn, String titulo, int ano, int paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
		this.paginas = paginas;
	}
	
	public Publicacion(Publicacion publi) {
		super();
		this.isbn = publi.isbn;
		this.titulo = publi.titulo;
		this.ano = publi.ano;
		this.paginas = publi.paginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAno() {
		return ano;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append("]");
		return builder.toString();
	}


	public void presta() {
	}

	public void devuelve() {
		
	}

	public boolean estaPrestado() {
		return false;
	}

	@Override
	public int compareTo(Publicacion o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

