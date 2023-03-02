package Ejercicio1;

public class Repartidor extends Empleados {
	
	private int zona;
	int numero = 0;
	
	public Repartidor(int zona, String nombre, int edad, double salario) {
		super(nombre,edad,salario);
		this.zona = zona;
	}

	
	
	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public  boolean Plus(){
		 
	      if(super.getEdad()<25 && this.zona == 3 )
	      {
	          double NSalario =(this.plus + super.getSalario());
	          super.setSalario(NSalario);
	          return true;
	      }
	         return false;
	      }



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", zona=");
		builder.append(zona);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
