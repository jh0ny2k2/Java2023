package practica2;

public class ejercicio16 {

	public static void main(String[] args) {
		
		double pi=Math.PI;
		double diametro;
		double altura;
		double area, volumen,radio;
		
		altura=42.4;
		diametro=15.5;
		radio=diametro/2;
		
		area= 2*pi*radio*altura + 2*pi*(radio*radio);
		System.out.println("El area del cilindro es: " + area);
		volumen=pi*(radio*radio)*altura;
		System.out.println("El volumen del cilindro es: " + volumen);
	}

}
