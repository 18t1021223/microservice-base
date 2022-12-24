package com.example.apidocumentservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

/**
 * @author NhatPA
 * @since 24/12/2022 - 22:06
 */
@ConfigurationProperties(prefix = "documentation.swagger")
@Getter
@Setter
public class SwaggerServicesConfig {

    private List<SwaggerServices> services;

    @ConfigurationProperties(prefix = "documentation.swagger.services")
    @Getter
    @Setter
    public static class SwaggerServices {
        private String name;
        private String url;
        private String version;
    }

}