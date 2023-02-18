package ejerciciosherencias;

import java.util.Scanner;

public class PcGaming extends Ordenador{
	
	private boolean RefriLiquida;
	private boolean RGB;
	private String discosSSD;


	public PcGaming(String procesador, String RAM, String capacidadDisco, String grafica, String placa, String discos) {
		super(procesador, RAM, capacidadDisco, grafica, placa);
		this.discosSSD = discos;
		this.RefriLiquida = true;
		this.RGB = true;

	}

	public boolean isRefriLiquida() {
		return RefriLiquida;
	}

	public void setRefriLiquida(boolean refriLiquida) {
		RefriLiquida = refriLiquida;
	}

	public boolean isRGB() {
		return RGB;
	}

	public void setRGB(boolean rGB) {
		RGB = rGB;
	}

	public String getDiscosSSD() {
		return discosSSD;
	}

	public void setDiscosSSD(String discosSSD) {
		this.discosSSD = discosSSD;
	}
	
	public void DatosPcGaming() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Tu PC ya incluye Refrigeración liquida e iluminación RGB, dime cuántos discos SSD extra quieres");
	discosSSD = scan.nextLine();
	}

	@Override
	public String toString() {
		return super.toString() + "tu PcGaming tiene RefriLiquida" + RefriLiquida + ", RGB " + RGB + ", y " + discosSSD + "discos SSD";
	}

	
}
