package practica3;

import java.util.Scanner;
public class ejercicio27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeropersona, numeromaquina, eleccion;

		System.out.println("Dime un numero del 1 al 100");
		numeropersona=Integer.parseInt(sc.nextLine());
		
		numeromaquina = (int) (Math.random()*100+1);
		
		System.out.println("El primer numero de la maquina es " + numeromaquina);
		
		while (numeropersona != numeromaquina) {
				
			if (numeropersona != numeromaquina) {
				System.out.println("¿El numero es mayor o menor que el tuyo?");
				System.out.println("1. Menor");
				System.out.println("2. Mayor");
				eleccion = Integer.parseInt(sc.nextLine());
					
				if (eleccion == 1) {
					numeromaquina = (int) (Math.random()*numeromaquina+1);
					System.out.println("El nuevo numero de la maquina es " + numeromaquina);
				}else if (eleccion == 2) {
						numeromaquina = (int) (Math.random()*100+numeromaquina);
						System.out.println("El nuevo numero de la maquina es " + numeromaquina);
				}
			}
				
		}
		
		if (numeropersona == numeromaquina) {
			System.out.println("La maquina ha acertado el numero");
		}
	}
		
}

