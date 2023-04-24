package Ejercicio1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	List<String> lista = Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY",
			"DOG", "In", "THE", "Street");

	//CREA UNA NUEVA LISTA CON TODOS LOS STRINGS EN MINUSCULAS Y MUESTRALOS DESPUES CON SYSTEM OUT	
	
	List<String> listaEnMinusculas=
			lista
			.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	
	
	//HAZ LO MISMO, PERO SOLO CON LOS STRINGS QUE TENGAN MAS DE TRES CARACTERES
	
	List<String> listaMenos3=
			lista
			.stream()
			.filter(dimension -> dimension.length() > 3)
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	
	//HAZ LO MISMO QUE EL ANTERIOR, A PARTIR DE ESE RESULTADO AÑADE QUE SALTE LOS DOS PRIMEROS STRINGS,
	//Y DEVUELVE SOLO TRES STRINGS DEL RESULTADO
	
	List<String> listaSaltando=
			lista
			.stream()
			.filter(dimension -> dimension.length() > 3)
			.map(String::toUpperCase)
			.skip(2)
			.limit(3)
			.collect(Collectors.toList());
	
	
	//TOMA LA LISTA Y DIRECTAMENTE IMPRIMELA ORDENADA
	
	//List<String> listaOrdenada = 
			//lista
			//.stream()
			//.sorted()
			//.forEach(System.out::println);
			
	
	//CUENTA CUANTOS STRINGS TIENE MAS DE 4 CARACTERES
	
	long count =
			lista
			.stream()
			.filter( contador -> contador.length() > 4)
			.count();
	
	
	//USANDO UNA REDUCCION DEVUELVE UNA CADENA UNIENDO TODAS LAS CADENAS SEPARADAS POR UN "-"
	
	String resultadoFinal =
			lista
			.stream()
			.reduce((a1,a2) -> a1 + "-" + a2)
			.orElse("");
	
	//DEVUELVE LA PRIMERA CADENA QUE CUMPLA QUE CONTIENE (CONTAINS) LA "O"
	
	

}
