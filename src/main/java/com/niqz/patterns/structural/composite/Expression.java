package com.niqz.patterns.structural.composite;

import java.util.List;

public class Expression implements Component {
    private final List<Component> components;

    public Expression(List<Component> components) {
        this.components = components;
    }

    @Override
    public double count() {
        double sum = 0;
        for(Component c: components) {
            sum += c.count();
        }
        return sum;
    }
}
