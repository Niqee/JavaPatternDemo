package com.niqz.patterns.structural.flyweight;

public class Context {

    private int state;

    private final Flyweight flyweight;

    public Context(int contextState, int flyweightState) {
        flyweight = FlyweightFactory.getInstance().getFlyweight(flyweightState);
        this.state = contextState;
    }
}
