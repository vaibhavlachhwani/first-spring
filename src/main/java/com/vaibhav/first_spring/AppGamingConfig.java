package com.vaibhav.first_spring;

import com.vaibhav.first_spring.game.GameRunner;
import com.vaibhav.first_spring.game.IGamingConsole;
import com.vaibhav.first_spring.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGamingConfig {
    @Bean
    public IGamingConsole game() {
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(IGamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
