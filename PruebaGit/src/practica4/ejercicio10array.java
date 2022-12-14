package practica4;

import java.util.Scanner;

public class Ejercicio10 {
	public static void pintarVector(int numeros[]) {
		System.out.print("[");
		for(int i=0; i<numeros.length; i++)
			System.out.print(numeros[i] + ", ");
		
		System.out.println("]");
	}

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Dime 10 numeros");
	
	int []numeros = new int[10];
	
	for (int i=0; i<numeros.length; i++) {
		
		numeros[i] = Integer.parseInt(sc.nextLine());
	}
    
	System.out.println("Dime la posicion(entre 0 y 9)");
	int posicion;
		
	posicion = Integer.parseInt(sc.nextLine());
    
	for(int i=posicion; i<numeros.length-1; i++) {
			numeros[i] = numeros[i+1];	
		}
		
		numeros[9]= 0;
    
		pintarVector(numeros);

	}

}
