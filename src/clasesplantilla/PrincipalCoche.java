package clasesplantilla;

import java.util.Scanner;
import clasesplantilla.Coche;
import clasesplantilla.Furgoneta;

public class PrincipalCoche {
	
	public static void main(String[] args) {
	
	System.out.println("CLASE PRINCIPAL DE COCHE");
	//CREAMOS UN COCHE
	Coche coche1 = new Coche(3000,2000, 1500, "Azul"); 
	//imprimimos su características 
	System.out.println(coche1.toString());
	//añadimos asientos de cuero al coche 
	coche1.setAsientos_cuero(true);
	//imprimimos nuevamente sus características 
	System.out.println(coche1.toString()); 


	//creamos una furgoneta y pedimos datos al usuario
	Scanner scan = new Scanner(System.in);
	int largo, ancho, peso, capacidad, plazas;
	String color;
	System.out.println("Indica un color");
	color = scan.nextLine();
	System.out.println("Indica un largo");
	largo = scan.nextInt();
	System.out.println("Indica un ancho");
	ancho = scan.nextInt();
	System.out.println("Indica un peso en kg");
	peso = scan.nextInt();
	System.out.println("Indica capacidad de carga en kg");
	capacidad = scan.nextInt();
	System.out.println("Indica las plazas");
	plazas = scan.nextInt();
	Furgoneta furgo1 = new Furgoneta(largo,ancho,peso,color,capacidad,plazas);
	System.out.println("El color de la furgoneta es "+ furgo1.getColor());
	System.out.println(furgo1.toString());
	
	
}
}