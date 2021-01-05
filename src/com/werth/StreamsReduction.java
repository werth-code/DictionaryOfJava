package com.werth;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamsReduction {
    public static void main(String[] args) {

        // TODO: 1/5/21 Use .get() if an optional is returned 

        // TODO: 1/5/21 Sum with streams 
        Integer sum = IntStream.of(1, 2, 3, 4)
                .sum();
        System.out.println(sum);

        
        // TODO: 1/5/21 Find max value with .max()
        OptionalInt min = IntStream.of(12, 3, 34, 1, 0)
                .max();
        System.out.println(min);

        // TODO: 1/5/21

    }
}
