package ejerciciosherencias;

public class PcPortatil extends Ordenador{
	
	private int pantalla;
	private boolean CargadorRapido;

	public PcPortatil(String procesador, int RAM, int capacidadDisco, int grafica, int ventiladores, int placabase, int pantalla, boolean cargador) {
		super(procesador, RAM, capacidadDisco, grafica, ventiladores, placabase);
		this.pantalla = pantalla;
		this.CargadorRapido = false;
	
	}

}
