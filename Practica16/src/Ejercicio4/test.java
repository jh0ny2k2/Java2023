package Ejercicio4;

import java.util.Scanner;

import Ejercicio4.VehiculoFosil.tipo;

public class test {

	public static void main(String[] args) {
		
		
		Scanner sn = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("1.- Ingresar Coche");
			System.out.println("2.- Coche Reparado");
			System.out.println("3.- Buscar por Matricula");
			System.out.println("4.- Listar Vehiculos en el Taller");
			System.out.println("5.- Salir");
			System.out.println("Dime una opcion");
			opcion = Integer.parseInt(sn.nextLine());
			
			switch (opcion) {
			case 1: 
				
			
			}
			
		} while (opcion != 5);
		
		
	}

}
