package practica3;

import java.util.Scanner;
public class ejercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero, i, numeromayor;
		
		System.out.println("Dime un numero de 2 o 3 cifras");
		numero= Integer.parseInt(sc.nextLine());
		
		numeromayor=0;
		for (i=1; i<=numero-1; i++) {
			if (numero % i == 0) {
				numeromayor = i;
			}
		}
		
		System.out.println("El divisor de " + numero + " es: " + numeromayor);

		}

	}


