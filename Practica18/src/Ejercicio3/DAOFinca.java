package Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DAOFinca {

	private ArrayList<Finca> fincas;

	public DAOFinca() {
		super();
		this.fincas = new ArrayList<>();
	}
	
	public void cargarDatos() {
		
		Path f1 = Paths.get("./ficheros/fincas.csv");
		String line = "";
		String coma = ",";
		
		try{
			
			BufferedReader br = Files.newBufferedReader(f1);
			
			while ((line = br.readLine()) != null) {
                String[] data = line.split(coma);
                
                int id = Integer.parseInt(data[0]);
                String nombre = data[1];
                double longitud = Double.parseDouble(data[2]);
                double latitud = Double.parseDouble(data[3]);
                double superficie = Double.parseDouble(data[4]);
                String localidad = data[5];
                String provincia = data[6];
                
                Finca f = new Finca(id, nombre, longitud, latitud, superficie, localidad, provincia);
                fincas.add(f);
            }
			
			br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	
	public  Finca findById( int id) {
		
		for (Finca f : fincas) {
			if (f.getId() == id) {
				return f;
			}
		}
		
		return null;
	}
	
	public void addFinca (Finca f) {
		fincas.add(f);
	}
	
	public void delFinca (Finca f) {
		fincas.remove(f);
	}
	
	public Finca findByName (String nombre) {
		
		for (Finca f: fincas) {
			if (f.getNombre().equals(nombre)) {
				return f;
			}
		}
		
		return null;
		
	}

	public static DAOFinca getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
