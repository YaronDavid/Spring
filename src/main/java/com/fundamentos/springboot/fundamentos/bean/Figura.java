package com.fundamentos.springboot.fundamentos.bean;

public class Figura implements IFigura{

	ICalculadora calculadora;
	
	public Figura(ICalculadora calculadora2) {
		this.calculadora = calculadora2;
	}
	
	@Override
	public void areas(int base, int altura) {
		System.out.println("El area de un cuadrado es: ");
		System.out.println(calculadora.potencia(base));
		System.out.println("El area de un triangulo es: ");
		System.out.println(calculadora.multiplicacion(base, altura));
		System.out.println("El area de un rectangulo es: ");
		System.out.println(calculadora.division(calculadora.multiplicacion(base, altura), 2));
	}

	@Override
	public void perimetros(int lado1, int lado2, int lado3, int lado4) {
		System.out.println("El perimetro de un cuadrado es: ");
		System.out.println(calculadora.multiplicacion(lado1,4));
		System.out.println("El area de un triangulo es: ");
		System.out.println(calculadora.suma(calculadora.suma(lado1, lado2),lado3));
		System.out.println("El area de un rectangulo es: ");
		System.out.println(calculadora.suma(lado4,calculadora.suma(calculadora.suma(lado1, lado2), lado3)));
	}
	
}
