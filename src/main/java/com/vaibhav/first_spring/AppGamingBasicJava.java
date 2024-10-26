package com.vaibhav.first_spring;

import com.vaibhav.first_spring.game.GameRunner;
import com.vaibhav.first_spring.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
