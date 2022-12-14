package practica4;

import java.util.Scanner;
public class ejercio7array {

	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for(int i=0; i<numeros.length; i++)
			System.out.print(numeros[i] + ", ");
		
		System.out.println("]");
	}

	public static void main(String[] args) { 

		int numeros[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los numeros");
		for(int i=0; i < 8; i++) {
			numeros[i] = sc.nextInt();
		}
		
		pintarVector(numeros);
		int posicion = 0;
		
		System.out.println("Introduce una posicion entre 0 y 7");	
		posicion = sc.nextInt();
		
		System.out.println("Dime el valor a introducir en esa posicion");
		int numero = 0;
		numero = sc.nextInt();
	
		for(int i=8; i>=posicion; i--) {
			numeros[i+1] = numeros[i];
		}
		
		if (posicion>7) {
			System.out.println("Error, introduzca un numero valido");
		}

		numeros[posicion] = numero;
		
		pintarVector(numeros);	
	}

}
