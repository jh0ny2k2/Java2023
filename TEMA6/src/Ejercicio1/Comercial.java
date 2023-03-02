package Ejercicio1;

public class Comercial extends Empleados {

	private double comision;

	public Comercial(double comision,String nombre ,int edad,double salario){
	     super(nombre,edad,salario);
	     this.comision=comision;
	}
	
	 public  boolean Plus(){
		 
	      if(super.getEdad()>30 && this.comision>300 )
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
		builder.append("nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", comision=");
		builder.append(comision);
		builder.append("]");
		return builder.toString();
	}
	
	 
	 
}
