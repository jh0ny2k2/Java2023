package practica4;

import java.util.Scanner;
public class ejercicio2array {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime los numeros");
		int vector[]= new int[10];
		
		for (int i=0; i<vector.length; i++) {
			vector[i] = sc.nextInt();
		}
		
		int mayor= 0;
		for (int i=0; i<vector.length; i++) {
			if (mayor<vector[i]) {
				mayor = vector[i];
			}
		}
		System.out.println("El numero mayor es: "+ mayor);
		
		int menor= 1000;
		for (int i=0; i<vector.length; i++) {
			if (menor>vector[i]) {
				menor = vector[i];
			}
		}
		System.out.println("El numero menor es: "+ menor);
		
		int media = 0;
		for (int i=0; i<vector.length; i++) {
			media += vector [i];
		}
		System.out.println("La media de los numeros es de: "+(media/10));
	}

}
