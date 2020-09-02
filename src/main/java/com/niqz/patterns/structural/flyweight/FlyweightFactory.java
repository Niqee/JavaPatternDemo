package com.niqz.patterns.structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class FlyweightFactory {

    private final Set<Flyweight> cache;

    private static FlyweightFactory instance = null;

    private FlyweightFactory() {
        cache = new HashSet<>();
    }

    public static FlyweightFactory getInstance() {
        if (instance == null)
            instance = new FlyweightFactory();
        return instance;
    }

    public Flyweight getFlyweight(int state) {
        for (Flyweight candidate : cache) {
            if (candidate.getState() == state)
                return candidate;
        }

        Flyweight newObj = new Flyweight(state);
        cache.add(newObj);
        return newObj;
    }

    public int getCacheSize() {
        return cache.size();
    }
}
