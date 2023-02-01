package ejemplo.electrodomesticos;

import ejemplo.electrodomesticos.Electrodomestico.color;
import ejemplo.electrodomesticos.Electrodomestico.consumo;
import ejemplo.electrodomesticos.Television.resolucion;
import ejemplo.electrodomesticos.Television.tecnologia;

public class Aplicacion {

	public static void main(String[] args) {
		
		Electrodomestico e1 = new Electrodomestico ("bosc", "c1", 350.0, 10.0, consumo.E, color.BLANCO);
		System.out.println(e1.precioFinal());
		
		Lavadora l1 = new Lavadora ("philips", "e2" , 800.0, 10.0, consumo.C, color.GRIS, 10);
		System.out.println(l1.precioFinal());
		
		Lavadora l2 = new Lavadora ("philips", "e3" , 680.0, 10.0, consumo.C, color.GRIS, 5);
		System.out.println(l2.precioFinal());
		
		Television t1 = new Television ("lg", "a345", 500.0, 8.0, consumo.B, color.NEGRO, 47, tecnologia.MICROLED, resolucion.R_4K);
		System.out.println(t1.precioFinal());

	}

}
