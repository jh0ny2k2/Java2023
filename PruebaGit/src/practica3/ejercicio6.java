package practica3;

import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int numero = 0;
		int i;
		
		System.out.println("Dime un numero mayor de 2");
		try {
			numero=Integer.parseInt(sc.nextLine());
		}catch (Exception e){
			System.out.println("Un numero por favor");
		}
	
		for (i=2 ; i<= numero ; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
