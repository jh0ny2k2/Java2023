package ejercicioclasearraylist;

public class testreceta {

	public static void main(String[] args) {
		
		receta rece1 = new receta ("macarrones");
		
		rece1.addingredientes(new ingredientes("macarrones", 20));
		rece1.addingredientes(new ingredientes("tomate frito", 1));
		rece1.addingredientes(new ingredientes("salchichas", 5));
		rece1.addingredientes(new ingredientes("atun", 1));
		rece1.addingredientes(new ingredientes("ajos", 12));
		
		System.out.println(rece1);
		
	}

}
