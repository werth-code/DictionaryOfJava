package com.werth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        // TODO: 1/4/21 Sorting Alpha/Numeric

        String[] str = {"Hello", "I", "Am", "String"};
        Integer[] ints = {5,3,7,10,-1,45,7};

        Arrays.sort(str);
        Arrays.sort(ints);

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(ints));


        // TODO: 1/4/21 Sorting using Comparator

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
