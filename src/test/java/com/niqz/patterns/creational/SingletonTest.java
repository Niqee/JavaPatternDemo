package com.niqz.patterns.creational;

import com.niqz.patterns.creational.singleton.Singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    public void test() {
        Singleton ob1 = Singleton.getInstance();
        Singleton ob2 = Singleton.getInstance();
        assertSame(ob1, ob2);
    }
}
