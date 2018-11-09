package com.example.exporttocsvpoc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@SpringBootApplication
@EnableAsync
public class ExportToCsvPocApplication {
    @Value("${server.user}")
    String user;
    @Value("${server.pass}")
    String pass;
    @Value("${server.url}")
    String baseUrl;

	public static void main(String[] args) {
		SpringApplication.run(ExportToCsvPocApplication.class, args).close();
	}

	@Bean
    RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                .basicAuthentication(user, pass)
                .rootUri(baseUrl)
                .build();
    }
}
