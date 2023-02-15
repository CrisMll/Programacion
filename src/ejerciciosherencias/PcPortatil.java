package ejerciciosherencias;

public class PcPortatil extends Ordenador{
	
	private int pantalla;
	private boolean CargadorRapido;

	public PcPortatil(String procesador, int RAM, int capacidadDisco, int grafica, int ventiladores, int placabase, int pantalla, boolean cargador) {
		super(procesador, RAM, capacidadDisco, grafica, ventiladores, placabase);
		this.pantalla = pantalla;
		this.CargadorRapido = false;
	
	}

	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

	public boolean isCargadorRapido() {
		return CargadorRapido;
	}

	public void setCargadorRapido(boolean cargadorRapido) {
		CargadorRapido = cargadorRapido;
	}

	@Override
	public String toString() {
		return super.toString() + "PcPortatil [pantalla=" + pantalla + ", CargadorRapido=" + CargadorRapido + "]";
	}

	
}
