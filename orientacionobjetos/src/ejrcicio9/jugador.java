/**
 * 
 */
package ejrcicio9;

/**
 * @author usuario1daw
 *
 */
public class jugador {

	private String nombre;
	private String clase;
	private int nivel;
	private int salud;
	private int dañoarma;
	
	
	public jugador(String nombre, String clase, int dañoarma) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.dañoarma = dañoarma;
		this.nivel = 1;
		this.salud = 200;
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
	 * @return the nivel
	 */
	public int getNivel() {
		return nivel;
	}
	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(int nivel) {
		this.nivel = nivel;
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
	
	public void subirnivel() {
		
		this.nivel++;
		this.salud = this.salud + (int) (Math.pow(2, this.nivel));
	
	}
	
	public void recibirdanio(int daño) {
		this.salud =this.salud - daño;
		
		if (this.salud == 0) {
			System.out.println(this.nombre + " ha muerto");
		}
		
	}
	
	public void golpear(enemigo enemigo) {
		
		enemigo.recibirdanio(this.getDañoarma());
		
	}

	@Override
	public String toString() {
		return "jugador [nombre=" + nombre + ", clase=" + clase + ", nivel=" + nivel + ", salud=" + salud
				+ ", dañoarma=" + dañoarma + "]";
	}

	
}
