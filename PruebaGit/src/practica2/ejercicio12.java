package practica2;

public class ejercicio12 {

	public static void main(String[] args) {
		
		int a=1, b=3;
		int c;
		
		System.out.println("la variable a es: " + a);
		System.out.println("La variable b es: " + b);

		
		c=a;
		a=b;
		b=c;
		
		System.out.println("la variable a nueva es: " + a);
		System.out.println("La variable b nueva es: " + b);

	}

}
