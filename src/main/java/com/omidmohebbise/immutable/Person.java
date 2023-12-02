package com.omidmohebbise.immutable;

import org.immutables.value.Value;

@Value.Immutable
public interface Person {
    String getName();
    int getAge();
}
