package ejerciciosherencias;

public class PcGaming extends Ordenador{
	
	private boolean RefriLiquida;
	private boolean RGB;
	private int discosSSD;

	public PcGaming(String procesador, int RAM, int capacidadDisco, int grafica, int ventiladores, int placabase, boolean refrigeracion, boolean RGB, int SSD) {
		super(procesador, RAM, capacidadDisco, grafica, ventiladores, placabase);
		this.discosSSD = SSD;
		this.RefriLiquida = true;
		this.RGB = true;
		
	}

}
