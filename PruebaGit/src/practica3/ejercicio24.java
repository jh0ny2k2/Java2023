package practica3;

import java.util.Scanner;
public class ejercicio24 {
		
		public static void main( String[] args ) {
		      int numero, invertido = 0, resto;
		 
		      Scanner sc = new Scanner( System.in );

		      System.out.println( "Introduce un número: " );
		 
		      numero = sc.nextInt();
		 
		      while( numero > 0 ) {
		         resto = numero % 10;
		         invertido = invertido * 10 + resto;
		         numero /= 10;
		      }
		 
		      System.out.println( "Número invertido: " + invertido );
		   }
		 
		}
