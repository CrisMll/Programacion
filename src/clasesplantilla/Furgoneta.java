package clasesplantilla;

public class Furgoneta extends Coche{
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(String color, int ruedas, int motor, int ancho, int largo, int peso, int capacidad, int plazas) {
		super(color, ruedas, motor, ancho, largo, peso);
		this.capacidad_carga = capacidad;
		this.plazas_extra = plazas;
	}


	public int getCapacidad_carga() {
		return capacidad_carga;
	}


	public void setCapacidad_carga(int capacidad_carga) {
		this.capacidad_carga = capacidad_carga;
	}


	public int getPlazas_extra() {
		return plazas_extra;
	}


	public void setPlazas_extra(int plazas_extra) {
		this.plazas_extra = plazas_extra;
	}

	@Override
	public String toString() {
		return super.toString() + "Esta furgoneta tiene una capacidad de carga de " + capacidad_carga + " kg  y " + plazas_extra + "plazas";
				
		//"Furgoneta [capacidad_carga=" + capacidad_carga + ", plazas_extra=" + plazas_extra + "]";
	}
	

	
	
	
	
}
