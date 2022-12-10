package practica3;

import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int numero=0;

		System.out.println("Dime un numero");
		try {
			numero=Integer.parseInt(sc.nextLine());
		}catch (Exception e){
			System.out.println("Un numero por favor");
		}
		
		while ((numero>10) && (numero<1)){
			System.out.println("Dime otro numero");
			try {
				numero=Integer.parseInt(sc.nextLine());
			}catch (Exception e){
				System.out.println("Un numero por favor");

		}
	}
}
}

