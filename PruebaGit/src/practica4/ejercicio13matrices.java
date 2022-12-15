package practica4;

import java.util.Scanner;
public class ejercicio13matrices {
	
	public static void pintarMatriz(int[][] matriz) {
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [][] matriz = new int [3][4];
		int suma=0;
		
		System.out.println("Dime los numeros");
		for (int i=0; i<matriz.length; i++) {;
			for (int j=0 ; j<matriz.length; j++) {
				matriz [i][j] = Integer.parseInt(sc.nextLine());
				suma += matriz[i][j];
				if (j==4) {
					matriz [i][j] = suma;
				}
			}
		}
		pintarMatriz(matriz);
	}

}
