package prueba;

public class Enumerados {

	enum NombreMes{ENERO, FEBRERO , MARZO, ABRIL,MAYO, JUNIO, JULIO, AGOSTO,SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
	enum Sexo {HOMBRE, MUJER, OTRO}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mescadena = "ENERO";
		NombreMes mes= NombreMes.ENERO;
		Sexo sx = Sexo.HOMBRE;
		
		
		System.out.println("Mi primo nació en " + mes);
		System.out.println("Mi primo es de sexo " + sx);
	}

}
