package ejerciciosherencias;

import java.util.Scanner;

public class PcGaming extends Ordenador{
	
	private boolean RefriLiquida;
	private boolean RGB;
	private int discosSSD;

	public PcGaming(String procesador, int RAM, int capacidadDisco, int grafica, int ventiladores, String placabase, boolean refrigeracion, boolean RGB, int SSD) {
		super(procesador, RAM, capacidadDisco, grafica, ventiladores, placabase);
		this.discosSSD = SSD;
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

	public int getDiscosSSD() {
		return discosSSD;
	}

	public void setDiscosSSD(int discosSSD) {
		this.discosSSD = discosSSD;
	}
	
	public void DatosPcGaming() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Tu PC ya incluye Refrigeración liquida e iluminación RGB, dime cuántos discos SSD extra quieres");
	discosSSD = scan.nextInt();
	}

	@Override
	public String toString() {
		return super.toString() + "PcGaming [RefriLiquida=" + RefriLiquida + ", RGB=" + RGB + ", discosSSD=" + discosSSD + "]";
	}

	
}
