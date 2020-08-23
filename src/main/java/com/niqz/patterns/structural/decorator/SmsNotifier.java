package com.niqz.patterns.structural.decorator;

public class SmsNotifier extends BaseDecorator {
    public SmsNotifier(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        // Do some stuff with SMS
    }
}
