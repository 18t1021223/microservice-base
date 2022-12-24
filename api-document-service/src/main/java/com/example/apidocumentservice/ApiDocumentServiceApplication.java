package com.example.apidocumentservice;

import com.example.apidocumentservice.config.SwaggerServicesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({SwaggerServicesConfig.class, SwaggerServicesConfig.SwaggerServices.class})
public class ApiDocumentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiDocumentServiceApplication.class, args);
    }
}
