package com.werth;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        // // TODO: 1/2/21 Create a HashMap using Streams

        String[] arr = {"this", "is", "a", "string", "is", "a"};

        Map<String, Long> map = Arrays.stream(arr)
                .collect(Collectors.groupingBy(      //You could also add a .filter(String::length) <- Method Reference
                        word -> word,                    //Or you can call Function.identity() instead of word->word
                        Collectors.counting()
                ));
        System.out.println(map);

        // TODO: 1/4/21

        List<String> strings = new ArrayList<>();
        strings.add("1234567");
        strings.add("123");
        strings.add("12");
        strings.add("12345");
        strings.add("123456789");

        Comparator<String> compareLength = (l1, l2) -> l1.length() - l2.length();
        strings.stream()
                .sorted(compareLength)
                .forEach(System.out::println);

        // TODO: 1/4/21
        String[] strs = {"Hello", "I", "Am", "String", "Which", "String", "is", "longest"};
        Arrays.stream(strs)
                .sorted(compareLength)
                .mapToInt(String::length)
                .forEach(System.out::println);
    }
}
