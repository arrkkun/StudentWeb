package com.itheima.student.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.Serializable;

@Configuration
public class CorsConfig implements WebMvcConfigurer, Serializable {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 匹配所有路径
                .allowedOrigins("http://localhost:8000") // 允许的跨域来源，可以使用通配符或多个值
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 允许的请求方法
                .allowedHeaders("*") // 允许的请求头
                .allowCredentials(true) // 是否允许发送凭证信息（如 cookies）
                .maxAge(3600); // 预检请求的有效期，单位秒
    }

}
