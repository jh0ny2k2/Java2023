package practica4;

import java.util.Scanner;
public class ejercicio5array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tablaA[] = new int[5];
		int tablaB[] = new int[5];
		
		System.out.println("Dime los numeros de la tabla A: ");
		for (int i=0; i<tablaA.length; i++) {
			tablaA[i] = sc.nextInt();
		}
		System.out.println("Dime los numeros de la tabla B: ");
		for (int i=0; i<tablaB.length; i++) {
			tablaB[i] = sc.nextInt();
		}
		
		int tablaC[] = new int [10];
		
		int j = 0;
		for (int i=0; i<tablaA.length; i++) {
			tablaC[j] = tablaA[i]; j++;
			tablaC[j] = tablaB[i]; j++;
				
		}
		
		
		for (int i=0; i<tablaC.length; i++) {
			System.out.println(tablaC[i]);
		}

	}
}