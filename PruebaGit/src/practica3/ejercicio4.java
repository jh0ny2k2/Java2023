package practica3;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int cantidad = 0, quinientos, doscientos, cien, cincuenta, veinte, diez, cinco, diferencia;
		
		System.out.println("Introduce el importe");
		try{
			cantidad = Integer.parseInt(sc.nextLine());
		}catch (Exception e){
			System.out.println("Dime el importe en numero");
		}
		
		
		diferencia = cantidad;

		if (diferencia >= 500) {
			quinientos = (diferencia / 500);
			diferencia = diferencia % 500;
			System.out.println("Billetes de 500: " + quinientos);
		}

		
		if (diferencia >= 200) {
			doscientos = (diferencia / 200);
			diferencia = diferencia % 200;
			System.out.println("Billetes de 200: " + doscientos);
		}

		
		if (diferencia >= 100) {
			cien = (diferencia / 100);
			diferencia = diferencia % 100;
			System.out.println("Billetes de 100: " + cien);
		}

		
		if (diferencia >= 50) {
			cincuenta = (diferencia / 50);
			diferencia = diferencia % 50;
			System.out.println("Billetes de 50: " + cincuenta);
		}

		
		if (diferencia >= 20) {
			veinte = (diferencia / 20);
			diferencia = diferencia % 20;
			System.out.println("Billetes de 20: " + veinte);
		}

		
		if (diferencia >= 10) {
			diez = (diferencia / 10);
			diferencia = diferencia % 10;
			System.out.println("Billetes de 10: " + diez);
		}

		
		if (diferencia >= 5) {
			cinco = (diferencia / 5);
			diferencia = diferencia % 5;
			System.out.println("Billetes de 5: " + cinco);
		}

		
		if ((diferencia != 0) && (diferencia < 5)) {
			System.out.println("Hay " + diferencia + " euros que sobran.");
		}

		
	}

}
