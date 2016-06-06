package ar.edu.unlam.tp1;

public class Circulo {
	
//atributos
	private Double radio;
	private Double circunferencia;
	private Double area;
	private static final Double PI = java.lang.Math.PI;	
	
//Constructor
	
	public Circulo(double radio){
		this.radio = radio;
		this.circunferencia = 2*PI*radio;
		this.area = PI * radio * radio;
	}

////getters
	
	public double getRadio() {
		return this.radio;
	}

	public double getCircunferencia() {
		return this.circunferencia;
	}
	
	public double getArea() {
		return this.area;
	}		
}
