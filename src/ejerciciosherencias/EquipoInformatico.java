package ejerciciosherencias;

import java.util.Scanner;

public abstract class EquipoInformatico {
	
	//atributos comunes a cualquier equipo informatico
	private String Procesador;
	private int RAM;
	private int CapacidadDisco;
	
	
	//Creo el constructor del equipo informático con los atributos que deben tener todos 
	
	public EquipoInformatico(String procesador,int RAM, int capacidadDisco) {
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

	public void setRAM(int ram) {
		RAM = ram;
	}

	public int getRAM() {
		return RAM;
	}
	
	public void setCapacidadDisco(int capacidad) {
		this.CapacidadDisco = capacidad;
	}
	
	public int getCapacidadDisco() {
		return CapacidadDisco;
	}
	
	public void DatosBase() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indica si quieres un procesador Intel o AMD");
		this.Procesador = scan.nextLine();
		System.out.println("Indica la RAM elegida: 4, 8 o 16");
		this.RAM = scan.nextInt();
		System.out.println("Indica la capacidad de disco elegida: 256, 520, 1000 o 2000");
		this.CapacidadDisco = scan.nextInt();
	}

	public abstract String crearPC();
		
	}
	
	

