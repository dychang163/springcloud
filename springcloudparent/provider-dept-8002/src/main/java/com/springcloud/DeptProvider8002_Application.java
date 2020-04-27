package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DeptProvider8002_Application {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8002_Application.class,args);
	}
}
