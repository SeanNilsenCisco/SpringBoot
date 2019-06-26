package com.example.springboot.demo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;


@Configuration
public class WebConfiguration {

    @Bean
    ServletRegistrationBean mainServletRegistration(){
     ServletRegistrationBean registrationBean = new ServletRegistrationBean(new BootServlet());
     registrationBean.addUrlMappings("/myConsole/*");
     return registrationBean;
    }
}
