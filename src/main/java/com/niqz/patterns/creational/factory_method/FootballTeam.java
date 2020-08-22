package com.niqz.patterns.creational.factory_method;

public class FootballTeam implements Team {

    @Override
    public void printInfo() {
        System.out.println("The best football team");
    }

    @Override
    public Player generateNewPlayer() {
        return new FootballPlayer();
    }
}
