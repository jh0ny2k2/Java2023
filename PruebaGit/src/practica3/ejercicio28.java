package practica3;

import java.util.Scanner;
public class ejercicio28 {

	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduzca el nombre de la primera persona:");
			String nombrePersona1 = sc.nextLine();
			
			System.out.println("Introduzca el primer apellido: ");
			String apellido1Persona1 = sc.nextLine();
			
			System.out.println("Introduzca el segundo apellido: ");
			String apellido2Persona1 = sc.nextLine();

			System.out.println("Introduzca el nombre de la segunda persona: ");
			String nombrePersona2 = sc.nextLine();
			
			System.out.println("Introduzca el primer apellido: ");
			String apellido1Persona2 = sc.nextLine();
			
			System.out.println("Introduzca el segundo apellido: ");
			String apellido2Persona2 = sc.nextLine();

			if ((apellido1Persona1.compareToIgnoreCase(apellido1Persona2) < 0)
					|| (apellido1Persona1.equalsIgnoreCase(apellido1Persona2)
							&& apellido2Persona1.compareToIgnoreCase(apellido2Persona2) < 0)
					|| (apellido1Persona1.equalsIgnoreCase(apellido1Persona2) && apellido2Persona1.equalsIgnoreCase(apellido2Persona2)
							&& nombrePersona1.compareToIgnoreCase(nombrePersona2) < 0)) {
				System.out.println(apellido1Persona1 + "" + apellido2Persona1 + "" + nombrePersona1);
				System.out.println(apellido1Persona2 + "" + apellido2Persona2 + "" + nombrePersona2);
			} else {
				System.out.println(apellido1Persona2 + "" + apellido2Persona2 + "" + nombrePersona2);
				System.out.println(apellido1Persona1 + "" + apellido2Persona1 + "" + nombrePersona1);
			}

	}

}
