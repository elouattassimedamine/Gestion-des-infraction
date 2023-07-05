package com.example.radarservice;

import com.example.immatriculationservice.web.soap.VehiculeSoapController;
import com.example.immatriculationservice.web.soap.VehiculeWS;
import com.example.infractionservice.web.soap.InfractionSoapController;
import com.example.infractionservice.web.soap.InfractionWS;
import com.example.radarservice.DTO.RadarRequestDTO;
import com.example.radarservice.Service.RadarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class RadarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadarServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(RadarService radarService){
		return args -> {
			radarService.save(new RadarRequestDTO(0L,60,112,21));
			radarService.save(new RadarRequestDTO(0L,120,321,201));
			radarService.save(new RadarRequestDTO(0L,40,34,67));
			radarService.save(new RadarRequestDTO(0L,60,189,912));
			radarService.save(new RadarRequestDTO(0L,100,882,542));
		};
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	InfractionSoapController infractionSoapController(){
		return new InfractionWS().getInfractionSoapControllerPort();
	}

	@Bean
	VehiculeSoapController vehiculeSoapController(){ return new VehiculeWS().getVehiculeSoapControllerPort();}

	@Bean
	public CorsFilter corsFilter(){
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200","http://localhost:3000"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin","Access-Control-Allow-Origin","Content-Type","Accept","Jwt-Token",
				"Authorization","Origin, Accept","X-Requested-With","Access-Control-Request-Method","Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin","Content-Type","Accept","Jwt-Token","Authorization","Access-Control-Allow-Origin",
				"Access-Control-Allow-Credentials","Filename"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET","POST","PUT","PATCH","DELETE","OPTIONS"));
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}
}
