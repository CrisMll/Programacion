package ejerciciofiguras;

import java.util.Scanner;

import ejerciciofiguras.Triangulo;
import ejerciciofiguras.Figura;
import ejerciciofiguras.Rectangulo;

public class ClasePrincipal {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		boolean menu = true;
		int opcion = 0;
		while (menu) {
		System.out.printf("%22s\n","FIGURAS PLANAS");
		System.out.println("------------------------------ \n"+"1. Crear un triángulo \n"+"2. Crear un rectángulo \n" +"\nEscoge una opción: \n");
		System.out.print("Opción: ");
		opcion = scan.nextInt();
		
		switch (opcion) {
		case 1:
			Triangulo miTriangulo = new Triangulo("miTriangulo","amarillo",8,8,8,6.93);
			miTriangulo.dimeCaracteristicas(miTriangulo);
			miTriangulo.TipoTriangulo(miTriangulo);
			break;
		case 2:
			System.out.println("Introduce el lado 1");
			double lado1 = scan.nextDouble();
			System.out.println("Introduce el lado 2");
			double lado2 = scan.nextDouble();
			System.out.println("Introduce la base");
			double base = scan.nextDouble();
			System.out.println("Introduce la altura");
			double altura = scan.nextDouble();
			Rectangulo miRectangulo = new Rectangulo("miRectangulo", "rojo", lado1, lado2,base, altura);
			if(miRectangulo.comprobarCuadrado(miRectangulo)==true) {
				System.out.println("Es un cuadrado");
			}
			else {
				miRectangulo.dimeCaracteristicas(miRectangulo);
			}
			break;
		default:
			System.out.println("Has escrito un numero incorrecto, vuelve a intentarlo");
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
