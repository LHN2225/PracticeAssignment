package com.example.PracticeAssignment.config;

import com.example.PracticeAssignment.interceptor.LogServiceInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class InterceptorRegistry extends WebMvcConfigurerAdapter {
    @Autowired
    LogServiceInterceptor logServiceInterceptor;

    @Override
    public void addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
        registry.addInterceptor(logServiceInterceptor);
    }
}
