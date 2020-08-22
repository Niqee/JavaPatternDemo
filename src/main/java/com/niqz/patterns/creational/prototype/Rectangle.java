package com.niqz.patterns.creational.prototype;

public class Rectangle implements Prototype {

    private int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public Prototype copy() {
        Rectangle r = new Rectangle();
        r.height = this.height;
        r.width = this.width;
        return r;
    }
}
