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


}
