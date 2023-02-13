package poo;

import java.util.Scanner;

//Esta clase sería de plantilla general. Para poder crear un objeto, siempre primero necesitamos un "new" al igual que hacemos con Scanner (que ya existe). También indicamos los atributos del objeto. 
//Para que nadie lo pueda modificar habrá que ponerlo como "private".
//Estos serán los atributos de la clase, no los del objeto y no tienen por qué coincidir. 

public class Persona {

	private String nombre;
	private String apellidos;
	private String fecha_cumple;
	private int edad;
	private String sexo;
	
	public Persona(String nombre, String apellidos, String fecha, String sexo) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.fecha_cumple = fecha;
	this.sexo = sexo;
	}
	
	public String getNombre() {
	return this.nombre;
	}

	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

	public String getApellidos() {
	return this.apellidos;
	}

	public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
	}

	public String getFechaCumple(){
	return this.fecha_cumple;
	}

	public void setFechaCumple(String fecha) {
	this.fecha_cumple = fecha;
	}

	public int getEdad() {
	return this.edad;
	}

	public void setEdad(int edad) {
	this.edad = edad;
	}

	public String getSexo() {
	return this.sexo;
	}

	public void setSexo(String sexo) {
	this.sexo = sexo;
	}
	
	public String toString() {
		String mensaje = "La persona 1 se llama " + nombre+ " " + apellidos + " y es " + sexo;
		return mensaje;
	}
	
	public void setEstacion (String fechanac) { //metodo para averiguar cual es la estación del año de nacimiento
	
	String Estacion;
	String dia = fechanac.substring(0, 2); //busca entre la posicion 0 y 2 los valores que quiero
	String mes = fechanac.substring(fechanac.indexOf("/")+1, fechanac.indexOf("/")+3); 

	int diaNac = Integer.parseInt(dia); //convierte una cadena String en un numero entero
	int mesNac = Integer.parseInt(mes);

	if ((diaNac>=21 && mesNac==12)|| mesNac==1 || mesNac==2 || (diaNac<20 && mesNac==3))
	Estacion = "invierno";
	else if ((diaNac>=20 && mesNac==3) || mesNac==4 || mesNac==5 || (diaNac<21 && mesNac==6))
	Estacion = "primavera";
	else if ((diaNac>=21 && mesNac==6) || mesNac==7 || mesNac==8 || (diaNac<23 && mesNac==9))
	Estacion = "verano";
	else
	Estacion = "otoño";

	System.out.println(this.nombre + ", ha nacido en " + Estacion);
	}
}

	