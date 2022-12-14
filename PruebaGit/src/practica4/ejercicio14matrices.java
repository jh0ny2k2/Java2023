package practica4;

public class ejercicio14matrices {

	public static void pintarMatriz(int[][] matriz) {
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] marco = new int[8][6];
		
		for(int i=0; i < marco.length; i++) {
			for(int j=0; j < marco[i].length; j++) {
				
				marco[i][j] = 0;

				if (i == 0) {
					marco[i][j] = 1;
				}

				if (i == marco.length - 1) {
					marco[i][j] = 1;
				}

				if (j == 0) {
					marco[i][j] = 1;
				}

				if (j == marco[i].length - 1) {
					marco[i][j] = 1;
				}
				
			}
		}
		
		pintarMatriz(marco);

	}

}