package com.niqz.patterns.structural.bridge;

public class View {

    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void onCompleteField() {
        controller.validateField();
    }

    public void onSubmit() {
        controller.checkAllFieldsCompleted();
        controller.submit();
    }
}
