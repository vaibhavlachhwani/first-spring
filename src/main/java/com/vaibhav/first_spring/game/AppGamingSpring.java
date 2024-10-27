package com.vaibhav.first_spring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.vaibhav.first_spring.game")
public class AppGamingSpring {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(AppGamingSpring.class)) {
            ((GameRunner) context.getBean("gameRunner")).run();
        }
    }
}
