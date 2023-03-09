package Ejercicio2Examen;

import Ejercicio2Examen.Genero.Generos;

public class Test {

	public static void main(String[] args) {
		
		Serie serie = new Serie("Breaking Bad", true, 10);
		for(int i=0; i<10; i++) {
				Temporada t = new Temporada(i, serie);
				for(int j=0; j<10; j++) {
				t.addEpisodios(new Episodio("Episodio "+j, 50));
		}
		serie.addTemporada(t);
		}
		
		ClientePrime cp = new ClientePrime("545464845d", "jhony", "FFFF@GGG.COM");
		ClientePrimePro cpp = new ClientePrimePro("545464845d", "jhony", "FFFF@GGG.COM");
		
		PrimeVideo primev = new PrimeVideo();
		primev.addSuscriptor(cpp);
		primev.addSuscriptor(cp);
		
		System.out.println(primev.getGanancias());
		
		
		
	}
	
	
	

}
