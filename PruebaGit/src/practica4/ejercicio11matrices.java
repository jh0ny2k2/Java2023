package practica4;

public class ejercicio11matrices {

	public static void vectores ( int numero[][]) {
		System.out.println("[");
		for (int i=0; i<numero.length; i++) {
			for (int j=0; j<numero.length; j++) {
				System.out.print(numero[i][j] + ", ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int [][] vector = new int [5][5];
		
		for (int i=0; i<5 ; i++) {
			if(i==vector[i][0]) {
				System.out.println();
			}
			for (int j=0; j<5; j++) {
				vector[0][j] = 1;
				System.out.print(vector[i][j]);
			}
			System.out.println();
		}
		
 
	}

}
