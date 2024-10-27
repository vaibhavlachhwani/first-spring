package com.vaibhav.first_spring.game;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class PacManGame implements IGamingConsole{
    @Override
    public void up() {
        System.out.println("Go north");
    }

    @Override
    public void down() {
        System.out.println("Go south");
    }

    @Override
    public void left() {
        System.out.println("Go west");
    }

    @Override
    public void right() {
        System.out.println("Go east");
    }
}
