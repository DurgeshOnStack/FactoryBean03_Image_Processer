package com.nit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.nit.factory.ImageProcessorFactoryBean;

@Configuration
@PropertySource("com/nit/properties/application.properties")
public class AppConfig {
     @Value("${image.process}")
	private String type;
	
     @Bean
     public ImageProcessorFactoryBean process() {
    	 ImageProcessorFactoryBean factory= new ImageProcessorFactoryBean();
    	 factory.setImageProcessorType(type);
    	 return factory;
     }
}
