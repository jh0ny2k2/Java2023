package pizzarra;

public class switch2 {

	public static void main(String[] args) {
		
		char operador;
		int numero1=5, numero2=12, total1=0;
		double total=0;
		
		operador='%';
		
		switch (operador) {
		case '+': {
			total=numero1 + numero2;
			System.out.println(total);
			break;
		}
		
		case '-' : {
			total=numero1 - numero2;
			System.out.println(total);
			break;
		}
		
		case '*' : {
			total=numero1 * numero2;
			System.out.println(total);
			break;
		}
		
		case '/' : {
			total=numero1 / numero2;
			System.out.println(total);
			break;
		}
		
		case '%' : {
			total=numero1 % numero2;
			System.out.println(total);
			break;
		}
		
		case 's' : {
			total=Math.sin(numero1);
			System.out.println("numero 1" + total);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operador);
		}

	}

}
