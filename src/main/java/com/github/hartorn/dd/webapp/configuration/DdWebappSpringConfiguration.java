package com.github.hartorn.dd.webapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.github.hartorn.dd.webapp.controller.GreetingController;
import com.github.hartorn.dd.webapp.model.ActionService;

/**
 * Configuration for Spring MVC.
 *
 * @author Bazire
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = { GreetingController.class, ActionService.class })
public class DdWebappSpringConfiguration {

}
