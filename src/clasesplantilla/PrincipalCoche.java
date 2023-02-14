package clasesplantilla;

import java.util.Scanner;
import clasesplantilla.Coche;
import clasesplantilla.Furgoneta;

public class PrincipalCoche {
	
	public static void main(String[] args) {
	
	//System.out.println("CLASE PRINCIPAL DE COCHE");
	//CREAMOS UN COCHE
	Coche coche1 = new Coche("verde", 4, 120, 350, 450, 2000);
	//imprimimos su características 
	System.out.println(coche1.toString());
	//añadimos asientos de cuero al coche 
	coche1.setAsientos_cuero(true);
	//imprimimos nuevamente sus características 
	System.out.println(coche1.toString());


	//creamos una furgoneta y pedimos datos al usuario por consola
	Scanner scan = new Scanner(System.in);
	int largo, ancho, peso, capacidad, plazas, motor;
	String color;
	System.out.println("Indica un color");
	color = scan.nextLine();
	System.out.println("Indica un largo");
	largo = scan.nextInt();
	System.out.println("Indica un ancho");
	ancho = scan.nextInt();
	System.out.println("Indica los cv del motor");
	motor = scan.nextInt();
	System.out.println("Indica un peso en kg");
	peso = scan.nextInt();
	System.out.println("Indica capacidad de carga en kg");
	capacidad = scan.nextInt();
	System.out.println("Indica las plazas");
	plazas = scan.nextInt();
	Furgoneta furgo1 = new Furgoneta(color, plazas, plazas, ancho, largo, peso, capacidad, plazas);
	System.out.println("El color de la furgoneta es "+ furgo1.getColor());
	System.out.println(furgo1.toString());
	System.out.println(furgo1.arrancar());
	
	//creamos otra furgoneta pero esta vez no pedimos datos por consola
	
	Coche furgo2 = new Coche("amarillo",4,150,400,500,4000);
	System.out.println("La segunda furgoneta es de color " + furgo2.getColor());
	System.out.println(furgo2.toString());
	
}
}