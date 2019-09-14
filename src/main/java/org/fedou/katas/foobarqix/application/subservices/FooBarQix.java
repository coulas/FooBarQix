package org.fedou.katas.foobarqix.application.subservices;

import org.fedou.katas.foobarqix.application.subservices.multiples.FooBarQixMultiples;
import org.fedou.katas.foobarqix.application.subservices.occurs.FooBarQixOccurs;

public class FooBarQix {

    private FooBarQixMultiples multiples;
    private FooBarQixOccurs occurences;

    public FooBarQix(FooBarQixMultiples multiples, FooBarQixOccurs occurences) {
        this.multiples = multiples;
        this.occurences = occurences;
    }

    public String compute(int input) {
        StringBuilder result = new StringBuilder();
        result.append(multiples.transformMultiples(input));
        result.append(occurences.transformOccurences(input));
        if (result.length() == 0) {
            result.append(input);
        }
        return result.toString();
    }

}
