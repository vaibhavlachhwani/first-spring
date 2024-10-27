package com.vaibhav.first_spring.game;

public class SuperContraGame implements IGamingConsole{
    @Override
    public void up() {
        System.out.println("Peek up");
    }

    @Override
    public void down() {
        System.out.println("Crouch");
    }

    @Override
    public void left() {
        System.out.println("Reload");
    }

    @Override
    public void right() {
        System.out.println("Fire");
    }
}
