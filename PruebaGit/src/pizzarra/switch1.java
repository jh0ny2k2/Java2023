package pizzarra;

public class switch1 {

	public static void main(String[] args) {
		
		int diasemana=10;
		
		switch (diasemana) {
		case 1: {
			System.out.println("Lunes"); 
			break;
		}
		case 2: {
			System.out.println("martes"); 
			break;
		}
		case 3: {
			System.out.println("Miercoles"); 
			break;
		}
		case 4: {
			System.out.println("Jueves"); 
			break;
		}
		case 5: {
			System.out.println("Viernes"); 
			break;
		}
		case 6: {
			System.out.println("Sabado"); 
			break;
		}
		case 7: {
			System.out.println("Domingo"); 
			break;
		}
		default :
			System.out.println("Dia de la semana incorrecto");
		}
	}
	}
