package ejerciciofiguras;

public class Rectangulo extends Figura{

	private double lado1;
	private double lado2;
	private double altura;
	private double base;
	
	public Rectangulo(String nombre, String color, double lado1, double lado2, double altura, double base) {
		super(nombre, color, lado1+lado2+altura+base, lado1*altura );
		this.lado1=lado1;
		this.lado2=lado2;
		this.altura=altura;
		this.base=base;

	}
//METODOS
public double getLado1() {
	return lado1;
}
public void setLado1(double lado1) {
	this.lado1 = lado1;
}
public double getLado2() {
	return lado2;
}
public void setLado2(double lado2) {
	this.lado2 = lado2;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public void dimeCaracteristicas(Rectangulo rectan) {
	System.out.println("Este rectángulo tiene un área de  " + rectan.getArea()+ " cm"+ " y su perimetro es "+ rectan.getPerimetro()+ " cm");
}


//COMPROBAR CLASE DE RECTANGULO
public boolean comprobarCuadrado(Rectangulo rectangulo) {
if(rectangulo.getLado1() == rectangulo.getLado2() && rectangulo.getLado2() == rectangulo.getBase()) {
	return true;
}
else {
	return false;
}
}
}
