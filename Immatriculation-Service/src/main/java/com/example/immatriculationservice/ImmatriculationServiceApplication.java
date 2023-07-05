package com.example.immatriculationservice;

import com.example.immatriculationservice.DTO.VehiculeRequestDTO;
import com.example.immatriculationservice.Service.VehiculeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class ImmatriculationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(VehiculeService vehiculeService){
        return args -> {
            vehiculeService.save(new VehiculeRequestDTO(0L,"Amine","10-02-1997","amine@amine","Avenue Mohamed VI",0L,"Mercedes","C220","1645A1",8));
            vehiculeService.save(new VehiculeRequestDTO(0L,"Sara","21-12-1999","sara@sara","Avenue Oqba",0L,"Renault","Megane","1645A2",6));
            vehiculeService.save(new VehiculeRequestDTO(0L,"Rania","19-07-1993","rania@rania","Avenue Abtal",0L,"BMW","535","1645A3",10));
            vehiculeService.save(new VehiculeRequestDTO(0L,"Yousra","08-08-1987","yousra@yousra","Avenue Hassane II",0L,"Audi","A6","1645A4",12));
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
