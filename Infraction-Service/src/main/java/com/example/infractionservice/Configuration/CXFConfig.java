package com.example.infractionservice.Configuration;
import com.example.infractionservice.Web.SOAP.InfractionSoapController;
import lombok.AllArgsConstructor;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CXFConfig {

    private Bus bus;
    private InfractionSoapController infractionSoapController;

    @Bean
    public EndpointImpl endpoint(){
        EndpointImpl endpoint = new EndpointImpl(bus,infractionSoapController);
        endpoint.publish("/InfractionController");
        return endpoint;
    }
}

