package com.fundamentos.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency {

	
	public void saludar() {
		System.out.println("Saludos desde mi componente");
	}

}
