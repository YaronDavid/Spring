package com.fundamentos.springboot.fundamentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fundamentos.springboot.fundamentos.bean.BeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.IFigura;
import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.component.ComponentDependency;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private BeanWithDependency beanWithDependency;
	private IFigura figura;
	
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean,
			BeanWithDependency beanWithDependency, IFigura figura) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.beanWithDependency = beanWithDependency;
		this.figura = figura;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}


	@Override
	public void run(String... args) {
		componentDependency.saludar();
		myBean.saludar();
		this.beanWithDependency.print();
		figura.areas(5, 2);
		figura.perimetros(3, 5, 7, 9);
		
	}

}
