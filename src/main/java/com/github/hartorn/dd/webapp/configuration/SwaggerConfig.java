package com.github.hartorn.dd.webapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    static final String detailDescription = "Example description to be replaced";

    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)
          .groupName("v1")
          .apiInfo(apiInfo())
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Starter")
                .description(detailDescription)
//                .termsOfServiceUrl("http://springfox.io")
                .contact(new Contact("Hartorn", "https://github.com/Hartorn/spring-starter-kit", "hartorn.github@gmail.com"))
                .license("Apache License Version 2.0")
                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
                .version("0.0")
                .build();
    }
}