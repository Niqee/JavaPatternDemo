package com.niqz.patterns.structural;

import com.niqz.patterns.structural.flyweight.Context;
import com.niqz.patterns.structural.flyweight.FlyweightFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlyweightTest {

    @Test
    public void test() {
        Context[] contexts = new Context[1000];
        for (int i = 0; i < contexts.length; i++) {
            contexts[i] = new Context(i, i % 7);
        }
        assertEquals(7, FlyweightFactory.getInstance().getCacheSize());
    }
}
