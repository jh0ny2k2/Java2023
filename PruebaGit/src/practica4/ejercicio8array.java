package practica4;

import java.util.Scanner;
public class ejercicio8 {

		public static void pintarVector(int numeros[]) {
			System.out.print("[");
			for(int i=0; i<numeros.length; i++)
				System.out.print(numeros[i] + ", ");
			
			System.out.println("]");
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Dime 5 numeros");
			
			int reemplazo;
			int numero [] = new int[5];
		
			for (int i=0; i<5; i++) {
				numero[i] = Integer.parseInt(sc.nextLine());
			}
			
			reemplazo = numero[4];
			
			for(int i=3; i>=0; i--) {
				numero[i+1] = numero[i];
			}
			
			numero[0]= reemplazo;
			
			pintarVector(numero);
		}
}
