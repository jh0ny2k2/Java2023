package ejericioclaseexpediente;

import java.util.Objects;

public class NotasCurso {

	private String asignaturas;
	private int curso;
	private double nota1ev;
	private double nota2ev;
	private double nota3ev;
	private double notafinal;
	
	//CONSTRUCTOR BASE
	
	public NotasCurso(String asignaturas, int curso) {
		super();
		this.asignaturas = asignaturas;
		this.curso = curso;
		this.nota1ev = 0;
		this.nota2ev = 0;
		this.nota3ev = 0;
		this.notafinal = 0;
	}
	
	//CONSTRUCTOR PARAMETRIZADO

	public NotasCurso(String asignaturas, int curso, double nota1ev, double nota2ev, double nota3ev) {
		super();
		this.asignaturas = asignaturas;
		this.curso = curso;
		this.nota1ev = nota1ev;
		this.nota2ev = nota2ev;
		this.nota3ev = nota3ev;
		this.notafinal = (this.nota1ev + this.nota2ev + this.nota3ev)/3;
	}
	
	//GET AND SET

	public String getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String asignaturas) {
		this.asignaturas = asignaturas;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public double getNota1ev() {
		return nota1ev;
	}

	public void setNota1ev(double nota1ev) {
		this.nota1ev = nota1ev;
	}

	public double getNota2ev() {
		return nota2ev;
	}

	public void setNota2ev(double nota2ev) {
		this.nota2ev = nota2ev;
	
	}

	public double getNota3ev() {
		return nota3ev;
	}

	public void setNota3ev(double nota3ev) {
		this.nota3ev = nota3ev;
	}

	public double getNotafinal() {
		return notafinal;
	}

	
	//TO STRING
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NotasCurso [asignaturas=");
		builder.append(asignaturas);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", nota1ev=");
		builder.append(nota1ev);
		builder.append(", nota2ev=");
		builder.append(nota2ev);
		builder.append(", nota3ev=");
		builder.append(nota3ev);
		builder.append(", notafinal=");
		builder.append(notafinal);
		builder.append("]");
		return builder.toString();
	}
	
	//EQUALS

	@Override
	public int hashCode() {
		return Objects.hash(asignaturas, curso, nota1ev, nota2ev, nota3ev);
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
		return Objects.equals(asignaturas, other.asignaturas) && curso == other.curso
				&& Double.doubleToLongBits(nota1ev) == Double.doubleToLongBits(other.nota1ev)
				&& Double.doubleToLongBits(nota2ev) == Double.doubleToLongBits(other.nota2ev)
				&& Double.doubleToLongBits(nota3ev) == Double.doubleToLongBits(other.nota3ev);
	}
	
	//METODO NOTA FINAL
	
	double calculoNotaFinal () {
		return this.notafinal = (this.nota1ev + this.nota2ev + this.nota3ev)/3;
		
	}
	
	
	//METODO PARA APROBADO 
	public boolean esAprobado() {
		if (this.notafinal >= 5)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
}
