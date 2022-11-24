package practica3;

import java.util.Scanner;
public class ejercicio11 {

	public static void main(String[] args) {
		
		//inicializamos las variables y el scanner
		Scanner sc = new Scanner(System.in);
		int numero=0, resto=0;
		int contador;
		
		//Pedimos por teclado el numero
		System.out.println("Dime un numero");
		try {
			numero=Integer.parseInt(sc.nextLine());
		}catch (Exception e) {
			System.out.println("Escribe un numero");
		}
		
		//Comprobamos el total de digitos que tiene
		
		contador=0;
		
		resto = numero/10;
		contador=contador+1;
		
		for (int i = 1; resto>0; i++) {
			if (resto > 0) {
				resto = resto/10;
				contador=contador+1;
			}
			
		}
		
		System.out.println("Tiene un total de " + contador + " cifras");
		
	}

}
