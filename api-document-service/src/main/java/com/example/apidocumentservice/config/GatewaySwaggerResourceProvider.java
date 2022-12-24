package com.example.apidocumentservice.config;

import org.springdoc.core.AbstractSwaggerUiConfigProperties.SwaggerUrl;
import org.springdoc.core.SwaggerUiConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * @author NhatPA
 * @since 24/12/2022 - 22:09
 */
@Configuration
public class GatewaySwaggerResourceProvider {
    @Autowired
    private SwaggerServicesConfig swaggerServiceList;

    @Bean
    public Set<SwaggerUrl> apis(SwaggerUiConfigProperties swaggerUiConfig) {
        Set<SwaggerUrl> swaggerUrlSet = new HashSet<>();
        swaggerServiceList.getServices()
                .forEach(service ->
                        swaggerUrlSet.add(new SwaggerUrl(
                                service.getName(),
                                service.getUrl(),
                                service.getName() + "-" + service.getVersion()
                        ))
                );
        swaggerUiConfig.setUrls(swaggerUrlSet);
        return swaggerUrlSet;
    }
}
