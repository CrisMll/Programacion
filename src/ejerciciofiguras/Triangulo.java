package ejerciciofiguras;

public class Triangulo extends Figura {
	

	private  double lado1;
	private double lado2;
	private double base;
	private double altura;
	
	public Triangulo(String nombre, String color, double lado1, double lado2, double base, double altura) {
		super(nombre, color, (lado1*altura)/2, lado1+lado2+base);
		this.lado1=lado1;
		this.lado2=lado2;
		this.altura=altura;
		this.base=base;

	}

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

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void TipoTriangulo(Triangulo triangulo) {
		if(triangulo.getLado1() == triangulo.getLado2() && triangulo.getBase() == triangulo.getLado1()) {
			System.out.println("Es equilátero");
		}
		else if(triangulo.getLado1() == triangulo.getLado2() && triangulo.getBase() != triangulo.getLado1()) {
			System.out.println("Es isósceles");
		}
		else {
			System.out.println("Es escaleno");
		}
	
		}
	
	public void dimeCaracteristicas(Triangulo triang) {
		System.out.println("Cada lado de este triángulo mide "+ triang.getLado1() + " cm "+ "su area es " + triang.getArea()+ " cm "+ " su perimetro es "+ triang.getPerimetro()+ " cm");
	}
}
