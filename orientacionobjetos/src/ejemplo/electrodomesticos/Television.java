package ejemplo.electrodomesticos;

public class Television extends Electrodomestico {

	enum tecnologia {OLED, QLED, MICROLED}
	enum resolucion {R_FHD, R_4K, R_8K} 
	
	private int pulgadas;
	private tecnologia tecnologia;
	private resolucion resolucion;
	
	public Television(String marca, String modelo, Double precioBase, Double peso, int pulgadas, tecnologia tecnologia, resolucion resolucion) {
		super(marca, modelo, precioBase, peso);
		this.pulgadas = pulgadas;
		this.tecnologia = tecnologia;
		this.resolucion = resolucion;
	}

	public Television(String marca, String modelo, Double precioBase, Double peso, consumo consumoElectrico,
			color color, int pulgadas, tecnologia tecnologia, resolucion resolucion) {
		super(marca, modelo, precioBase, peso, consumoElectrico, color);
		this.pulgadas = pulgadas;
		this.tecnologia = tecnologia;
		this.resolucion = resolucion;
	}

	//GETTERS DE PULGADAS, TECNOLOGIA, RESOLUCION
	
	public int getPulgadas() {
		return pulgadas;
	}

	public tecnologia getTecnologia() {
		return tecnologia;
	}

	public resolucion getResolucion() {
		return resolucion;
	}
	
	//TO STRINGS
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Television [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", preciobase=");
		builder.append(preciobase);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", consumo=");
		builder.append(consumo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", pulgadas=");
		builder.append(pulgadas);
		builder.append(", tecnologia=");
		builder.append(tecnologia);
		builder.append(", resolucion=");
		builder.append(resolucion);
		builder.append("]");
		return builder.toString();
	}
	
	
}
