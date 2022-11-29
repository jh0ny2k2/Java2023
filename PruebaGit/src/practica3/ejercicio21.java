package practica3;

import java.util.Scanner;
public class ejercicio21 {
	
public static boolean esPrimo(int numero) {
	
	if (numero== 0 || numero ==1 || numero==4) {
		return false;
	}
	
	for (int i=2; i<numero; i++) {
		if (numero % i ==0) {
			return false;
		}
	}
	
	return true;
}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Dime un numero");
		try {
			numero=Integer.parseInt(sc.nextLine());
		}catch (Exception e) {
			System.out.println("He dicho un numero");
		}
		
		if (esPrimo(0) == true) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}
		
		
	}

}
