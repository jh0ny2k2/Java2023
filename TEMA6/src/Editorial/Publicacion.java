package Editorial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Publicacion {
	
	protected String titulo;
	protected String editorial;
	protected LocalDate fechapubli;
	protected int numpaginas;
	protected double precio;
	
	public Publicacion(String titulo, String editorial, LocalDate fechapubli, int numpaginas, double precio) {
		super();
		this.titulo = titulo;
		this.editorial = editorial;
		this.fechapubli = fechapubli;
		this.numpaginas = numpaginas;
		this.precio = precio;
	}
	

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public LocalDate getFechapubli() {
		return fechapubli;
	}
	public void setFechapubli(LocalDate fechapubli) {
		this.fechapubli = fechapubli;
	}
	public int getNumpaginas() {
		return numpaginas;
	}
	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publicacion [titulo=");
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
	
	
	
	public abstract ArrayList<Autor> getAutores(); 
 	
}
