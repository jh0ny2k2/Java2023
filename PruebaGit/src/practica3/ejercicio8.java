package practica3;

import java.util.Scanner;
public class ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero, doble, triple;
		
		System.out.println("Dime un numero entero");
		
		numero=Integer.parseInt(sc.nextLine());
		
		doble=numero*2;
		triple=numero*3;
		
		System.out.println("Numero integrado: " + numero);
		System.out.println("Doble de " + numero + " -> " + doble);
		System.out.println("Triple de " + numero + "  -> " + triple);
	}

}
