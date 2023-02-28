package unidad5;

import java.io.FileWriter;
import java.io.IOException;

public class Uno {

	
	public static void main(String[] args) {

		escribeNumeros();
	}
	
	//Crear dentro de uno.txt un metodo que escriba numeros del 0 al 10. No quiero sobreescribir.
	
	public static void escribeNumeros() {	
		
		int num=0;
		
		try {
			FileWriter fw = new FileWriter("C:/EjerciciosStreams/uno.txt",true);
			
			for (int i=0;num<11;i++) {
				System.out.println(num);
				fw.write(Integer.toString(num++));
				//convertir los numeros en String para que sean legibles
			}
			
			fw.close();
		
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		}
}
