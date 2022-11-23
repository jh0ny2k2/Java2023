package practica2;

public class ejercicio15 {

	public static void main(String[] args) {
		
		int cantidad=2000;
		double interes=0.0275;
		double retencion=0.18;
		double intereses, retenciones = 0;
		
		intereses= 2000 * interes / 2;
		retenciones= intereses * retencion;
		
		System.out.println(intereses);
		System.out.println(retenciones);
		System.out.println(intereses - retenciones);
		
		double resultado;
		
		resultado= (2000*2.75/100/2) - ((2000*2.75/100/2)*0.18);
		System.out.println(resultado);
	}

}
