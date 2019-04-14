package com.wsmytraining.config;

import io.swagger.annotations.Api;
import java.util.ArrayList;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import static springfox.documentation.builders.PathSelectors.regex;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableSwagger2
@Api(value = "API RESTful My Training")
@CrossOrigin(origins = "")
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wsmytraining"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }
    
    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "My Training API RESTful",
                "API RESTful para controle dos dados do app My Training.",
                "1.0",
                "Terms of Service",
                new Contact("Álvaro Ferreira", "https://www.github.com/alvarojfjunior",
                        "alvarojfjunior@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );
        return apiInfo;
    }

}
