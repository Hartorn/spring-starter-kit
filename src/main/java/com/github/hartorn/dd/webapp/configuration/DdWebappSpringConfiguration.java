package com.github.hartorn.dd.webapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.github.hartorn.dd.webapp.controller.GreetingController;
import com.github.hartorn.dd.webapp.model.ActionService;

// https://github.com/springfox/springfox-demos/blob/master/spring-java-swagger/src/main/java/springfoxdemo/java/swagger/SpringConfig.java
/**
 * Configuration for Spring MVC.
 *
 * @author Bazire
 *
 */
@Configuration
@EnableWebMvc
@Import(SwaggerConfig.class)
@ComponentScan(basePackageClasses = { GreetingController.class, ActionService.class })
public class DdWebappSpringConfiguration implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
