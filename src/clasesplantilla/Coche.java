package clasesplantilla;

public class Coche extends Vehiculo{
	
	 private int ruedas;
	 private int motor; 
	 private int ancho; 
	 private int largo; 
	 private int peso; 
	 private String color; 
	 private boolean climatizador, asientos_cuero;
	
	 //se crean los métodos getter y setter
	 
	 public Coche(String color, int ruedas, int motor, int ancho, int largo, int peso) {
		super(color, motor,ancho,largo,peso,ruedas);
		this.climatizador = false;
		this.asientos_cuero = false;
	}
	 
	public boolean isClimatizador() {
		 return climatizador;
		 }
	 public void setClimatizador(boolean climatizador) {
		 this.climatizador = climatizador;
		 }
	 public boolean isAsientos_cuero() {
		 return asientos_cuero;
		 }
	 public void setAsientos_cuero(boolean asientos_cuero) {
		 this.asientos_cuero = asientos_cuero; 
		 }

	@Override
	public String toString() {
		return "Coche [ruedas=" + ruedas + ", motor=" + motor + ", ancho=" + ancho + ", largo=" + largo + ", peso="
				+ peso + ", color=" + color + ", climatizador=" + climatizador + ", asientos_cuero=" + asientos_cuero
				+ "]";
	}

	@Override
	public String arrancar() {
		return "Hola, soy un coche que hace brummmmmmmmmmmm";
	}
	 

	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
