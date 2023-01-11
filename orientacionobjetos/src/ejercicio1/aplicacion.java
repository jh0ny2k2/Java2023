package ejercicio1;

public class aplicacion {

	public static void main(String[] args) {
		
		ejercicio empleado = new ejercicio("manuel", "disa", 20, "eeee@gmail.com", 2100, 0.25, 0.06, "informatica");
		ejercicio empleado2 = new ejercicio("elena", "disa", 35, "eeee@gmail.com", 2600, 0.30, 0.10, "salud");
	
		System.out.println(empleado.getNombre() + " gana " + empleado.mostrarsalario());
		
	}

}
