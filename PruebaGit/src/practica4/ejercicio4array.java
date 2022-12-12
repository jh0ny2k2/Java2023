package practica4;

import java.util.Scanner;
public class ejercicio4array {

			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				int vector[]= new int[10];
				
				System.out.println("Dime los numeros");
				
				for (int i=0; i<vector.length; i++) {
					vector[i] = sc.nextInt();
				}
				
				for (int i=0; i<5; i++) {
					System.out.println("Primero: "+vector[i]);	
					System.out.println("ultimo: "+ vector[9-i]);
					}
				
				}
			
	}


