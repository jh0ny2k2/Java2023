/**
 * 
 */
package ejercicio2;

/**
 * @author usuario1daw
 *
 */
public class enemigo {
	
	private String nombre;
	private String tipo;
	private int salud;
	private int nivel;
	private int damage;
	
	
	
	public enemigo(String nombre, String tipo, int damage) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.salud = 100;
		this.nivel = 1;
		this.damage = damage;
	}



	public enemigo() {
		super();
		this.nombre = "";
		this.tipo = "";
		this.salud = 0;
		this.nivel = 0;
		this.damage = 0;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void subirnivel() {
		
	}
	
	public int subirNivel() {
		int nuevonivel;
		int nuevasalud;
		
		nuevonivel = this.nivel + 1;
		nuevasalud = (int) (this.salud + (Math.pow(2, nuevonivel)));
		this.salud=nuevasalud;
		this.nivel=nuevonivel;
		
		return nuevonivel;
	}
	
	public int recibirdamage(int damage) {
	
		
		this.salud = this.salud - this.damage;
		
		if (this.salud <= 0) {
			System.out.println("Muerto");
		} else {
			System.out.println("Vivo");
		}
		
		return this.salud;
	}
	
	
	
	

}
