package com.vaibhav.first_spring;

import com.vaibhav.first_spring.game.GameRunner;
import com.vaibhav.first_spring.game.IGamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpring {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(AppGamingConfig.class)) {
            ((GameRunner) context.getBean("gameRunner")).run();
        }
    }
}
