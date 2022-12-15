package primeraevaluacion;

public class ejercicio1 {

	
	
	public static String sustituirvocales(String parametro, char vocal) {
		String resultado="";
		for (int i=0; i<parametro.length();i++) {
			
			char c=parametro.charAt(i);
			
			if (esvocal(c)) {
				c=vocal;
			}
		
			resultado += c;
		}
		
		return resultado;
		
	}
	
	public static boolean esvocal( char c) {
		
		return (c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
	
	
	public static void main(String[] args) {
		
		String parametro="Mi amiga Ana es prima de Eva y de Irene";
		char vocal='a';
		String resultado;
		resultado=sustituirvocales(parametro,vocal);
		
		
		System.out.println("resultado: " + resultado);

	}

}
