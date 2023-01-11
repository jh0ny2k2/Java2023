package ejercicio1;

public class ejercicio {

	private String nombre;
	private String Apellidos;
	private int edad;
	private String email;
	private double sueldo;
	private double irpf;
	private double ss;
	private String departamento;
	
	
	
	
	public ejercicio (String nombre, String apellidos, int edad, String email, double sueldo,
			double irpf, double ss, String departamento) {
		super();
		this.nombre = nombre;
		Apellidos = apellidos;
		this.edad = edad;
		this.email = email;
		this.sueldo = sueldo;
		this.irpf = irpf;
		this.ss = ss;
		this.departamento = departamento;
	}


	public ejercicio() {
		super();
		this.nombre = "";
		Apellidos = "";
		this.edad = 0;
		this.email = "";
		this.sueldo = 0;
		this.irpf = 0;
		this.ss = 0;
		this.departamento = "";
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = "jhonathan";
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = "chaves";
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = 20;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = "eeeeee@gmail.com";
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = 2500;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = 0.19;
	}

	public double getSs() {
		return ss;
	}

	public void setSs(int ss) {
		this.ss = 0.05;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = "informatica";
	}
	
	public double mostrarsalario() {
		double descuento;
		
		descuento = ((this.sueldo * this.irpf) + (this.sueldo * this.ss));
		
		return sueldo;
		
		
	}
	
}
