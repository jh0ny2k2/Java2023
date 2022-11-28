package practica3;

import java.util.Scanner;
public class ejercicio18 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int numero = 0;
	int numeromayor = 0, numeromenor = 1000;
	
	System.out.println("Dime un numero");
	try {
		numero=Integer.parseInt(sc.nextLine());
	} catch (Exception e) {
		System.out.println("Dime un numero correcto");
	}
	
	while (numero!= 0) {
		System.out.println("Dime un numero");
		try {
			numero=Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Dime un numero correcto");
		}
		
		if (numero==0) {
			System.out.println("Has terminado");
		}

		if ((numero<numeromenor) && (numero!=0)) {
			numeromenor=numero;
		}else if (numero>numeromayor) {
			numeromayor=numero;
		}
			
	}
	
	System.out.println("El numero menor es: " + numeromenor);
	System.out.println("El numero mayor es: " + numeromayor);
		
	}

}
