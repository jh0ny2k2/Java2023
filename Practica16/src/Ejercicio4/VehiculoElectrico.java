package Ejercicio4;

public class VehiculoElectrico extends Vehiculo {

	protected Integer kw;
	
	public VehiculoElectrico(String matricula, String marca, String modelo, String color, double precio,
			Integer caballos, boolean reaparado, Integer kw) {
		super(matricula, marca, modelo, color, precio, caballos, reaparado);
		this.kw = kw;
	}
	
	public VehiculoElectrico(VehiculoElectrico otro) {
		super(otro);
		this.kw = otro.kw;
	}
	
	

	public Integer getKw() {
		return kw;
	}

	public void setKw(Integer kw) {
		this.kw = kw;
	}
	
	

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehiculoElectrico [kw=");
		builder.append(kw);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", caballos=");
		builder.append(caballos);
		builder.append(", reaparado=");
		builder.append(reaparado);
		builder.append("]");
		return builder.toString();
	}

}
