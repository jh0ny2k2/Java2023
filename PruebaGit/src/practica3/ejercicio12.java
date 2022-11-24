package practica3;

import java.util.Scanner;
public class ejercicio12 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int numero=0, i, miles, centenas, decenas, unidades;
	String letra="";
	
	System.out.println("Dime el numero a convertir");
	try {
		numero=Integer.parseInt(sc.nextLine());
	}catch (Exception e) {
		System.out.println("Escribe un numero");
	}
	
	miles= numero / 1000;
	centenas = numero / 100 % 10;
	decenas = numero / 10 % 10;
	unidades = numero % 10; 
	
	//mil
	for (i=1; i<=miles; i++) {
		letra = letra + "M";
	}
	
	//centenas
	if (centenas == 9) {
		letra = letra + "CM";
	}else if (centenas >= 5) {
		letra = letra + "D";
		}else if (centenas<4) {
			letra = letra + "CD";
			}else {
				 for (i = 1; i <= centenas; i++) {
                     letra = letra + "C";
              }
			}
	
	//decenas
	if (decenas == 9) {
		letra = letra + "XC";
	}else if (decenas >= 5) {
		letra = letra + "L";
		}else if (decenas<4) {
			letra = letra + "XL";
			}else {
				 for (i = 1; i <= decenas; i++) {
                     letra = letra + "X";
              }
			}
	
	//unidades
		if (decenas == 9) {
			letra = letra + "IX";
		}else if (centenas >= 5) {
			letra = letra + "V";
			}else if (centenas<4) {
				letra = letra + "IV";
				}else {
					 for (i = 1; i <= decenas; i++) {
	                     letra = letra + "I";
	              }
				}
		
	System.out.println(letra);
	}
}
