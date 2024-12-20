package com.vaibhav.first_spring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements IGamingConsole{
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Duck");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Go forward");
    }
}
