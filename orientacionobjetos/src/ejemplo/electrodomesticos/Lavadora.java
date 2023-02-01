package ejemplo.electrodomesticos;

public class Lavadora extends Electrodomestico {

	private int carga;
	
	//HERENCIA DE LA CLASE PADRE (ELECTRODOMESTICO)
	
	public Lavadora(String marca, String modelo, Double preciobase, Double peso, consumo consumo, color color , int carga) {
		super (marca, modelo, preciobase, peso, consumo, color);
		this.carga = carga;
	}
	
	//CONSTRUCTOR DE ELECTRODOMESTICO
	
	public Lavadora(String marca, String modelo, Double preciobase, Double peso, int carga) {
		super(marca, modelo, preciobase, peso);
		this.carga = carga;
	}
	
	//GETTER DE CARGA
	
	public int getcarga() {
		return carga;
	}
	
	//TO STRINGS DE LA CLASE 
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lavadora [");
		builder.append("color=");
		builder.append(color);
		builder.append(", consumoElectrico=");
		builder.append(consumo);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", precioBase=");
		builder.append(preciobase);
		builder.append(", carga=");
		builder.append(carga);
		builder.append("]");
		return builder.toString();
	}
	
	//METODO PARA CALCULAR EL DINAL DE UNA LAVADORA
	
	public double precioFinal() {
		double extra = 50;
		
		if (this.carga >= 8)
			return super.precioFinal() + extra;
		else
			return super.precioFinal();
	}
	
}
