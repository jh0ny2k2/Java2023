package practica3;

import java.util.Scanner;
public class ejercicio25 {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
	       int N, aux, inverso = 0, cifra;
	        
	           System.out.print("Introduce un número >= 10: ");
	           N = sc.nextInt();
	      
	 
	       aux = N;
	       while (aux!=0){
	           cifra = aux % 10;
	           inverso = inverso * 10 + cifra;
	           aux = aux / 10;
	       }
	
	       if(N == inverso){
	           System.out.println("Es capicua");
	       }else{
	           System.out.println("No es capicua");
	       }
	    }
	}
