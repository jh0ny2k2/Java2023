package ejercicio6relacion;

public class satelite {

	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	void Satelite (double m, double p, double d) {
	meridiano = m;
	paralelo = p;
	distancia_tierra = d;
	}
	
	
	void Satelite () {
	meridiano=paralelo=distancia_tierra=0;
	}
	
	
	public void setPosicion(double m, double p, double d) {
	meridiano = m;
	paralelo = p;
	distancia_tierra = d;
	}
	
	
	public void printPosicion() {
	System.out.print("El satélite se encuentra en ");
	System.out.print("el paralelo " + paralelo + " meridiano " + meridiano);
	System.out.print("a una distancia de la Tierra de" + distancia_tierra + " kms.");
	}
	
	public void variaaltura (double desplazamiento) {
		
	}
}
