package ejerciciofiguras;

public class Figura {
//DECLARAMOS ATRIBUTOS

	private String nombre;
	private String color;
	private double area;
	private double perimetro;


public Figura(String nombre, String color, double area, double perimetro) {
		this.nombre = nombre;
		this.color=color;
		this.area = area;
		this.perimetro = perimetro;
	}
//METODOS

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public double getPerimetro() {
	return perimetro;
}
public void setPerimetro(double perimetro) {
	this.perimetro = perimetro;
}
}
