package ejercicio5;

import java.util.Objects;

public class Publicacion implements Prestable {

	protected int isbn;
	protected String titulo;
	protected int ano;
	protected int paginas;
	
	public Publicacion() {
		super();
		this.isbn = 0;
		this.titulo = "";
		this.ano = 0;
		this.paginas = 0;
	}

	public Publicacion(int isbn, String titulo, int ano, int paginas) {
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

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPaginas() {
		return paginas;
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

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(titulo, other.titulo);
	}

	@Override
	public void presta() {
		
	}

	@Override
	public void devuelve() {
	}

	@Override
	public boolean estaPrestado() {
		return false;
	}
	
	
	
}
