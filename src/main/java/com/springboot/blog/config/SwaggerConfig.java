package com.springboot.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Blog REST API ",
                "Spring Boot Blog Api Documentation",
                "v.1.0",
                "terms and conditions",
                new Contact("Diptiranjan", "www.tr.com", "dipti@gmail.com"),
                "Licence API",
                "LICENCE API URL",
                Collections.emptyList()
        );
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
