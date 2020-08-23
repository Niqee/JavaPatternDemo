package com.niqz.patterns.structural.adapter;

public class PaletteAdapter implements Palette {

    @Override
    public Color getDarkRed() {
        return Color.fromRGB(139, 0, 0);
    }

    @Override
    public Color getGold() {
        return Color.fromRGB(255, 215, 0);
    }

    @Override
    public Color getOrangeRed() {
        return Color.fromRGB(255, 165, 0);
    }

    @Override
    public Color getKhaki() {
        return Color.fromRGB(240, 230, 140);
    }
}
