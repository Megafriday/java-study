package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingByStudy2 {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("inoki", 55),
                new Person("fujinami", 55),
                new Person("maeda", 40),
                new Person("sayama", 40)
        );

        var result = people.stream()
                .collect(Collectors.groupingBy(person -> person.age));

        System.out.println(result.toString());
    }

    record Person(String name, int age) {
    }
}
