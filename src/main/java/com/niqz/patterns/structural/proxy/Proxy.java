package com.niqz.patterns.structural.proxy;

public class Proxy implements Service {

    private final Service service;

    public Proxy(Service service) {
        this.service = service;
    }

    @Override
    public void foo() {
        logImportantInfo();
        checkLoginAndPassword();
        service.foo();
    }

    private static void checkLoginAndPassword() {
        // Do some stuff
    }

    private static void logImportantInfo() {
        // Do some stuff
    }
}
