package com.niqz.patterns.structural.proxy;

public class ServiceImpl implements Service {

    @Override
    public void foo() {
        System.out.println("Secured message");
    }
}
