package com.calltech.my_first_web_api.doc;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Title - Rest API")
                        .description("API exemplo de uso de Springboot REST API")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Licença - Sua Empresa")
                                .url("http://www.calltech.com.br"))
                        .contact(new Contact()
                                .name("Alex Vieira")
                                .url("http://www.calltech.com.br")
                                .email("alexvieira@calltech.com.br")
                        )
                );
    }
}