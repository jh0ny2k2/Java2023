package Ejercicio8;

import java.util.HashSet;
import java.util.Objects;

public class Expediente {

	private Estudiante estudiante;
	private HashSet<NotasCurso> notas;
	private boolean activo;
	
	public Expediente(Estudiante estudiante, boolean activo) {
		super();
		this.estudiante = estudiante;
		this.notas = new HashSet<>();
		this.activo = activo;
	}

	public HashSet<NotasCurso> getNotas() {
		return notas;
	}

	public void setNotas(HashSet<NotasCurso> notas) {
		this.notas = notas;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Expediente(Estudiante estudiante, HashSet<NotasCurso> notas, boolean activo) {
		super();
		this.estudiante = estudiante;
		this.notas = notas;
		this.activo = activo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(activo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente other = (Expediente) obj;
		return activo == other.activo;
	}

	public void addNotas (NotasCurso nc) {
		
		notas.add(nc);
	}
	
	
	public String mostrarNotas (int curso, String etapa) {
		
		return etapa;
	}
	
	
	
}
