package com.fundamentos.springboot.fundamentos.bean;

public class Calculadora implements ICalculadora{

	@Override
	public int suma(int numero1, int numero2) {
		return numero1+numero2;
	}

	@Override
	public int resta(int numero1, int numero2) {
		return numero1-numero2;
	}

	@Override
	public int multiplicacion(int numero1, int numero2) {
		return numero1*numero2;
	}

	@Override
	public float division(int numero1, int numero2) {
		return numero1/numero2;
	}

	@Override
	public int potencia(int numero) {
		return numero*numero;
	}

}
