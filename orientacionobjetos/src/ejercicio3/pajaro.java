package ejercicio3;

public class pajaro {
	
	private int edad;
	private String color;
	
	public pajaro(int edad, String color) {
		super();
		this.edad = edad;
		this.color = color;
	}
	
	

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}



	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}



	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public String toString() {
		return "pajaro [edad=" + edad + ", color=" + color + "]";
	}



	public void setedad(int e) { 
		edad=e; 
	}
	
	public void printedad() { 
		System.out.println(edad);
	}
	
	public void setcolor(String c) { 
		color=c;
	}
}
