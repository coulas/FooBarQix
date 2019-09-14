package org.fedou.katas.foobarqix.application.opensingleservice;

import org.fedou.katas.foobarqix.application.subservices.FooBarQixValues;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FooBarQixFullOpen {
    private enum values {
        foo(3), bar(5), qix(7);

        private String factorLetter;
        private int factorValue;

        values(int factor) {
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

    public String compute(int input) {
        StringBuilder result = new StringBuilder();
        result.append(transformMultiples(input));
        result.append(transformOccurences(input));
        if (result.length() == 0) {
            result.append(input);
        }
        return result.toString();
    }

    String transformMultiples(int input) {
        StringBuilder result = new StringBuilder();
        for (values value : values.values()) {
            if (value.isDivisorOf(input)) {
                result.append(value);
            }
        }
        return result.toString();
    }

    String transformOccurences(int input) {
        return Arrays
                .stream(
                        ("" + input).split("")
                ).map(c -> {
                            for (values fooBarQixValue : values.values()) {
                                if (fooBarQixValue.isOccurence(c)) {
                                    return fooBarQixValue.toString();
                                }
                            }
                            return "";
                        }
                ).collect(Collectors.joining());
    }
}
