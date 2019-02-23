package com.example.exporttocsvpoc.app;

import com.example.exporttocsvpoc.utils.ZendeskAPI;
import feign.Feign;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync
@ComponentScan(basePackages = {"com.example.exporttocsvpoc"})
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
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(8);
        executor.setMaxPoolSize(8);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("Thread-");
        executor.initialize();
        return executor;
    }

    @Bean
    ZendeskAPI zendeskAPI() {
        return Feign.builder()
                .requestInterceptor(new BasicAuthRequestInterceptor(user, pass))
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.FULL)
                .target(ZendeskAPI.class, baseUrl);
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
