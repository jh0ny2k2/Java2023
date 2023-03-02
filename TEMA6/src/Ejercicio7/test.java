package Ejercicio7;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		
		Agenda ag1 = new Agenda();
		
		while (numero != 5) {
			
			System.out.println("AGENDA TELEFONICA");
			System.out.println("=================");
			System.out.println("1.Anadir nuevo contacto");
			System.out.println("2.Listar contactos");
			System.out.println("3.Buscar contacto");
			System.out.println("4.Eliminar contacto");
			System.out.println("5.Salir");
			System.out.println("Elige una opcion: ");
			
			numero=Integer.parseInt(sc.nextLine());
			
			switch (numero) {
				case 1:
					
					String nombre;
					String num;
					
					System.out.println("Has seleccionado añadir nuevo contacto");
					System.out.println("Dime el nombre del contacto");
					nombre = sc.nextLine();
					System.out.println("Dime el numero del contacto");
					num = sc.nextLine();
					
					ag1.addContacto(new Contacto(nombre, num));
					
					System.out.println("Se ha añadido el contacto correctamente");
					break;
					
				case 2: 
					
					System.out.println("Has elegido listar contacto");
					
					ag1.listarContacto();
					break;
					
				case 3:
					System.out.println("Has elegido buscar contacto");
					
					
					System.out.println("Dime el nombre del contacto a buscar");
					nombre = sc.nextLine();
					
					ag1.buscarContacto(nombre);
				
				case 4: 
					
					System.out.println("Has elegido Borrar contacto");
					System.out.println("Dime el nombre del contacto que quieres borrar");
					nombre = sc.nextLine();
					
			}
			
		}
		
		
		
	}

}
