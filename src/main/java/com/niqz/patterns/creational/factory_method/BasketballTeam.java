package com.niqz.patterns.creational.factory_method;

public class BasketballTeam implements Team {

    @Override
    public void printInfo() {
        System.out.println("The best basketball team");
    }

    @Override
    public Player generateNewPlayer() {
        return new BasketballPlayer();
    }
}
