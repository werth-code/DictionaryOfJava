package com.werth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayLists {
    public static void main(String[] args) {

        // TODO: 1/2/21 Creating an ArrayList<T>

        List<String> strings = new ArrayList<>();
        strings.add("HIYA");
        strings.add("Hellooooo");

        String[] str = {"Hello", "I", "Am", "String"};
        List<String> stringList = Stream.of(str)
                .collect(Collectors.toList());

        // TODO: 1/4/21 Iterating ArrayList

        stringList.forEach(System.out::println);

        System.out.println(" --- --- --- ");

        for(String string : strings) {
            System.out.println(string);
        }
    }
}
