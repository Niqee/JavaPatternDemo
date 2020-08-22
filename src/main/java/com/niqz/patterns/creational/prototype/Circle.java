package com.niqz.patterns.creational.prototype;

public class Circle implements Prototype {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Prototype copy() {
        Circle c = new Circle();
        c.radius = this.radius;
        return c;
    }
}
