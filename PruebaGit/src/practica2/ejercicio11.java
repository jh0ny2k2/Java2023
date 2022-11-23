package practica2;

public class ejercicio11 {

	public static void main(String[] args) {
		
		double area;
		double perimetro;
		double radio=3.6;

		area=Math.PI * Math.pow(radio, 2);
		System.out.println("El area es: " + area);
		
		perimetro=2 * Math.PI * radio;
		System.out.println("El perimetro es: " + perimetro);
		
	}

}
