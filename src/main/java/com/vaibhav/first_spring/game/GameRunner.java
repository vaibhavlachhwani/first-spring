package com.vaibhav.first_spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private IGamingConsole game;
    public GameRunner(@Qualifier("SuperContraGameQualifier") IGamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game : " + game.getClass().getName());

        game.up();
        game.down();
        game.left();
        game.right();
    }
}
