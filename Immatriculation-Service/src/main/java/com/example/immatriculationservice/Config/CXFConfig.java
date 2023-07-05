package com.example.immatriculationservice.Config;

import com.example.immatriculationservice.Web.SOAP.VehiculeSoapController;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CXFConfig {

    private Bus bus;
    private VehiculeSoapController vehiculeSoapController;

    @Bean
    public EndpointImpl endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus,vehiculeSoapController);
        endpoint.publish("/VehiculeController");
        return endpoint;
    }
}
