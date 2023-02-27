package unidad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tres {
	
	public static void main(String[] args) {
		
		leerDatos();
	}
	
	public static void leerDatos() {
		try {
			FileReader fr = new FileReader("C:/Users/krisp/datos.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String datos = "";
			while (datos!=null) {
				datos = br.readLine();
				if(datos !=null)
					System.out.println(datos);	
			}
			
			br.close();
			fr.close();
			
		} catch (IOException e) {
		  e.printStackTrace();
		}
	}
}
