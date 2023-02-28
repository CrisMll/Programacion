package unidad5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dos {

	
	public static void main(String[] args) {
		
		System.out.println("Vamos a calcular el área de un triángulo");
		areaTriangulo();
		System.out.println("Se ha guardado el área del triángulo");
		
	}
	
	public static void areaTriangulo() {
		
		/*Paso3 - Calcular el area de un triangulo con los datos pedidos por consola
		 * Escribir en el archivo dos.txt el valor del area. Como es tipo int usamos Integer.toString para convertirlo en String
		 ya que FileWriter según la api solo devuelve tipo String*/
		
		double area, base, altura;
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica por favor la base en cm");
		base = scan.nextDouble();
		System.out.println("Indica por favor la altura en cm");
		altura = scan.nextDouble();
		area=(base*altura)/2;
		scan.close();
		try {
			FileWriter fw = new FileWriter("C:/EjerciciosStreams/dos.txt");
			fw.write("El área del triángulo mide "+Double.toString(area)+" cm");
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
