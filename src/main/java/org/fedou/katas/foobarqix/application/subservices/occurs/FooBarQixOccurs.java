package org.fedou.katas.foobarqix.application.subservices.occurs;

import org.fedou.katas.foobarqix.application.subservices.FooBarQixValues;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FooBarQixOccurs {

    public String transformOccurences(int input) {
        return Arrays
                .stream(
                        ("" + input).split("")
                ).map(c -> {
                            for (FooBarQixValues fooBarQixValue : FooBarQixValues.values()) {
                                if (fooBarQixValue.isOccurence(c)) {
                                    return fooBarQixValue.toString();
                                }
                            }
                            return "";
                        }
                ).collect(Collectors.joining());
    }
}
