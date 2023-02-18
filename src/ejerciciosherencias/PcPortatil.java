package ejerciciosherencias;

import java.util.Scanner;

public class PcPortatil extends Ordenador{

	private String pantalla;
	private String CargadorRapido;

	public PcPortatil(String procesador, String RAM, String capacidadDisco, String pantalla, String cargador) {
		super(procesador, RAM, capacidadDisco, pantalla, cargador);
		this.pantalla = pantalla;
		this.CargadorRapido = cargador;
	
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public String isCargadorRapido() {
		return CargadorRapido;
	}

	public void setCargadorRapido(String cargadorRapido) {
		CargadorRapido = cargadorRapido;
	}
	
	public void DatosPortatil() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Indica de qué tamaño quieres la pantalla del portátil");
	pantalla = scan.nextLine();
	System.out.println("De cuantos V quieres el cargador 240 o 255");
	CargadorRapido = scan.nextLine();
	
	}
	
	@Override
	public String toString() {
		return super.toString() + " una pantalla de " + pantalla + " pulgadas y un cargador rápido de potencia " + CargadorRapido;
	}

	
}
