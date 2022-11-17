package pizzarra;

public class ejercicioclase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int edad=35 ;
				char sexo='m';
				
				
				//Hombre
				if (sexo=='h') {
					if (edad<=11) {
						System.out.println("Eres niño");
					}	else if ((edad>=12) && (edad<=18)){
						System.out.println("Eres adolescente");
						}	else if ((edad>= 19) && (edad<=29)){
						System.out.println("Eres joven");
							}	else if ((edad>= 30) && (edad<=55)){
						System.out.println("Eres hombre");
								}	else if (edad>= 56){
						System.out.println("Eres viejo");
					}
				}
				
				//Mujer
				if (sexo=='m') {
					if (edad<=11) {
						System.out.println("Eres niña");
					}	else if ((edad>=12) && (edad<=18)){
						System.out.println("Eres adolescente");
						}	else if ((edad>= 19) && (edad<=29)){
						System.out.println("Eres joven");
							}	else if ((edad>= 30) && (edad<=55)){
						System.out.println("Eres mujer");
								}	else if (edad>= 56){
						System.out.println("Eres vieja");
					}
				}
	}

}
