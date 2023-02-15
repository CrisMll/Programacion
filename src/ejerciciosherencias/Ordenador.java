package ejerciciosherencias;

import java.util.Scanner;

public class Ordenador extends EquipoInformatico{
	
	private int grafica;
	private int ventiladores;
	private String placabase;

	public Ordenador(String procesador, int RAM, int capacidadDisco, int grafica,int ventiladores, String placabase) {
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

	public String getPlacabase() {
		return placabase;
	}

	public void setPlacabase(String placabase) {
		this.placabase = placabase;
	}
	
	public void DatosPC() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Indica qué placa base quieres: B450, X50B o RX70");
	placabase = scan.nextLine();
	System.out.println("Indica los GB que tendrá tu tarjeta gráfica: 2, 4, 6, 8 o 12");
	grafica = scan.nextInt();
	System.out.println("Indica cuántos ventiladores extra quieres");
	ventiladores = scan.nextInt();
	}
	
	@Override
	public String toString() {
		return "Este ordenador tiene una grafica de " + grafica + " GB" + ventiladores + " ventiladores" + "una placa de " + placabase +" GB" + "]";
	}

	@Override
	public String crearPC() {
		return "Genial! ya tenemos el PC";
	}

	
}
