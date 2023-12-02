package com.omidmohebbise.immutables;

import java.util.List;

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


        // Creating an immutable list of persons
        PersonList personList = ImmutablePersonList.builder()
                .addPersons(
                        ImmutablePerson.builder().name("John").age(30).build(),
                        ImmutablePerson.builder().name("Jane").age(25).build()
                )
                .build();

        // Accessing the list
        List<Person> persons = personList.getPersons();
        for (Person person1 : persons) {
            System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
        }

        // Attempting to modify the list (not allowed due to immutability)
        // persons.add(ImmutablePerson.builder().name("Bob").age(40).build()); // Compilation error



    }
}