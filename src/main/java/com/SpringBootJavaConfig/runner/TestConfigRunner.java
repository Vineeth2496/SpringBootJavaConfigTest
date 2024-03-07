package com.SpringBootJavaConfig.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJavaConfig.export.ExcelExporter;
import com.SpringBootJavaConfig.export.MyCustomEmpExp;
@Component
public class TestConfigRunner implements CommandLineRunner {
	@Autowired
	//private ExcelExporter exp;
	private MyCustomEmpExp cust;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(cust);

	}

}
