package com.omidmohebbise.immutable;

public class Main {
    public static void main(String[] args) {
        // Using the builder to create an instance of Person
        Person person = ImmutablePerson.builder()
                .name("John")
                .age(30)
                .build();

        // Accessing values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());


    }
}