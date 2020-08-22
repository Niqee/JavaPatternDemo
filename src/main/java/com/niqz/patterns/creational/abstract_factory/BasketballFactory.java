package com.niqz.patterns.creational.abstract_factory;

public class BasketballFactory implements Factory {
    @Override
    public Ball createBall() {
        return new BasketballBall();
    }

    @Override
    public Sneakers createSneakers() {
        return new BasketballSneakers();
    }
}
