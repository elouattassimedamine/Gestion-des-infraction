package com.example.simulatorradarservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SimulatorRadarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulatorRadarServiceApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate(){return new RestTemplate();}
}
