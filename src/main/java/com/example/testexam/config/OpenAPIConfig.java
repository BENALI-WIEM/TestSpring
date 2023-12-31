package com.example.testexam.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI SpringFoyerOpenAPI() {
        return new OpenAPI().info(infoAPI());
    }

    public Info infoAPI() {
        return new Info().title("test")
                .description("étude de cas")
                .contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact().name("wiem")
                .email("wiem.benali@esprit.tn")
                .url("https://github.com/BENALI-WIEM");
        return contact;
    }

    @Bean
    public GroupedOpenApi etudiantPublicAPI() {
        return GroupedOpenApi.builder()
                .group("test")
                .pathsToMatch("/**")
                .build();
    }

}

