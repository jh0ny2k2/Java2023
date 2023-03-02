package Ejercicio1;

public class Test {

	public static void main(String[] args) {
		
		Comercial co1 = new Comercial(1500, "juan", 39, 200);
		Repartidor re1 = new Repartidor (3, "Pedro", 25, 100);
		
		System.out.println(co1);
		System.out.println(re1);
		
		co1.Plus();
		re1.Plus();
		
		System.out.println(co1);
		System.out.println(re1);
		
		
	}

}
