package io.github.DekkerDing.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ECommerceServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ECommerceServiceApplication.class, args);
    }
}
