package ejerciciosherencias;

import java.util.Scanner;

public class Ordenador extends EquipoInformatico{
	
	private String grafica;
	private String placabase;
	
	public Ordenador(String procesador, String RAM, String capacidadDisco, String grafica, String placa) {
		super(procesador, RAM, capacidadDisco);
		this.grafica = grafica;
		this.placabase = placabase;
	}

	public String getGrafica() {
		return grafica;
	}

	public void setGrafica(String grafica) {
		this.grafica = grafica;
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
	grafica = scan.nextLine();
	}
	
	@Override
	public String toString() {
		return "Este ordenador tiene una grafica de " + grafica + " GB" + " una placa base modelo " + placabase +" GB" + ", y ";
	}

	@Override
	public String crearPC() {
		return "Genial! ya tenemos el PC";
	}

	
}
