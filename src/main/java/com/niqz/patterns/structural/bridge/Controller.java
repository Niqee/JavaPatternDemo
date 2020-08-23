package com.niqz.patterns.structural.bridge;

public interface Controller {
    void validateField();
    void checkAllFieldsCompleted();
    void submit();
}
