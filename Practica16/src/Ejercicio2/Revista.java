package Ejercicio2;

public class Revista extends Publicacion implements Prestable{

	private int numero;

	public Revista(String isbn, String titulo, int ano, int paginas, int numero) {
		super(isbn, titulo, ano, paginas);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revista [isbn=");
		builder.append(isbn);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", paginas=");
		builder.append(paginas);
		builder.append(", numero=");
		builder.append(numero);
		builder.append("]");
		return builder.toString();
	}
	
	
}
