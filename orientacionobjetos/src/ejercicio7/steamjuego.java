package ejercicio7;

public class steamjuego {
	
	private String nombre;
	private String descripcion;
	private String url;
	private double mediajugadoresdiarios;
	private int diasdesdequesalio;
	private int precio;
	private String puestomasvendido;
	
	public steamjuego(String nombre, String descripcion, String url, double mediajugadoresdiarios,
			int diasdesdequesalio, String puestomasvendido) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url = url;
		this.mediajugadoresdiarios = mediajugadoresdiarios;
		this.diasdesdequesalio = diasdesdequesalio;
		this.puestomasvendido = puestomasvendido;
		this.precio = 0;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the mediajugadoresdiarios
	 */
	public double getMediajugadoresdiarios() {
		return mediajugadoresdiarios;
	}

	/**
	 * @param mediajugadoresdiarios the mediajugadoresdiarios to set
	 */
	public void setMediajugadoresdiarios(double mediajugadoresdiarios) {
		this.mediajugadoresdiarios = mediajugadoresdiarios;
	}

	/**
	 * @return the diasdesdequesalio
	 */
	public int getDiasdesdequesalio() {
		return diasdesdequesalio;
	}

	/**
	 * @param diasdesdequesalio the diasdesdequesalio to set
	 */
	public void setDiasdesdequesalio(int diasdesdequesalio) {
		this.diasdesdequesalio = diasdesdequesalio;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the puestomasvendido
	 */
	public String getPuestomasvendido() {
		return puestomasvendido;
	}

	/**
	 * @param puestomasvendido the puestomasvendido to set
	 */
	public void setPuestomasvendido(String puestomasvendido) {
		this.puestomasvendido = puestomasvendido;
	}
	
	
	
	@Override
	public String toString() {
		return "steamjuego [nombre=" + nombre + ", descripcion=" + descripcion + ", url=" + url
				+ ", mediajugadoresdiarios=" + mediajugadoresdiarios + ", diasdesdequesalio=" + diasdesdequesalio
				+ ", precio=" + precio + ", puestomasvendido=" + puestomasvendido + "]";
	}

	public int  jugadoresdia (int jugadoreshoy) {
		
		jugadoreshoy = (int) (((mediajugadoresdiarios * diasdesdequesalio) + jugadoreshoy) / (diasdesdequesalio + 1));
		
		return jugadoreshoy;
		
	}
	
	
}
