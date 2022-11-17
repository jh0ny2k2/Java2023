package practica2;

public class ejercicioclase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double notapractica1= 5;
		double notapractica2= 10;
		double notapractica3= 6;
		double notaexamen=2.9 ;
		double notamediapractica=0;
		double notafinal=0;
		
		notamediapractica = (notapractica1 + notapractica2 + notapractica3) /3;
		notafinal= (notamediapractica * 0.6) + (notaexamen * 0.4);
		
		if (notamediapractica <3) {
			System.out.println("La parte practica esta suspensa");
		}else{
			System.out.println("La practica esta aprobada");
		}
		
		if (notaexamen<3) {
			System.out.println("El examen esta suspenso");
		}else{
			System.out.println("El examen esta aprobado");
		}
		
		if (notafinal<5) {
			System.out.println("El trimestre esta suspenso");
		}else if ((notafinal>=5) && (notafinal<=8)){
			System.out.println("El trimestre esta aprobado con notable");
			}else if (notafinal>8){
				System.out.println("El trimestre esta aprobado con sobresaliente");
			}
		
		
		
	}

}
