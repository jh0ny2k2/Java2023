package practica3;

import java.util.Scanner;

public class ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, random;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");

		num = sc.nextInt();

		random = (int) (Math.random() * (100 - 1) + 1);

		while (random != num) {

			int valor;

			System.out.println("El numero " + random + " es mayor? " + ".Diga 1 si es si o 0 si es no");
			valor = sc.nextInt();

			if (valor == 1) {

				random = (int) (Math.random() * ((random + 1) - 1) + 1);
			} else {

				random = (int) (Math.random() * ((random - 1) - 1) + 1);

			}
		}

		System.out.println("El número es: " + random);

	}

}


