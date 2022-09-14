package com.finvivir.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioWeatherApplication.class, args);
	}

}
