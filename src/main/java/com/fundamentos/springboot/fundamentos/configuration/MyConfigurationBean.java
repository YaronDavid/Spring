package com.fundamentos.springboot.fundamentos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundamentos.springboot.fundamentos.bean.BeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.BeanWithDependencyImplement;
import com.fundamentos.springboot.fundamentos.bean.Calculadora;
import com.fundamentos.springboot.fundamentos.bean.Figura;
import com.fundamentos.springboot.fundamentos.bean.ICalculadora;
import com.fundamentos.springboot.fundamentos.bean.IFigura;
import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBeanTwoImplement;
import com.fundamentos.springboot.fundamentos.bean.MyOperation;
import com.fundamentos.springboot.fundamentos.bean.MyOperationImplement;

@Configuration
public class MyConfigurationBean {
	@Bean
	public MyBean beanOperation() {
		return new MyBeanTwoImplement();
	}
	
	@Bean
	public MyOperation beanOperationImplement() {
		return new MyOperationImplement();
	}
	@Bean
	public BeanWithDependency myOperationImplement(MyOperation myOperation) {
		return new BeanWithDependencyImplement(myOperation);
	}
	
	@Bean
	public ICalculadora calculadoraImplemet() {
		return new Calculadora();
	}
	
	@Bean
	public IFigura figuraImplement(ICalculadora calculadora){
		return new Figura(calculadora);
	}
}
