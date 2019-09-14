package org.fedou.katas.foobarqix.application.subservices;

public enum FooBarQixValues {
    foo(3), bar(5), qix(7);

    private String factorLetter;
    private int factorValue;

    FooBarQixValues(int factor) {
        this.factorValue = factor;
        this.factorLetter = "" + factor;
    }

    public boolean isDivisorOf(int input) {
        return input % factorValue == 0;
    }

    public boolean isOccurence(String input) {
        return factorLetter.equals(input);
    }
}
