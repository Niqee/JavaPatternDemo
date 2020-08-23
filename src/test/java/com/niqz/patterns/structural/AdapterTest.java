package com.niqz.patterns.structural;

import com.niqz.patterns.structural.adapter.Color;
import com.niqz.patterns.structural.adapter.Palette;
import com.niqz.patterns.structural.adapter.PaletteAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {

    @Test
    public void test() {
        Palette p = new PaletteAdapter();
        assertEquals(Color.fromRGB(139, 0, 0), p.getDarkRed());
        assertEquals(Color.fromRGB(255, 215, 0), p.getGold());
        assertEquals(Color.fromRGB(255, 165, 0), p.getOrangeRed());
        assertEquals(Color.fromRGB(240, 230, 140), p.getKhaki());
    }
}
