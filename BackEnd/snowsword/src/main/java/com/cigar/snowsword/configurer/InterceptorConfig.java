package com.cigar.snowsword.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cigar.snowsword.interceptor.Authentication;

//配置拦截器来处理请求
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Bean
    Authentication AuthenticationInterceptor() {
        return new Authentication();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        将这个拦截器应用于所有路径 /**，除了
        registry.addInterceptor(AuthenticationInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/user/logout")
                .excludePathPatterns("/error")
                .excludePathPatterns("/static/index.html")
                .excludePathPatterns("/index.html")
                .excludePathPatterns("/")
                .excludePathPatterns("/static/**");
    }
}
