package com.vaibhav.first_spring;

import com.vaibhav.first_spring.game.GameRunner;
import com.vaibhav.first_spring.game.MarioGame;
import com.vaibhav.first_spring.game.PacManGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new PacManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
