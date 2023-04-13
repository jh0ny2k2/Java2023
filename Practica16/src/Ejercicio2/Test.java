package Ejercicio2;

public class Test {

	public static void main(String[] args) {
		
 		Biblioteca bb1 = new Biblioteca("fff");

 		bb1.adquirirMaterial(new Publicacion(new Libro("5445545", "Juan", 2015, 100, false)));
 		bb1.adquirirMaterial(new Publicacion(new Libro("5512145", "pepe", 2016, 189, true)));
 		bb1.adquirirMaterial(new Publicacion(new Libro("5484515", "alfredo", 2019, 135, false)));
 		bb1.adquirirMaterial(new Publicacion(new Libro("6522545", "andres", 2011, 120, false)));
 		bb1.adquirirMaterial(new Publicacion(new Libro("5554542", "masi", 2000, 320, true)));
 		bb1.adquirirMaterial(new Publicacion(new Libro("7889741", "sergio", 2012, 250, false)));
 		bb1.adquirirMaterial(new Publicacion(new Libro("1215665", "pedro", 2013, 200, false)));
 		bb1.adquirirMaterial(new Publicacion(new Libro("5899324", "ana", 2017, 180, false)));
 		bb1.adquirirMaterial(new Publicacion(new Libro("9522323", "marcos", 2020, 160, false)));
 		bb1.adquirirMaterial(new Publicacion(new Libro("4103218", "loli", 2021, 120, false)));
 		
 		bb1.adquirirMaterial(new Publicacion(new Revista("1231315", "Amor", 2021, 30, 25)));
 		bb1.adquirirMaterial(new Publicacion(new Revista("5465456", "Game", 2021, 30, 30)));
 		bb1.adquirirMaterial(new Publicacion(new Revista("6111231", "SoyMotor", 2022, 21, 1)));
 		bb1.adquirirMaterial(new Publicacion(new Revista("5646162", "Marca", 2022, 15, 1)));
 		bb1.adquirirMaterial(new Publicacion(new Revista("4567788", "As", 2022, 10, 1)));
 		
 		System.out.println(bb1);
 		
	}
	
}
