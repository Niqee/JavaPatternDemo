package com.niqz.patterns.creational.abstract_factory;

public class FootballFactory implements Factory {
    @Override
    public Ball createBall() {
        return new FootballBall();
    }

    @Override
    public Sneakers createSneakers() {
        return new FootballSneakers();
    }
}
