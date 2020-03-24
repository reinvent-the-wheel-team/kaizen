package com.pl.kaizen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebLayerConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
//        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
        // manualnie zmuszenie Springa do traktowania tej sciezki jako statyczna z css i js
    }

    @Override// Tomcat domyslnie potrafi rozroznic co jest statyczne(css, js ) a co javowe
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
