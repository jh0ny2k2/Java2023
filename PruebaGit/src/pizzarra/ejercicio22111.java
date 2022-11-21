package pizzarra;

public class ejercicio22111 {

	public static void main(String[] args) {
		
		int numero=1;
		int suma=0;
		
		do {
			numero= numero+2;
			suma= suma + numero;
		}while(numero <= 1000);

		System.out.print(suma);
		
		
	}

}
