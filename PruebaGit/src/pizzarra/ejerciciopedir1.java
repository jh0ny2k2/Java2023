package pizzarra;

import java.util.Scanner;
public class ejerciciopedir1 {

	public static void main(String[] args) {
		
		String nombre;
		double sueldo, sueldoneto;
		int irpf;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el nombre del empleado");
		nombre= sc.nextLine();
		System.out.println("Dime el sueldo bruto del empleado");
		sueldo= sc.nextDouble();
		System.out.println("Dime el IRPF que se le va aplicar (18, 12, 20...)");
		irpf= sc.nextInt();
		
		sueldoneto= sueldo - (sueldo*irpf/100);
		
		System.out.println("El sueldo neto de " + nombre + " es: " + sueldoneto);
	}

}
