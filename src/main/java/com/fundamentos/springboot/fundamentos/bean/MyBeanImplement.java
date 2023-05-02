package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean{

	@Override
	public void saludar() {
		System.out.println("Saludos desde mi bean");
	}

}
