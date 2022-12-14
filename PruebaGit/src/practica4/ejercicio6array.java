package practica4;

import java.util.Scanner;
public class ejercicio6array {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime numeros");
			
		int vector[] = new int[5];
		for (int i=0; i<vector.length; i++) {
			vector[i] = sc.nextInt();
		}

		int contadorCreciente=0;
		for (int i=0; i<4; i++) {
					
		if (vector[i]<vector[i+1]) {
			contadorCreciente +=1;
					
		}
		}
		
		int contadorDecreciente = 0;
		for (int i=0; i<4; i++) {
					
		if (vector[i]>vector[i+1]) {
			contadorDecreciente +=1;
						
						
			}
		}
				
		if (contadorCreciente==4) {
			System.out.println("Creciente");
					
		} else	if (contadorDecreciente==4) {
			System.out.println("Decreciente");
		} else {
			System.out.println("Desordenados");
		}
				
		sc.close();
		}

	}
