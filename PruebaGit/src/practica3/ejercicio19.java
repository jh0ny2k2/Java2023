package practica3;

import java.util.Scanner;
public class ejercicio19 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int numero=0, suma=0, contador=0;
	double media=0;
	
	System.out.println("Dime un numero");
	try {
		numero=Integer.parseInt(sc.nextLine());
	} catch (Exception e) {
		System.out.println("Dime un numero correcto");
	}
	
	suma=numero;
	
	while (numero != -1 ) {
		System.out.println("Dime un numero");
		try {
			numero=Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Dime un numero correcto");
		}
		
		if (numero == -1) {
			System.out.println("Has terminado");
		}
		
		contador = contador + 1;
		suma = numero + suma;
	}
	
	media=(suma + 1)/contador;
	System.out.println("La media de los numeros es: " + media);
	}

}
