package com.omidmohebbise.immutables;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface PersonList {
    List<Person> getPersons();
}