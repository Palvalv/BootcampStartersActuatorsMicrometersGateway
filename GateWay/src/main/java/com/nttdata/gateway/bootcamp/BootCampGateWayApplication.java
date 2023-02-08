package com.nttdata.gateway.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nttdata")
public class BootCampGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCampGateWayApplication.class, args);
	}

}
