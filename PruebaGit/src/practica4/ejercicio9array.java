package practica4;

import java.util.Scanner;
public class ejercicio9array {
		
		public static void pintarVector(int numeros[]) {
			System.out.print("[");
			for(int i=0; i<numeros.length; i++)
				System.out.print(numeros[i] + ", ");
			
			System.out.println("]");
		}
		
		public static int[] mover(int numero[]) {
			Scanner sc = new Scanner(System.in);

			int reemplazo;
			
			reemplazo = numero[4];
			
			for(int i=3; i>=0; i--) {
				numero[i+1] = numero[i];
			}
			
			numero[0]= reemplazo;
			return numero;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Dime 5 numeros");
			int numero [] = new int[5];
		
			for (int i=0; i<5; i++) {
				numero[i] = Integer.parseInt(sc.nextLine());
			}
			
			System.out.println("Dime el numero de posiciones");
			int posicion = Integer.parseInt(sc.nextLine());
			
			for(int i=0; i<posicion; i++) {
				mover(numero);
			}
			
			pintarVector(numero);
	}
}
