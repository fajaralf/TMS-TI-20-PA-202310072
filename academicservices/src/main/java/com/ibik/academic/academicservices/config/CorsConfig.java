package com.ibik.academic.academicservices.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Value("${allowed.origin}")
    private String allowedOrigin;

    @Bean
    public WebMvcConfigurer getCoursConfiguration() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        // .allowedOrigins("http://localhost:8282","")
                        .allowedOrigins(allowedOrigin)
                        // .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedMethods("*")
                        .allowedHeaders("*");
            }
        };
    }
}
