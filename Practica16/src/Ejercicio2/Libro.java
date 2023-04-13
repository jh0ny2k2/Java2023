package Ejercicio2;

public class Libro extends Publicacion{

	private boolean prestado;
	
	public Libro(String isbn, String titulo, int ano, int paginas, boolean prestado) {
		super(isbn, titulo, ano, paginas);
		this.prestado = prestado;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", prestado=");
		builder.append(prestado);
		builder.append("]");
		return builder.toString();
	}

}
