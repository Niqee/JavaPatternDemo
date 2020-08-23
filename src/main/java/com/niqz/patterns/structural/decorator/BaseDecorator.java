package com.niqz.patterns.structural.decorator;

public abstract class BaseDecorator extends Notifier {
    private Notifier wrappedNotifier;

    public BaseDecorator(Notifier wrappedNotifier) {
        this.wrappedNotifier = wrappedNotifier;
    }

    @Override
    public void notify(String message) {
        wrappedNotifier.notify(message);
    }
}
