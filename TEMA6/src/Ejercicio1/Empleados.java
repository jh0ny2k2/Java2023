package Ejercicio1;

public class Empleados {
	
	protected String nombre;
	protected int edad;
	protected double salario;
	protected int plus;
	
	
	 public Empleados (String nombre,int edad,double salario){
	      this.nombre=nombre;
	      this.edad=edad;
	      this.salario=salario;
	      }
	
	

	public void setNombre(String nombre){
	       this.nombre=nombre;
	        }
	 
	  public String getNombre(){
	      return nombre;
	  }
	    public int getEdad() {
	        return edad;
	    }
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	    public double getSalario() {
	        return salario;
	    }
	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Empleados [nombre=");
			builder.append(nombre);
			builder.append(", edad=");
			builder.append(edad);
			builder.append(", salario=");
			builder.append(salario);
			builder.append(", plus=");
			builder.append(plus);
			builder.append("]");
			return builder.toString();
		}
	 
	 
}
