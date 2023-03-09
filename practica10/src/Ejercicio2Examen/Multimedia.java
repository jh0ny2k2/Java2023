package Ejercicio2Examen;

import java.util.Objects;

public class Multimedia {

	protected long codigo;
	protected String titulo;
	protected boolean plus;
	protected int precio;
	protected Genero genero;
	private static int autoincremento=1;
	
	
	public Multimedia() {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
		this.genero = genero;
	}
	
	public Multimedia(String titulo, boolean plus, int precio) {
		super();
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setAutoincrementas(long codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isPlus() {
		return plus;
	}

	public void setPlus(boolean plus) {
		this.plus = plus;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
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
		builder.append("Multimedia [codigo=");
		builder.append(codigo);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", plus=");
		builder.append(plus);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return codigo == other.codigo;
	}
	

	
	
	
	
	
	
}
