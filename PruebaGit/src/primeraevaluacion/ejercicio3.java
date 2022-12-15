package primeraevaluacion;


import java.util.Arrays;
public class ejercicio3 {

	//Rellenamos el array con el valor
	public static void rellenar(int array[], int valor) {
		for (int i = 0;i<array.length;i++) {
			array[i]=valor;
		}
	}
	
	
	/**
	//Funcion para la ordenacion de el array
	public static void ordenar(int array[]) {
			for(int i=0; i<array[0]; i++) {
				for(int h=0; h<array.length-1; h++) {
					if (array[j][i] > array[j+1][i]) {
						int aux = array[h][j];
						array[h][j] = array[h+1][j];
						array[h+1][j] = aux;
					
				
	}
	**/
	
	
	//Printemos en array en pantalla
	public static void pintarMatriz(int[] array) {
		for(int i=0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		
		int [] array = new int[50];
		int valor=100;
		
		Arrays.fill(array,100);	
		Arrays.toString(array);
		Arrays.sort(array);
		Arrays.toString(array);
		Arrays.copyOf(array, 0);
		Arrays.toString(array);
		
		pintarMatriz(array);
	}

}
