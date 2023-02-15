package ejerciciosherencias;

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

	@Override
	public String toString() {
		return "Este equipo tiene un procesador de " + Procesador + ", una RAM de " + RAM + "GB"+ " y un espacio en disco de " + CapacidadDisco + " GB " 
				+ "]";
	}
	
	
	
	
	
}
