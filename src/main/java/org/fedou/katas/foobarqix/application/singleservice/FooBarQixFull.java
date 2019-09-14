package org.fedou.katas.foobarqix.application.singleservice;

import org.fedou.katas.foobarqix.application.subservices.FooBarQixValues;

import java.util.Arrays;

public class FooBarQixFull {
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
        for (values value : values.values()) {
            if (value.isDivisorOf(input)) {
                result.append(value);
            }
        }
        Arrays.stream(
                ("" + input).split("")
        ).forEach(c -> {
            for (FooBarQixValues fooBarQixValue : FooBarQixValues.values()) {
                if (fooBarQixValue.isOccurence(c)) {
                    result.append(fooBarQixValue);
                }
            }
        });
        if (result.length() == 0) {
            result.append(input);
        }
        return result.toString();
    }
}