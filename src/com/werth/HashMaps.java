package com.werth;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //// TODO: 1/2/21 Modern, Functional way LONG
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

        // TODO: 1/4/21 Another Way INTEGER

        String[] arr2 = {"this", "is", "a", "string", "is", "a", "nice", "very", "nice", "nice"};

        Comparator<Integer> comp = (n1, n2) -> n1 - n2;

        Map<String, Integer> anotherMap = Arrays.stream(arr2)
                .collect(Collectors.toMap(
                        str -> str, //first value
                        num -> 1,   //sec value
                        Integer::sum
                ));

        System.out.println(anotherMap);


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
