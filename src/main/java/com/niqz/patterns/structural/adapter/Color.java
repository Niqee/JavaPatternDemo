package com.niqz.patterns.structural.adapter;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Color {

    private final int r, g, b;

    private Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static Color fromRGB(int r, int g, int b) {
        return new Color(r, g, b);
    }
}
