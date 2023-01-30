package ejercicio8relacion;

public class aplicacion {

public static void main(String[] args) {
		
		incidencia inc1 = new incidencia("Roto el ascensor", "");
		incidencia inc2 = new incidencia("Fuga de agua en el quinto b", "");
		
		System.out.println(inc1);
		System.out.println(inc2);
		
		System.out.println(incidencia.getPendiente());
		
		inc1.setEstado("En proceso");
		inc1.resuelve("Reiniciando");
		inc2.resuelve("Con masilla");
		
		System.out.println(incidencia.getPendiente());
		
		System.out.println(inc1);
		System.out.println(inc2);

	}

}