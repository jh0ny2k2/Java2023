package scotify;

import scotify.Cancion.Genero;

public class TestScotify {

	public static void main(String[] args) {
		
		Autor a1 = new Autor("autor1", "info1");
		Autor a2 = new Autor("autor3", "info3");
		
		Cancion c1 = new Cancion("cancion1", 120, 1, Genero.DISCO);
		Cancion c2 = new Cancion("cancion2", 138, 2, Genero.CLASICA);
		Cancion c3 = new Cancion("cancion3", 368, 3, Genero.TRAP);
		Cancion c4 = new Cancion("cancion4", 430, 1, Genero.DISCO);
		Cancion c5 = new Cancion("cancion5", 400, 2, Genero.ELECTRONICA);
		Cancion c6 = new Cancion("cancion6", 450, 3, Genero.LATINO);
		
		Podcast pc1 = new Podcast("Podcast1", 1000, "11/11/2021", 1);
		Podcast pc2 = new Podcast("Podcast2", 1020, "12/11/2021", 2);
		Podcast pc3 = new Podcast("Podcast3", 950, "13/11/2021", 2);
		
		Disco d1 = new Disco("Disco1", "11/6/2000", "autor1", "grupo1");
		Disco d2 = new Disco("Disco2", "11/6/2019", "autor2", "grupo2");
		
		Multimedia m1 = new Multimedia("multi10", 8552520);
		
		Scotify sc1 = new Scotify(null);
	
		d1.addCanciones(c4);
		d1.addCanciones(c5);
		d1.addCanciones(c6);
		d1.obtenerCanciones(c6);
		System.out.println(d1.getDuracion());
		
		d2.addCanciones(c1);
		d2.addCanciones(c2);
		d2.addCanciones(c3);
		
		
		
		
		sc1.addMultimedia(m1);
		System.out.println(sc1);
		
		
	}

}
