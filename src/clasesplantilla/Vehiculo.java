package clasesplantilla;

public abstract class Vehiculo {
	
	 private int ruedas;
	 private int motor; 
	 private int ancho; 
	 private int largo; 
	 private int peso; 
	 private String color;
	 
	 public Vehiculo(String color, int ruedas, int motor, int ancho, int largo, int peso) {
		 this.ruedas = ruedas;
		 this.color = color;
		 this.motor = motor;
		 this.ancho = ancho;
		 this.largo = largo;
		 this.peso = peso;
	 }

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	 
	public abstract String arrancar(); //TODAS LAS CLASES QUE HEREDEN TENDRÁN QUE IMPLEMENTAR ESTE MÉTODO
	

}
