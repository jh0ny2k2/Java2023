package practica3;

import java.util.Scanner;
public class ejercicio23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, suma = 0, cantidad, mayor, menor;
		float media;

		System.out.println("Introduce un número: ");

		numero = Math.abs(sc.nextInt());

		mayor = numero;
		menor = numero;
		cantidad = numero;

		System.out.println("Introduce " + cantidad + " números: ");

		for (int i = 1; i <= cantidad; i++) {

			int numlist = sc.nextInt();

			if (numlist > mayor) {

				mayor = numlist;
			}

			if (numlist < menor) {

				menor = numlist;
			}

			suma += numlist;

		}
		
		media = suma / cantidad;

		System.out.println("La media es: " + media);
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);
	}

}
