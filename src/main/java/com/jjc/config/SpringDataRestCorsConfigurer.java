package com.jjc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class SpringDataRestCorsConfigurer implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		config.getCorsRegistry().addMapping("/**").allowedOrigins("*").allowCredentials(true);
				//.allowedMethods("PUT", "DELETE").allowedHeaders("header1", "header2", "header3")
				//.exposedHeaders("header1", "header2").allowCredentials(false).maxAge(3600);
	}
}
