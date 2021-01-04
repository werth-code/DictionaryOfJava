package com.werth;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamsReduction {
    public static void main(String[] args) {

        Integer sum = IntStream.of(1, 2, 3, 4)
                .sum();

        System.out.println(sum);

        OptionalInt min = IntStream.of(12, 3, 34, 1, 0)
                .max();

        System.out.println(min);

    }
}
