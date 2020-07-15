package com.jjc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <a href="https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Access_control_CORS">HTTP访问控制（CORS）</a>
 * @author jjc
 * 2020-07-07
 */
@Configuration
public class WebMvcCorsConfigurer implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowCredentials(true);
	}

}