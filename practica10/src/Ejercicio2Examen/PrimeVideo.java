package Ejercicio2Examen;

import java.util.ArrayList;

public class PrimeVideo {

	
	private ArrayList <Multimedia> catalogo;
	private ArrayList <Cliente> suscriptores;
	private double ganancia;
	
	
	public void addSuscriptor(Cliente c) {
		
		suscriptores.add(c);
	}
	
	public void addMultimedia(Multimedia m) {
		
		catalogo.add(m);
	}

	public int ver(Multimedia m, Cliente c) {
		
		System.out.println(m);
		System.out.println(c);
		
		if (c.esPro() == false) {
			
			this.ganancia = this.ganancia + m.precio;
		}
		return (int) this.ganancia;
	}
	
	
	public double getGanancias() {
		int contador = 0;
		
		for (Cliente c: suscriptores) {
			
			contador++;
		}
		
		ganancia = ganancia + (contador*12);
		
		return ganancia;
	}
	
	
	
}
