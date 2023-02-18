package ejerciciosherencias;

import java.util.Scanner;

public abstract class EquipoInformatico {
	
	//atributos comunes a cualquier equipo informatico
	private String Procesador;
	private String RAM;
	private String CapacidadDisco;
	
	
	//Creo el constructor del equipo informático con los atributos que deben tener todos 
	
	public EquipoInformatico(String procesador,String RAM, String capacidadDisco) {
		this.Procesador = procesador;
		this.RAM = RAM;
		this.CapacidadDisco = capacidadDisco;
	}
	
	//Metodos 
	
	public void setProcesador (String procesador) {
		this.Procesador = procesador;
	}
	
	public String getProcesador() {
		return Procesador;
	}

	public void setRAM(String ram) {
		RAM = ram;
	}

	public String getRAM() {
		return RAM;
	}
	
	public void setCapacidadDisco(String capacidad) {
		this.CapacidadDisco = capacidad;
	}
	
	public String getCapacidadDisco() {
		return CapacidadDisco;
	}
	
	public void DatosBase() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica si quieres un procesador Intel o AMD");
		this.Procesador = scan.nextLine();
		System.out.println("Indica la RAM elegida: 4, 8 o 16");
		this.RAM = scan.nextLine();
		System.out.println("Indica la capacidad de disco elegida: 256, 520, 1000 o 2000");
		this.CapacidadDisco = scan.nextLine();
	}

	public abstract String crearPC();
		
	}
	
	

