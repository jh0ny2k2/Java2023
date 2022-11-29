package practica3;

public class ejercicio1 {

	public static void main(String[] args) {
		
		int numero=1, numero1=5, numero2=6, mayor;
		
		mayor=0;
		if ((numero>numero2) && (numero>numero1)) {
			mayor=numero;
		}else if ((numero<numero1) && (numero1>numero2)){
			mayor=numero1;
			}else mayor=numero2;
		
		System.out.println("El numero mayor es: " + mayor);
		
		
	}

}
