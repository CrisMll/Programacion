package poo;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String nombre, apellidos, fechaCumple, sexo;
		
		System.out.println("Por favor, introduce los datos a continuación: ");
		System.out.println("Introduce tu nombre");
		nombre = scan.nextLine();
		System.out.println("Introduce tus apellidos");
		apellidos = scan.nextLine();
		System.out.println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa");
		fechaCumple = scan.nextLine();
		System.out.println("Introduce tu sexo");
		sexo = scan.nextLine();

		
		Persona Persona1 = new Persona(nombre, apellidos, fechaCumple,sexo);
		System.out.println(Persona1.toString());
		Persona1.setEstacion(fechaCumple);
	
		//PEDIMOS LOS DATOS DE LA SEGUNDA PERSONA
		System.out.println("\n Por favor, introduce los datos a continuación: ");
		System.out.println("Introduce el nombre de la persona 2: ");
		nombre = scan.nextLine();
		System.out.println("Introduce los apellidos de la persona 2: ");
		apellidos = scan.nextLine();
		System.out.println("Introduce la fecha de nacimiento de la persona 2 con formato dd/mm/yyyy: ");
		fechaCumple = scan.nextLine();
		System.out.println("Introduce el sexo de la persona 2: ");
		sexo = scan.nextLine();
		System.out.println("Introduce la edad de la persona 2: ");
		
		
		Persona Persona2 = new Persona(nombre, apellidos,fechaCumple,sexo);
		System.out.println(Persona2.toString());		
		Persona2.setEstacion(fechaCumple);
		
		
		
	}

	
}
 