package com.werth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMaps {
    public static void main(String[] args) {

        //// TODO: 1/2/21 Traditional, Imperative way

        String[] listOfItems = {"this", "is", "a", "string", "is", "a"};

        Map<String, Integer> newMap = new HashMap<>();
        for (String item : listOfItems) {
            if (newMap.containsKey(item)) {
                int timesAppeared = newMap.get(item);
                newMap.put(item, ++timesAppeared);
            } else {
                newMap.put(item, 1);
            }
        }


        //// TODO: 1/2/21 Modern, Functional way
        String[] arr = {"this", "is", "a", "string", "is", "a"};

        Map<String, Long> map = Arrays.stream(arr) //Note: this way requires using a Long.
                .collect(Collectors.groupingBy(
                        word->word,
                        Collectors.counting()
                ));

        System.out.println(map);
        System.out.println(newMap);
    }
}
