package practica3;

import java.util.Scanner;
public class ejercicio26 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int dia, mes, año;
		
		System.out.println("Dime el dia");
		dia=Integer.parseInt(sc.nextLine());
		System.out.println("Dime el mes");
		mes=Integer.parseInt(sc.nextLine());
		System.out.println("Dime el año");
		año=Integer.parseInt(sc.nextLine());
		
		switch (mes) {
		case 1: 
			if ((dia>0) && (dia<=30)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==31) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
		break;
		case 2: 
			if ((dia>0) && (dia<=27)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==28) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
		case 3: 
			if ((dia>0) && (dia<=30)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==31) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
		case 4: 
			if ((dia>0) && (dia<=29)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==30) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
		case 5:
			if ((dia>0) && (dia<=30)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==31) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
		case 6: 
			if ((dia>0) && (dia<=29)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==30) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
		case 7:
			if ((dia>0) && (dia<=30)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==31) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
		case 8: 
			if ((dia>0) && (dia<=30)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==31) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
		case 9: 
			if ((dia>0) && (dia<=29)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==30) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
		case 10:
			if ((dia>0) && (dia<=30)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==31) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
		case 11:
			if ((dia>0) && (dia<=29)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==30) {
				mes = mes + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
		case 12:
			if ((dia>0) && (dia<=30)){
				dia = dia + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}else if (dia ==31) {
				dia=1;
				mes=1;
				año = año + 1;
				System.out.println("el siguiente dia es " + dia + "/" + mes + "/" + año);
			}
			break;
	}

	}

}
