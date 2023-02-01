package ejemplo.electrodomesticos;

public class Electrodomestico {

	enum consumo {A, B, C, D ,E, F}
	enum color {BLANCO, NEGRO, ROJO, AZUL, GRIS}
	
	//ATRIBUTOS 
	protected String marca;
	protected String modelo;
	protected double preciobase;
	protected double peso;
	protected consumo consumo;
	protected color color;
	
	//CONSTRUCTOR PARA DECIR POR DEFECTO
	
	public Electrodomestico() {
		super();
		this.preciobase = 100;
		this.peso = 5;
		this.consumo = consumo.F;
		this.color = color.BLANCO;
	}

	//CONSTRUCTOR CON SOLO MARCA, MODELO, PRECIO Y PESO
	
	public Electrodomestico(String marca, String modelo, double preciobase, Double peso) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.preciobase = preciobase;
		this.peso = peso;
		this.consumo = consumo.F;
		this.color = color.BLANCO;
	}
	
	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	
	public Electrodomestico(String marca, String modelo, double preciobase, Double peso, consumo consumo, color color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.preciobase = preciobase;
		this.peso = peso;
		this.consumo = consumo;
		this.color = color;
	}

	//GETTERS DE TODOS LOS ATRIBUTOS
	

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public double getPreciobase() {
		return preciobase;
	}

	public double getPeso() {
		return peso;
	}

	public consumo getConsumo() {
		return consumo;
	}

	public color getColor() {
		return color;
	}
	
	//METODO PARA CALCULAR EL PRECIO FINAL
	
	public double precioFinal() {
		double preciofinal = this.preciobase;
		
		//COMPROBAR LETRA
		switch (this.consumo) {
		case A: 
			preciofinal += 100;
			break;
		case B:
			preciofinal +=80;
			break;
		case C:
			preciofinal += 60;
			break;
		case D:
			preciofinal += 50;
			break;
		case E:
			preciofinal += 30;
			break;
		case F:
			preciofinal += 10;
			break;
			
		default:
			break;
		}
		
		//COMPROBAR PESO
		if (this.peso >= 00 && this.peso <= 19) {
			preciofinal += 10;
		}else if (this.peso > 19 && this.peso <=49) {
			preciofinal += 50;
		}else if (this.peso > 49 && this.peso <= 79) {
			preciofinal += 80;
		}else if (this.peso >79) {
			preciofinal += 100;
		}
		
		return preciofinal;
	}
	
	//TO STRING DE LA CLASE 
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Electrodomestico [marca=");
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
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
