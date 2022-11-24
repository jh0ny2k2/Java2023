package practica3;

import java.util.Scanner;
public class ejercicio10 {

	public static void main(String[] args) {
		
		int numero=0;
		int multi;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero");
		try {
			numero=Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			System.out.println("Pon un numero");
		}

		for (int i = 1; i<=10 ; i++) {
			
		}
		
		if ((numero>0) && (numero<10)){
			for (int i = 1; i<=10 ; i++) {
				multi = numero * i;
				System.out.println("La multiplicacion de " + numero + " por " + i + " es: " + multi);
			}
		}else {
			System.out.println("ERROR");
		}
		
	}

}
