package com.niqz.patterns.structural.decorator;

public class TelegramNotifier extends BaseDecorator {
    public TelegramNotifier(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public void notify(String message) {
        super.notify(message);
        // Do some stuff with Telegram
    }
}
