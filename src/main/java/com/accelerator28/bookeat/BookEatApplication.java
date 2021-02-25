package com.accelerator28.bookeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class) // Delete "(exclude = SecurityAutoConfiguration.class)" in order to enable Spring Security logging
public class BookEatApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookEatApplication.class, args);
    }

}
