package com.fundamentos.springboot.fundamentos.bean;

public class BeanWithDependencyImplement implements BeanWithDependency{

	private MyOperation myOperation;
	
	public BeanWithDependencyImplement(MyOperation myOperation) {
		this.myOperation = myOperation;
	}
	
	@Override
	public void print() {
		int n = 1;
		System.out.println(myOperation.sum(n));
		System.out.println("Hola desde la implementacion de un bean con dependencia");
		
	}

}
