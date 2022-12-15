package primeraevaluacion;

public class ejercicio2 {

	 public static double[] porcentajeApariciones(int n) {
	  
	        int[] contadores = new int[6];
	        for (int i = 0; i < n; i++) {
	            int dado = (int) (Math.random()*6 + 1);
	            contadores[dado - 1]++;
	        }

	        double[] porcentajes = new double[6];
	        for (int i = 0; i < 6; i++) {
	            porcentajes[i] = (contadores[i] * 100.0) / n;
	            System.out.println(porcentajes[i]);
	        }
	    
	        return porcentajes;
	    }
	
	
	public static void main(String[] args) {
		
		int dado1=0, dado2=0;
		int suma, tiradas, total=0;
		int n=1000;
		
		suma=0;
		tiradas=0;
		
		do {
            tiradas++;
            dado1 = (int) (Math.random()*6 + 1);
            dado2 = (int) (Math.random()*6 + 1);
            suma = dado1 + dado2;
            total= total + suma;
            System.out.println("Tirada " + tiradas + ": " + dado1 + " + " + dado2 + " = " + suma);
        } while (dado1 != 6 || dado2 != 6);

		
		
        System.out.println("numero de tiradas " + tiradas);
        System.out.println("El total de las tiradas es: " + total);
        System.out.println("El numero de porcentajes es:");
        porcentajeApariciones(n);
		
    }

}
