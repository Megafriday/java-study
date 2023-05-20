package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LoopStudy2 {
    public static void main(String[] args) {
        var data = "abbbbccaabbccc";

        var result = Arrays.stream(data.split(""))
                .distinct()
                .collect(Collectors.joining());

        System.out.println(result);  // abc
        System.out.println("------------------------------------------------------------");

        var result2 = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            if (i > 0 && data.charAt(i - 1) == data.charAt(i)) {
                continue;
            }
            result2.append(data.charAt(i));
        }

        System.out.println(result2);    // abcabc
        System.out.println("------------------------------------------------------------");

        var result3 = new StringBuilder();
        String preValue = "";

        for (String s : data.split("")) {
            if (preValue.equals(s)) continue;
            preValue = s;
            result3.append(s);
        }

        System.out.println(result3);    // abcabc
        System.out.println("------------------------------------------------------------");
    }
}
