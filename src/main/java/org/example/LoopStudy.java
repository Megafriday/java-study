package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LoopStudy {
    public static void main(String[] args) {
        var data = "abbcccaaabccccc";

        var result = Arrays.stream(data.split(""))
                .distinct()
                .collect(Collectors.joining());

        System.out.println(data);
        System.out.println(result);

    }
}
