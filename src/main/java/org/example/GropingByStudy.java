package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GropingByStudy {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25),
                new Person("David", 30));

        Map<Integer, List<Person>> result = people.stream()
                .collect(Collectors.groupingBy(Person::age));

        System.out.println(result);

    }

    record Person(String name, int age) {
    }

}
