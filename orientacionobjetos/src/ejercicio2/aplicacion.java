/**
 * 
 */
package ejercicio2;

/**
 * @author usuario1daw
 *
 */
public class aplicacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		enemigo ene1 = new enemigo("neon","roca",400);
		enemigo ene2 = new enemigo("hoal", "tierra", 100);
		
		for (int i = 1; i<7; i++) {
			ene1.subirNivel();
		}

		for (int i = 1; i<3; i++) {
			ene2.subirNivel();
		}
		
		System.out.println("El enemigo " + ene1.getNombre() + " esta " + ene1.recibirdamage(0));
		System.out.println("El enemigo " + ene2.getNombre() + " esta " + ene2.recibirdamage(0));
	
		System.out.println(ene1);
		System.out.println(ene2);
		

	}


}
