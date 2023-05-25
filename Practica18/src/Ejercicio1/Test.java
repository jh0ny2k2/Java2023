package Ejercicio1;

import java.util.Scanner;

import Ejercicio1.Gamer.Nivel;

public class Test {

	public static void main(String[] args) {
	
	Discord ds = new Discord();
	Scanner s = new Scanner(System.in);
	int opcion = 0;
	
	while (opcion != 5) {
		System.out.println("1 - Crear Jugador");
		System.out.println("2 - Eliminar Jugador");
		System.out.println("3 - Buscar por Nick");
		System.out.println("4 - Listar Jugadores");
		System.out.println("5 - Guardar y Salir");

		System.out.println("Elige una de las opciones anteriores");
		opcion = s.nextInt();
		
		switch (opcion) {
		case 1: 
			System.out.println("Introduce el nick");
			String nick = s.nextLine();
			
			System.out.println("Introduce el email");
			String email = s.nextLine();
			
			System.out.println("Introduce el juego");
			String juego= s.nextLine();
			
			System.out.println("Introduce el nivel");
			Nivel nivel = Nivel.valueOf(juego);
			
			Gamer jugador = new Gamer(nick, email, juego, nivel);
			ds.addGamer(jugador);
			break;
		case 2:
			System.out.println("Que jugador quieres eliminar");
			String nick1 = s.nextLine();
			
			Gamer gamerEliminar = ds.findGamer(nick1);
            if (gamerEliminar != null) {
                ds.removeGamer(gamerEliminar);
            }
		case 3:
			System.out.println("Que jugador quieres buscar");
			String nickBuscar = s.nextLine();
			
			Gamer gamerBuscar = ds.findGamer(nickBuscar);
            if (gamerBuscar != null) {
                ds.removeGamer(gamerBuscar);
            }
            break;
           
		case 4:
			ds.listarGamers();
			break;
			
		case 5:
			ds.guardarGamers();
			break;
		}
		
	}
	
	
	}

}
