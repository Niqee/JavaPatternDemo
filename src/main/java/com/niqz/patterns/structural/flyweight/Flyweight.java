package com.niqz.patterns.structural.flyweight;

import java.util.Objects;

public class Flyweight {

    private final int state;

    public Flyweight(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flyweight flyweight = (Flyweight) o;
        return state == flyweight.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(state);
    }
}
