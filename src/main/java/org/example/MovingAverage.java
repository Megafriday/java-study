package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MovingAverage {
    public static void main(String[] args) {
        int[] data = {3, 6, 9, 4, 2, 1, 5};
        IntStream.Builder result = IntStream.builder();

        for (int i = 0; i < data.length - 2; i++) {
            int sum = IntStream.of(data)
                    .skip(i)
                    .limit(3)
                    .sum();
            result.add(sum / 3);
        }

        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(result.build().toArray()));

    }
}
