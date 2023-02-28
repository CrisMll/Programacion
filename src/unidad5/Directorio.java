package unidad5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Directorio {
	//Paso1 - crear archivos uno, dos y tres, si no existen, se crearán.(No puedo guardar en C:, no me da permisos)
	public static void main(String[] args) {
		
		crearArchivos();
	}

	public static void crearArchivos() {
		
		String directorio = "C:/EjerciciosStreams";
        File carpeta = new File(directorio);

        if (!carpeta.exists()) {
            carpeta.mkdir();
            System.out.println("Se ha creado la carpeta " + directorio + " correctamente.");
        } else {
            System.out.println("La carpeta " + directorio + " ya existe.");
        }
        
        
		try {
			
			FileWriter fw1 = new FileWriter("C:/EjerciciosStreams/uno.txt", true);
			FileWriter fw2 = new FileWriter("C:/EjerciciosStreams/dos.txt", true);
			FileWriter fw3 = new FileWriter("C:/EjerciciosStreams/tres.txt", true);
			FileWriter datos = new FileWriter("C:/EjerciciosStreams/datos.txt", true);
			BufferedWriter bwd = new BufferedWriter(datos);
			
			bwd.write("Nombre:María Lopez Teléfono: 955215263");
			bwd.newLine();
			bwd.write("Nombre:Cristina Mora Teléfono: 954566609");
			bwd.newLine();
			bwd.write("Nombre:Raquel Martín Teléfono: 912300989");
			bwd.newLine();
			bwd.write("Nombre:Francisco Perez Teléfono: 910922334");
			
			bwd.close();
			datos.close();
			fw3.close();
			fw2.close();
			fw1.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

		
