package practica4;

import java.util.Scanner;
public class ejercicio1array {
	
	public static void pintarVectores(int []vector) {
		for (int i=0; i<vector.length; i++) {
			System.out.println(vector[i]);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vector[]= new int[10];
		System.out.println("Dime los numeros");
		
		for (int i=0; i<vector.length; i++) {
			vector[i]= sc.nextInt();
			
		}
		pintarVectores(vector);
		
		System.out.println("En orden inverso: ");
		for (int i=9; i>=0; i--) {
			System.out.println(vector[i]);
		}

	}

}
