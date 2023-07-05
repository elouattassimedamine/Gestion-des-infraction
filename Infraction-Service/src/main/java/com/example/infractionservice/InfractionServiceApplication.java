package com.example.infractionservice;

import com.example.infractionservice.DTO.InfractionRequestDTO;
import com.example.infractionservice.Service.InfractionService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class InfractionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfractionServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner start(InfractionService infractionService){
		return args -> {
			infractionService.save(new InfractionRequestDTO("1645A1",73,1L,60));
			infractionService.save(new InfractionRequestDTO("1645A2",134,2L,120));
			infractionService.save(new InfractionRequestDTO("1645A3",55,3L,40));
			infractionService.save(new InfractionRequestDTO("1645A4",85,4L,60));
			infractionService.save(new InfractionRequestDTO("1645A1",149,5L,100));

			infractionService.save(new InfractionRequestDTO("1645A1",89,1L,60));
			infractionService.save(new InfractionRequestDTO("1645A2",124,2L,120));
			infractionService.save(new InfractionRequestDTO("1645A3",59,3L,40));
			infractionService.save(new InfractionRequestDTO("1645A4",72,4L,60));
			infractionService.save(new InfractionRequestDTO("1645A1",117,5L,100));

			infractionService.save(new InfractionRequestDTO("1645A1",99,1L,60));
			infractionService.save(new InfractionRequestDTO("1645A2",126,2L,120));
			infractionService.save(new InfractionRequestDTO("1645A3",47,3L,40));
			infractionService.save(new InfractionRequestDTO("1645A4",74,4L,60));
			infractionService.save(new InfractionRequestDTO("1645A1",131,5L,100));
		};
	}

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
