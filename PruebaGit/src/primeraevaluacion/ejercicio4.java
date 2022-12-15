package primeraevaluacion;

import java.util.Scanner;
public class ejercicio4 {

	public static void pintarMatriz(char[][] matriz) {
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int eleccion = 0;
		char  [][] matriz= new char [20][20];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				
			//Ponemos los puntos	
			matriz[i][j] = '.';
	
			//Columna derecha
			if (j == matriz[i].length - 1) {
				matriz[i][j] = '|';
			}
			
			//Columna izquierda
			if (j == 0) {
				matriz[i][j] = '|';
			}
			
			//Fila abajo
			if (i == matriz.length - 1) {
				matriz[i][j] = '-';
			}
			
			//Fila arriba
			if (i == 0) {
				matriz[i][j] = '-';
			}else if (j==19) {
				matriz[i][j] = '|';
			}
			
			matriz[0][19]='|';
			matriz[0][0]='@';
			matriz[19][0]='|';
	
			
			
			}
		}
		
		pintarMatriz(matriz);
		
		System.out.println("Introduce Opcion:");
		System.out.println("1. Derecha");
		System.out.println("2. Izquierda");
		System.out.println("3. Abajo");
		System.out.println("4. Arriba");
		try {
			eleccion=Integer.parseInt(sc.nextLine());
		}catch (Exception e) {
			System.out.println("Dime un numero");
		}
		
		switch(eleccion){
		case 1:	
			matriz[0][0]='|';
			matriz[0][1]='@';
			pintarMatriz(matriz);
		;break;
			
		case 2:
			System.out.println("Te has salido de la zona");
		;break;
			
		case 3: 
			matriz[0][0]='|';
			matriz[1][0]='@';
			pintarMatriz(matriz);
		;break;
			
		case 4: 
			System.out.println("Te has salido de la zona");
			pintarMatriz(matriz);
		;break;
		
		
		}
		
		/**do {
			for(int i=0; i < matriz.length; i++) {
				for(int j=0; j < matriz[i].length; j++) {
					
				//Ponemos los puntos	
				matriz[i][j] = '.';
		
				//Columna derecha
				if (j == matriz[i].length - 1) {
					matriz[i][j] = '|';
				}
				
				//Columna izquierda
				if (j == 0) {
					matriz[i][j] = '|';
				}
				
				//Fila abajo
				if (i == matriz.length - 1) {
					matriz[i][j] = '-';
				}
				
				//Fila arriba
				if (i == 0) {
					matriz[i][j] = '-';
				}else if (j==19) {
					matriz[i][j] = '|';
				}
				
				matriz[0][19]='|';
				matriz[0][0]='@';
				
				}
			}
		} while numero =1;
	**/

	
		
	}

}
