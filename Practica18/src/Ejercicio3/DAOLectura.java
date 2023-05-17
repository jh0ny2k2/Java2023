package Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DAOLectura {

	private Set<Lectura> lecturas;

	public DAOLectura() {
		super();
		this.lecturas = new HashSet<>();
		cargarDatos();
	}
	
	public void cargarDatos() {
	
		Path f1 = Paths.get("./ficheros/lecturas.csv");
		String line = "";
		String coma = ",";
	
		try{
			
			BufferedReader br = Files.newBufferedReader(f1);
			
			while ((line = br.readLine()) != null) {
                String[] data = line.split(coma);
                
                int id = Integer.parseInt(data[1]);
                double temperatura = Double.parseDouble(data[2]);
                double humedad = Double.parseDouble(data[3]);
                LocalDateTime momento = LocalDateTime.parse(data[4]);
                int finca = Integer.parseInt(data[5]);
                
                Lectura f = new Lectura(id, temperatura, humedad, momento);
                lecturas.add(f);
                
            }
			
			 br.close();
			 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void grabarDatos() {
		Path f1 = Paths.get("./ficheros/lecturas.csv");
		Path f2 = Paths.get("./ficheros/lecturas.csv");
		
		try {
			BufferedReader br = Files.newBufferedReader(f1);
			BufferedWriter bw = Files.newBufferedWriter(f2);
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
				bw.write(linea);
				bw.newLine();
			}
		
			bw.close();
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void addLectura(Lectura l) {
		
		lecturas.add(l);
		
	}
	
	public void deleteLectura (Lectura l) {
		
		lecturas.remove(l);
		
	}
	
	//GET LECTURAS POR FINCAS
	
	public Map<Integer, List<Lectura>> getLecturasPorFinca() {
        return lecturas.stream()
                .collect(Collectors.groupingBy(lectura -> lectura.getFinca().getId()));
    }
	
	//GET TEMPERATURA MAXIMA DE UNA FINCA
	
	public double getTempMaximaFinca(int id) {
		return lecturas.stream()
				.filter(lectura -> lectura.getFinca().getId() == id)
				.mapToDouble(Lectura::getTemperatura)
				.max()
				.orElse(Double.NaN);
	}
	
	// GET TEMPERATURA MINIMA FINCA
	
	public double getTempMinimaFinca(int id) {
		return lecturas.stream()
				.filter(lectura -> lectura.getFinca().getId() == id)
				.mapToDouble(Lectura::getTemperatura)
				.min()
				.orElse(Double.NaN);
	}
	
	//GET HUMEDAD POR FINCA
	
	public List<Double> getHumedadPorFinca(int id) {
		return lecturas.stream()
				.filter(lectura  -> lectura.getFinca().getId() = id)
				.sorted(Comparator.comparing(Lectura::getFecha))
				.map(Lectura::getHumedad)
				.collect(Collectors.toList());
	}
	
		
}

