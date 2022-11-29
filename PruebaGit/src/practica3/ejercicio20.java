package practica3;

import java.util.Scanner;
public class ejercicio20 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0, i;
		
		System.out.println("Dime un numero");
		try {
			numero=Integer.parseInt(sc.nextLine());
		}catch (Exception e){
			System.out.println("Dime un numero entero");
		}
		
		for (i=1; i==100; i++) {
			if (numero%i == 0) {
				System.out.println("El numero " + numero + " es divisible entre " + i );
			}else {
				System.out.println("El numero no es divisor de " + i);
			}
		}
	
	}

}
