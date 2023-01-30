/**
 * 
 */
package ejrcicio9;

/**
 * @author usuario1daw
 *
 */
public class aplicacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		jugador jugador1 = new jugador("jhony", "mago", 60);
		enemigo ene1 = new enemigo("roca", "roca", 90);
		enemigo ene2 = new enemigo("piedra", "roca", 50);
		
		System.out.println(ene1);
		System.out.println(ene2);
		System.out.println(jugador1);

	}

}
