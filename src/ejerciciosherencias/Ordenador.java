package ejerciciosherencias;

public class Ordenador extends EquipoInformatico{
	
	private int grafica;
	private int ventiladores;
	private int placabase;

	public Ordenador(String procesador, int RAM, int capacidadDisco, int grafica,int ventiladores, int placabase) {
		super(procesador, RAM, capacidadDisco);
		this.grafica = grafica;
		this.ventiladores = ventiladores;
		this.placabase = placabase;
	}

	public int getGrafica() {
		return grafica;
	}

	public void setGrafica(int grafica) {
		this.grafica = grafica;
	}

	public int getVentiladores() {
		return ventiladores;
	}

	public void setVentiladores(int ventiladores) {
		this.ventiladores = ventiladores;
	}

	public int getPlacabase() {
		return placabase;
	}

	public void setPlacabase(int placabase) {
		this.placabase = placabase;
	}

	@Override
	public String toString() {
		return "Este ordenador tiene una grafica de " + grafica + " GB" + ventiladores + " ventiladores" + "una placa de " + placabase +" GB" + "]";
	}

	@Override
	public String crearPC() {
		return "Vamos a crear un Ordenador";
	}

	
}
