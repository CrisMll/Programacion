package ejerciciosherencias;

import java.util.Scanner;

public class PrincipalEqInf {

	public static void main(String[] args) {
	
		//declaro el objeto scan para poder meter datos por consola e inicializo un menú para que elija el usuario
		//inicio todas las variables a cero porque me está dando error. *****PREGUNTAR******
		Scanner scan = new Scanner(System.in);
		boolean RGB = true;
		boolean refrigeracion = true;
		boolean menu = true;
		int opcion = 0;
		String procesador="", placa="";
		int ram =0, capacidad=0, grafica=0, ventiladores=0, pantalla = 0, cargador=0, SSD =0;
		while(menu) {
			System.out.printf("%22s\n","VAMOS A CREAR UN PC");
			System.out.println("------------------------------ \n"+ "\nEscoge una opción: \n" + "1. Quiero un portátil \n"+"2. Quiero un PcGaming \n");
			opcion = scan.nextInt();
		
		
		switch(opcion) {
		
		case 1:
		
		PcPortatil portatil1 = new PcPortatil(procesador,ram,capacidad,grafica,cargador,placa,ventiladores,pantalla);
		portatil1.DatosPortatil();
		portatil1.DatosBase();
		portatil1.DatosPC();
		System.out.println(portatil1.toString());
		
		break;
		
		case 2:
		
		PcGaming gaming1 = new PcGaming(procesador,ram,capacidad,grafica,ventiladores,placa,refrigeracion,RGB,SSD);
		gaming1.DatosPcGaming();
		gaming1.DatosBase();
		gaming1.DatosPC();
		System.out.println(gaming1.toString());
		
		
		break;
		
		default:
			System.out.println("Has marcado una opción incorrecta, vuelve a probar");
			
		}
		
		
		}
		
	}

}
