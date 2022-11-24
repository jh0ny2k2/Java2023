package practica2;

public class ejercicio18 {

	public static void main(String[] args) {
		
		int a=10, b=3, e=1, d; //estaba dos veces la e
		boolean c = false;
		float x, y;
		
		x= a / b;
		c = a < b && c; //la c no estaba puesta como boolean
		d = a + b++;
		e = a++ - b; //los mas tienen que ir detras de la a en vez de adelante
		y = (float)a / b;

	}

}
