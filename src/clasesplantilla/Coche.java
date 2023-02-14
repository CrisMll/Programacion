package clasesplantilla;

public class Coche{
	
	 private int ruedas;
	 private int motor; 
	 private int ancho; 
	 private int largo; 
	 private int peso; 
	 private String color; 
	 private boolean climatizador, asientos_cuero;
	
	 public Coche(int largo, int ancho, int peso, String color) { 
	 //todos los coches que cree, tendrán 4 ruedas y motor 2000 
	 //no tendran ni climatizador ni asientos de cuero
		 
	 this.ruedas = 4;
	 this.motor = 2000;
	 this.climatizador = false;
	 this.asientos_cuero = false;
	 
	 //atributos que sí pueden variar al crear un coche
	 this.largo=largo; 
	 this.ancho=ancho;
	 this.peso=peso; 
	 this.color=color; }
	 
	 public int getRuedas(){
		 return ruedas; }
	 public void setRuedas(int ruedas) {
		 this.ruedas = ruedas; 
		 } 
	 public int getMotor(){
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
	 
	 @Override public String toString() {
		 return "Coche [ruedas=" + ruedas + ", motor=" + motor + ", ancho=" + ancho + ", largo=" + largo + ", peso=" + peso + ", color=" + color + ", climatizador=" + climatizador + ", asientos_cuero=" + asientos_cuero + "]"; 
		 }
	 
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
