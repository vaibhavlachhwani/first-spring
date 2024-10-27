package com.vaibhav.first_spring;

import com.vaibhav.first_spring.game.GameRunner;
import com.vaibhav.first_spring.game.IGamingConsole;
import com.vaibhav.first_spring.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGamingSpring {
    @Bean
    public IGamingConsole game() {
        return new PacManGame();
    }

    @Bean
    public GameRunner gameRunner(IGamingConsole game) {
        return new GameRunner(game);
    }

    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(AppGamingSpring.class)) {
            ((GameRunner) context.getBean("gameRunner")).run();
        }
    }
}
