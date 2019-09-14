package org.fedou.katas.foobarqix.application.subservices.multiples;

import org.fedou.katas.foobarqix.application.subservices.FooBarQixValues;

public class FooBarQixMultiples {
    public String transformMultiples(int input) {
        StringBuilder result = new StringBuilder();
        for (FooBarQixValues value : FooBarQixValues.values()) {
            if (value.isDivisorOf(input)) {
                result.append(value);
            }
        }
        return result.toString();
    }
}
