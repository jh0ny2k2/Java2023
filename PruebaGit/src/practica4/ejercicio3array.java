package practica4;

import java.util.Scanner;
public class ejercicio3array {

		public static int media(int vector[]) {
			
			int media = 0;
			for (int i=0; i<vector.length; i++) {
				media += vector [i];
			}
			media= media/10;
			return media;
	
}

		public static int mayor(int vector[]) {

			int mayor= 0;
			for (int i=0; i<vector.length; i++) {
				if (mayor<vector[i]) {
					mayor = vector[i];
				}
			}
	
			return mayor;
		}

		public static int menor(int vector[]) {
		
			int menor= 999;
			for (int i=0; i<vector.length; i++) {
				if (menor>vector[i]) {
					menor = vector[i];
				}
			}
			return menor;
	
}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int vector[]= new int[10];
		
		System.out.println("Dime los numeros");
		
		for (int i=0; i<vector.length; i++) {
			vector[i] = sc.nextInt();
		}
		
		System.out.println("La media es de:"+ media(vector));
		System.out.println("El mayor es: "+ mayor(vector));
		System.out.println("El menor es: "+ menor(vector));
	
	
	
	
}

}

	}

}
