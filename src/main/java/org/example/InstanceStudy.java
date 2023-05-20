package org.example;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InstanceStudy {
    public static void main(String[] args) {
//        var akira = new Student("akira", 80, 60);
//        System.out.println(akira.average());

//        IntStream.range(0, 3)
//                .map(i -> i * 2)
//                .forEach(i -> System.out.println(i));

        Stream.of("apple", "orange", "lemon")
                .mapToInt(i -> i.length())
                .forEach(i -> System.out.println(i));

    }

    record Student(String name, int englishScore, int mathScore) {
        int average() {
            return (englishScore() + mathScore()) / 2;
        }
    }

}
