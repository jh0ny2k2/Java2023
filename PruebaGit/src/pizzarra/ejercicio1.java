package pizzarra;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int cantidad=0;
		double iva=1.25;
		double precio=295;
		double total;
		
		
		
		if (cantidad>=5) {
				total = cantidad * precio;
		}else {
			 total = (precio * iva)*cantidad;
		}
		
		System.out.println("El precio final es: " + total);
		
	}

}
