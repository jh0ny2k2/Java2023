/**
 * 
 */
package ejrcicio9;

/**
 * @author usuario1daw
 *
 */
public class enemigo {

	private String nombre;
	private String clase;
	private int salud;
	private int dañoarma;
	
	
	public enemigo(String nombre, String clase, int dañoarma) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.dañoarma = dañoarma;
		this.salud = 100;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}
	/**
	 * @param clase the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}
	/**
	 * @return the salud
	 */
	public int getSalud() {
		return salud;
	}
	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}
	/**
	 * @return the dañoarma
	 */
	public int getDañoarma() {
		return dañoarma;
	}
	/**
	 * @param dañoarma the dañoarma to set
	 */
	public void setDañoarma(int dañoarma) {
		this.dañoarma = dañoarma;
	}
	
	public void recibirdanio(int daño) {
		this.salud =this.salud - daño;
		
		if (this.salud == 0) {
			System.out.println(this.nombre + " ha muerto");
		}
		
	}
	
	public void golpear(jugador jugador) {
		
		jugador.recibirdanio(this.getDañoarma());
		
	}

	@Override
	public String toString() {
		return "enemigo [nombre=" + nombre + ", clase=" + clase + ", salud=" + salud + ", dañoarma=" + dañoarma + "]";
	}
	
	
	
}
	
