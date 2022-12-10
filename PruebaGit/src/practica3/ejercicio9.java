package practica3;

import java.util.Scanner;
public class ejercicio9 {
		
		public static double factorial(double numero)  {
			double acumulador=1;
			
			for(int i = (int) numero; i>=1; i--) {
				acumulador = acumulador * i;
			}
			return acumulador;
		}
		
		
		public static void main(String[] args) {
			double numero=0;
			double acumulador=1;

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Dime un numero para calcular su factorial");
			numero = Double.parseDouble(sc.nextLine());
			
			System.out.println("El factorial de " + numero + " es " + factorial(numero)) ;
		}


}
