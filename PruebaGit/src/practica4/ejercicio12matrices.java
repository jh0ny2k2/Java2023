package practica4;

public class ejercicio12matrices {

	public static void main(String[] args) {
		
		int [][]matriz = new int [8][6];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[0].length; j++) {
				if (i==0) {
					matriz[i][j]=1;
				} else if (i==matriz.length-1) {
					matriz[i][j]=1;
				}else if (j==0) {
					matriz[i][j]=1;
				}else if (j==matriz[0].length-1) {
					matriz[i][j]=1;
				}else 
					matriz[j][j]=0;
				System.out.print(matriz[i][j]+" | ");
		
			}
			System.out.println();	
			
		}
		}
	}
