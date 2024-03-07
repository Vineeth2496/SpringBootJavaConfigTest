package com.SpringBootJavaConfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringBootJavaConfig.export.ExcelExporter;
import com.SpringBootJavaConfig.export.MyCustomEmpExp;

@Configuration
public class AppConfig {
	//1 object = 1 method
	@Bean("eob")
	public ExcelExporter exp() {
		ExcelExporter exp=new ExcelExporter();
		exp.setFileName("SAMPLE");
		return exp;
	}
	@Bean
	public MyCustomEmpExp cust() {
		MyCustomEmpExp cust=new MyCustomEmpExp();
		cust.setExp(exp());
		return cust;
				
	}
	
}
