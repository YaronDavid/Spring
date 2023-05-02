package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanTwoImplement implements MyBean{

	@Override
	public void saludar() {
		System.out.println("Saludos desde mi bean 2");
	}

}
