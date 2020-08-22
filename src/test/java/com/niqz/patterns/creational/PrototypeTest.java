package com.niqz.patterns.creational;

import com.niqz.patterns.creational.prototype.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {

    @Test
    public void test() {
        Rectangle ob1 = new Rectangle(10, 20);
        Rectangle ob2 = (Rectangle) ob1.copy();
        assertNotSame(ob1, ob2);
        ob1.setHeight(15);
        assertEquals(ob2.getHeight(), 10);
    }
}
