package practica2;

public class Ej1_1 {

	public static void main(String[] args) {
		
		int a= 6 , b=2, c=3;
		int res = 0;
		
		res = (a*c) % c; //1º a*c 2º resultado * c
		res = a * b / c; // a por b entre c
		res = c % b + c * b; //1º c % b 2º c * b 3º suma de ellos
		res = a % (a * b *c / (b + c)); //1º a+b 2º a*b 3º resulta de 2º *c 4º result de 3º / resultado de 1º 5º a% resultado de 4º
		res = b * b + c - b * (a % b);  //1º parentesis 2º b*b 3º b por parentesis 4º resul de 2º + c 5º resta de lo que queda
				
				
		System.out.println(res);

	}

}
