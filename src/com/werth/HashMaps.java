package com.werth;

import java.util.Arrays;
import java.util.HashMap;
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
        System.out.println(" --- --- --- ");
        System.out.println(newMap);

        System.out.println(" --- --- --- ");

        // TODO: 1/3/21 Iterating Over A Map

        //ForEach
        map.forEach( (k, v) -> System.out.println("Key: " + k + " | Value: " + v));

        System.out.println(" --- --- --- ");

        //Enhanced For Loop
        for(Map.Entry<String, Long> val : map.entrySet()) {
            System.out.println("Key: " + val.getKey() + " | Value: " + val.getValue());
        }



    }
}
