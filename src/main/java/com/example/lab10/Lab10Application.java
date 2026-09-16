package com.example.lab10;

import com.example.lab10.client.ProductWebClient;
import com.example.lab10.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Lab 10 — Spring WebFlux + WebClient
 * CP353002 Principles of Software Design
 *
 * @SpringBootApplication รวม 3 annotation:
 *   - @Configuration          : Spring config class
 *   - @EnableAutoConfiguration : เปิด Auto-config (รวม WebFlux)
 *   - @ComponentScan          : สแกนหา @Component, @RestController ฯลฯ
 *
 * Framework จะรันบน Reactor Netty (non-blocking) แทน Tomcat
 */
@SpringBootApplication
public class Lab10Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab10Application.class, args);
    }
 /*  @Bean
    CommandLineRunner testWebClient(ProductWebClient client) {
        return args -> {
            System.out.println("=== Test WebClient ===");
            client.getAllProducts()
                .subscribe(p -> System.out.println("Product: " + p.getName()));
        
            client.getDiscountedPrice("1")
                .subscribe(price -> System.out.println("Price: " + price));
        };
    }*/  

}