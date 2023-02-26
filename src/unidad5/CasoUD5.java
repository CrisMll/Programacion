package unidad5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CasoUD5 {
	
	//CREAR METODOS PARA CADA CASO DE LA PRACTICA
	
	//Paso1 - crear archivos uno, dos y tres, si no existen, se crearán.(No puedo guardar en C:, no me da permisos)
	public void crearArchivos() {
		
		try {
			FileWriter fw1 = new FileWriter("C:/Users/krisp/uno.txt", true);
			FileWriter fw2 = new FileWriter("C:/Users/krisp/dos.txt", true);
			FileWriter fw3 = new FileWriter("C:/Users/krisp/tres.txt", true);	
			
			fw3.close();
			fw2.close();
			fw1.close();
		
		} catch (IOException e) {
			e.printStackTrace();	
	}
		
	}
	
	//Paso2 - crear dentro de uno.txt un metodo que escriba numeros del 0 al 10.
		
	public void escribeNumeros() {	
		
		int num=0;
		
		try {
			FileWriter fw = new FileWriter("C:/users/uno.txt", true);
			
			for(int i=0;i<=10;i++) {
				fw.write(num);
			}
			
			fw.close();
		
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		}
		
	
	public void areaTriangulo() {
		
		/*Paso3 - Calcular el area de un triangulo con los datos pedidos por consola
		 * Escribir en el archivo dos.txt el valor del area. Como es tipo int usamos Integer.toString para convertirlo en String
		 ya que FileWriter según la api solo devuelve tipo String*/
		
		int area, base, altura;
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos a calcular el área de un triángulo");
		System.out.println("Indica por favor sin decimales la base en cm");
		base = scan.nextInt();
		System.out.println("Indica por favor sin decimales la altura en cm");
		altura = scan.nextInt();
		area=(base*altura)/2;
		scan.close();
		try {
			FileWriter fw = new FileWriter("C:/dos.txt", true);
			fw.write(Integer.toString(area));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//Paso4 - Leer del archivo datos.txt cada linea que esté escrita
	
	public void leerDatos() {
		try {
			FileReader fr = new FileReader("C:/Users/krisp/datos.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String datos = "";
			while (datos!=null) {
				datos = br.readLine();
				if(datos !=null)
					System.out.println(datos);	
			}
			
		} catch (IOException e) {
		  e.printStackTrace();
		}
	}

		
	}

