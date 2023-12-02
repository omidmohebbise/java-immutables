package com.omidmohebbise.immutables;

import org.immutables.value.Value;

@Value.Immutable
public interface Person {
    String getName();
    int getAge();
}
