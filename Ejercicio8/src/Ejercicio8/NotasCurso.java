package Ejercicio8;

import java.util.HashMap;
import java.util.Objects;

public class NotasCurso {

	enum etapaEducativa {ESO, BACHILLERATO, FPBASICA, FPMEDIO, FPSUPERIOR }
	enum Curso {C1, C2,C3,C4}
	
	private etapaEducativa etapa;
	private String nombreCiclo;
	private Curso curso;
	private HashMap <String,Double> notas;
	private int anio;
	
	public NotasCurso(etapaEducativa etapa, String nombreCiclo, Curso curso, int anio) {
		super();
		this.etapa = etapa;
		this.nombreCiclo = nombreCiclo;
		this.curso = curso;
		this.notas = new HashMap<>();
		this.anio = anio;
	}

	public etapaEducativa getEtapa() {
		return etapa;
	}

	public void setEtapa(etapaEducativa etapa) {
		this.etapa = etapa;
	}

	public String getNombreCiclo() {
		return nombreCiclo;
	}

	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public HashMap<String, Double> getNotas() {
		return notas;
	}

	public void setNotas(HashMap<String, Double> notas) {
		this.notas = notas;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NotasCurso [etapa=");
		builder.append(etapa);
		builder.append(", nombreCiclo=");
		builder.append(nombreCiclo);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", notas=");
		builder.append(notas);
		builder.append(", anio=");
		builder.append(anio);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(anio, curso, etapa, nombreCiclo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotasCurso other = (NotasCurso) obj;
		return anio == other.anio && curso == other.curso && etapa == other.etapa
				&& Objects.equals(nombreCiclo, other.nombreCiclo);
	}
	
	
	public void addNota(String asignatura, double nota) {
		
		this.notas.put(asignatura, nota);
		
	}
	
	public void deleteNota (String asignatura) {
		
		this.notas.remove(asignatura);
	}
	
	public double buscar(String asignatura) {
		 
		return this.notas.get(asignatura);
	}
	
	public String pintar() {
		return "Estudiante{" +
                "etapaEducativa='" + etapa + '\'' +
                ", nombreCiclo='" + nombreCiclo + '\'' +
                ", curso=" + curso +
                ", notas=" + notas +
                ", anio=" + anio +
                '}';
	}
	
	

}
