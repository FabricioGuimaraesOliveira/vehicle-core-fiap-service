package com.fiap.vehicle.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.fiap.vehicle.core.infrastructure.sales") // ajuste para o pacote correto

public class VehicleCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleCoreApplication.class, args);
	}

}
