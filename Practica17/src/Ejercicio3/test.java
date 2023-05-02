package Ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		
		Stim s1 = new Stim();
		
		Juego j1 = new Juego("League of Legends", "PC");
		Juego j2 = new Juego("Valorant", "PC");
		Juego j3 = new Juego("GTA V", "PC");
		Juego j4 = new Juego("GTA V", "PS4");
		Juego j5 = new Juego("GTA V", "XBOX ONE");
		Juego j6 = new Juego("Fifa 21", "PS4");
		Juego j7 = new Juego("Forza Horizon", "PC");
		Juego j8 = new Juego("Overrwacht", "PC");
		Juego j9 = new Juego("Paladins", "PS4");
		Juego j10 = new Juego("Fortnite", "PC");
		
		s1.addJuego(j10);
		s1.addJuego(j9);
		s1.addJuego(j8);
		s1.addJuego(j7);
		s1.addJuego(j6);
		s1.addJuego(j5);
		s1.addJuego(j4);
		s1.addJuego(j3);
		s1.addJuego(j2);
		s1.addJuego(j1);
		
		Usuario u1 = new Usuario("perfil 1", "dd@dd", "p1");
		u1.addPuntuacion(j10, true, 120);
		u1.addPuntuacion(j5, false, 80);
		u1.addPuntuacion(j4, true, 250);
		u1.addPuntuacion(j9, false, 44);
		u1.addPuntuacion(j10, false, 10);
		
		Usuario u2 = new Usuario("perfil 2", "dd@dd", "p2");
		u2.addPuntuacion(j1, false, 44);
		u2.addPuntuacion(j10, true, 180);
		u2.addPuntuacion(j8, true, 145);
		u2.addPuntuacion(j10, false, 45);
		u2.addPuntuacion(j3, false, 10);
		
		Usuario u3 = new Usuario("perfil 3", "dd@dd", "p3");
		u3.addPuntuacion(j10, false, 400);
		u3.addPuntuacion(j4, false, 47);
		u3.addPuntuacion(j3, true, 222);
		u3.addPuntuacion(j4, true, 785);
		u3.addPuntuacion(j6, true, 500);
		
		Usuario u4 = new Usuario("perfil 4", "dd@dd", "p4");
		u4.addPuntuacion(j2, true, 500);
		u4.addPuntuacion(j5, true, 455);
		u4.addPuntuacion(j7, true, 680);
		u4.addPuntuacion(j10, true, 890);
		u4.addPuntuacion(j3, true, 640);
		
		Usuario u5 = new Usuario("perfil 5", "dd@dd", "p5");
		u5.addPuntuacion(j8, true, 475);
		u5.addPuntuacion(j4, true, 0);
		u5.addPuntuacion(j10, false, 0);
		u5.addPuntuacion(j8, true, 450);
		u5.addPuntuacion(j6, true, 462);
		
		s1.addJugador(u1);
		s1.addJugador(u2);
		s1.addJugador(u3);
		s1.addJugador(u4);
		s1.addJugador(u5);
		
		ArrayList<Usuario> usuarios = new ArrayList<>();
		usuarios.add(u5);
		usuarios.add(u4);
		usuarios.add(u3);
		usuarios.add(u2);
		usuarios.add(u1);
		
		ArrayList<Juego> juegos = new ArrayList<>();
		juegos.add(j10);
		juegos.add(j9);
		juegos.add(j8);
		juegos.add(j7);
		juegos.add(j6);
		juegos.add(j5);
		juegos.add(j4);
		juegos.add(j3);
		juegos.add(j2);
		juegos.add(j1);
		
		
		//MUESTRA POR PANTALLA TODOS LOS USUARIOS ORDENADOS POR NICK, MUESTRA EMAIL Y NICK
		
		usuarios.stream()
				.sorted(Comparator.comparing(Usuario::getNick))
				.forEach(usuario -> System.out.println(usuario.getNick() + " " + usuario.getEmail()));
		
		//METODO QUE MUESTRE CADA USUARIO (NICK) Y PARA CADA UNO LA PUNTUACIONES DE LOS JUEGOS A LOS QUE JUEGA
		

						
		//METODO QUE RECIBA COMO PARAMETRO UN USUARIO Y MUESTR TODAS SUS PUNTUACIONES ORDENADAS POR PUNTOS
						
		

				
		
		
	}

}
