package com.dj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:8080") // Vue.js의 주소로 변경
                        .allowedMethods("GET", "POST", "PUT", "DELETE");
            }
        };
    }
}
/*
 * Spring Boot에서 CORS를 구성하여 Vue.js에서 요청을 허용하는 작업
 * CORS?(교차 출처 리소스 공유) : 출처에 있는 자원에서 다른 출처에 있는 자원에 접근하도록 하는 개념
 * */