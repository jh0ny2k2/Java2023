package ejericioclaseexpediente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class ExpedienteAlumno {

	//TIPO ENUMERADO: SOLO PUEDE TOMAR ALGUNO DEL ESOS TRES VALORES
	enum modalidad {FPB, GRADOMEDIO, GRADOSUPERIOR}
	enum curso {PRIMERO, SEGUNDO}
	enum sexo {MASCULINO, FEMENINO, OTRO}
	
	
	//ATRIBUTOS O PROPIEDADES
	private modalidad modalidad;
	private String nombre;
	private String apellidos;
	private sexo sexo;
	private LocalDate fechaNacimiento;
	private curso curso;
	private int id; //SE GENERA EN EL CONSTRUCTOR
	private ArrayList<NotasCurso> calificaciones;
	
	//ATRIBUTOS STATIC
	private static int numAlumnos = 1;

	
	//CONSTRUTOR PARAMETRIZADO
	
	public ExpedienteAlumno(ejericioclaseexpediente.ExpedienteAlumno.modalidad modalidad, String nombre,
			String apellidos, ejericioclaseexpediente.ExpedienteAlumno.sexo sexo, LocalDate fechaNacimiento,
			ejericioclaseexpediente.ExpedienteAlumno.curso curso) {
		super();
		this.modalidad = modalidad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.curso = curso;
		this.calificaciones = new ArrayList <>();
		this.id = ExpedienteAlumno.numAlumnos++;
	}

	//GETTERS AND SETTERS
	
	public modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public sexo getSexo() {
		return sexo;
	}

	public void setSexo(sexo sexo) {
		this.sexo = sexo;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public curso getCurso() {
		return curso;
	}

	public void setCurso(curso curso) {
		this.curso = curso;
	}

	public int getId() {
		return id;
	}

	public ArrayList<NotasCurso> getCalificaciones() {
		return calificaciones;
	}

	//TO STRINGS
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExpedienteAlumno [modalidad=");
		builder.append(modalidad);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", id=");
		builder.append(id);
		builder.append(", calificaciones=");
		builder.append(calificaciones);
		builder.append("]");
		return builder.toString();
	}

	//EQUALS
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExpedienteAlumno other = (ExpedienteAlumno) obj;
		return Objects.equals(apellidos, other.apellidos) && id == other.id && Objects.equals(nombre, other.nombre);
	}
	
	
	//CALCULAR EDAD 
	
	public int getEdad () {
		if ((LocalDate.now().getMonthValue() > this.getFechaNacimiento().getMonthValue())) {
			return LocalDate.now().getYear() - this.fechaNacimiento.getYear();
		} else {
			return LocalDate.now().getYear() - this.fechaNacimiento.getYear() -1;
		}
	}
	
	
	//CALCULAR SI ES MAYOR DE EDAD	
		
	public boolean matorEdad() {
		if (this.getEdad() >18) 
			return true;
		
		if ((this.getEdad() == 18) && (LocalDate.now().getMonthValue() >= this.getFechaNacimiento().getMonthValue()))
			return true;
		else
			return false;
	}
	
	//MIRAR EN QUE CURSO ESTA 
	
	public boolean titula() {
		int numsuspensas = this.getNumSuspensas();
		
		if (this.modalidad == modalidad.GRADOMEDIO || this.modalidad == modalidad.GRADOSUPERIOR) {
			if (numsuspensas == 0)
				return true;
			else
				return false;
			
		} else {
			//FPB
			if (numsuspensas <= 1)
				return true;
			else
				return false;
				
		}
		
	}

	//CALCULAR EL TOTAL DE SUSPENSAS 
	
	public int getNumSuspensas() {
		int contadorSuspensas=0;
		for(NotasCurso nc: this.calificaciones) {
			if (!nc.esAprobado())
				contadorSuspensas++;
		}
		return contadorSuspensas;
	}
	
	//CALCULAR LA MEDIA DEL EXPEDIENTE
	
	public double mediaExpediente() {
		double acumulador = 0;
		for(NotasCurso nc: this.calificaciones) {
			acumulador = acumulador + nc.calculoNotaFinal();
		}
		
		return acumulador / this.calificaciones.size();
	}
	
	//AÑADE UNA NUEVA NOTAS CURSO A LAS CALIFICACIONES
	
	public void addNota(NotasCurso nc) {
		this.calificaciones.add(nc);
	}
	
}
