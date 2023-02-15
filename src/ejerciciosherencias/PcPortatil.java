package ejerciciosherencias;

import java.util.Scanner;

public class PcPortatil extends Ordenador{
	
	private int pantalla;
	private int CargadorRapido;

	public PcPortatil(String procesador, int RAM, int capacidadDisco, int grafica, int ventiladores, String placabase, int pantalla, int cargador) {
		super(procesador, RAM, capacidadDisco, grafica, ventiladores, placabase);
		this.pantalla = pantalla;
		this.CargadorRapido = cargador;
	
	}

	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

	public int isCargadorRapido() {
		return CargadorRapido;
	}

	public void setCargadorRapido(int cargadorRapido) {
		CargadorRapido = cargadorRapido;
	}
	
	public void DatosPortatil() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Indica de qué tamaño quieres la pantalla del portátil");
	pantalla = scan.nextInt();
	System.out.println("De cuantos V quieres el cargador 240 o 255");
	CargadorRapido = scan.nextInt();
	
	}
	
	@Override
	public String toString() {
		return super.toString() + "PcPortatil [pantalla=" + pantalla + ", CargadorRapido=" + CargadorRapido + "]";
	}

	
}
