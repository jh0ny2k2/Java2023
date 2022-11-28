package practica3;

import java.util.Scanner;
public class ejercicio20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Dime un numero");
		try {
			numero=Integer.parseInt(sc.nextLine());
		}catch (Exception e){
			System.out.println("Dime un numero entero");
		}
		
		if (numero%2 == 0) {
			System.out.println("Es divisible entre 2");
		}else if (numero%3 == 0) {
			System.out.println("Es divisible entre 3");
			}else if (numero%5 == 0) {
			System.out.println("Es divisible entre 5");
					}else if (numero%10 == 0) {
			System.out.println("Es divisible entre 10");
						}

	}

}
