package ejericioclaseexpediente;
import java.time.LocalDate;

import ejemplos.expedienteNotas.ExpedienteAlumno.Curso;
import ejemplos.expedienteNotas.ExpedienteAlumno.Modalidad;
import ejemplos.expedienteNotas.ExpedienteAlumno.Sexo;

public class Aplicacion {

	public static void main(String[] args) {
		
		ExpedienteAlumno ea1 = new ExpedienteAlumno(Modalidad.GRADOSUPERIOR, "Sonia", "Díaz Pérez", Sexo.FEMENINO, 
										LocalDate.of(2004, 1, 10), Curso.PRIMERO);
		ea1.addNota(new NotasCurso("Programacion", 1, 4, 5, 7));
		ea1.addNota(new NotasCurso("BBDD", 1, 7, 5, 3.5));
		ea1.addNota(new NotasCurso("Lenguaje de Marcas", 1, 7, 8, 8));
		ea1.addNota(new NotasCurso("Sistemas Informáticos", 1, 9, 10, 9));
		ea1.addNota(new NotasCurso("Entornos", 1, 7, 8, 9));
		
		ExpedienteAlumno ea2 = new ExpedienteAlumno(Modalidad.GRADOSUPERIOR, "Javier", "Santiago Sánchez", Sexo.MASCULINO, 
				LocalDate.of(1997, 9, 20), Curso.PRIMERO);
		ea2.addNota(new NotasCurso("Programacion", 1, 8, 5, 7));
		ea2.addNota(new NotasCurso("BBDD", 1, 7, 5, 9));
		ea2.addNota(new NotasCurso("Lenguaje de Marcas", 1, 3, 8, 8));
		ea2.addNota(new NotasCurso("Sistemas Informáticos", 1, 9, 6, 9));
		ea2.addNota(new NotasCurso("Entornos", 1, 3, 3, 4));
		
		System.out.println(ea1.getNombre() + " MEdad:" + ea1.mayorEdad() + " Titula:" + ea1.titula() + " Media:" + ea1.mediaExpediente());
		System.out.println(ea2.getNombre() + " MEdad:" + ea2.mayorEdad() + " Titula:" + ea2.titula() + " Media:" + ea2.mediaExpediente());
		

	}

}