package com.springcloud;

import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eureka7022_application {
	public static void main(String[] args) {
		SpringApplication.run(eureka7022_application.class, args);
	}
}
