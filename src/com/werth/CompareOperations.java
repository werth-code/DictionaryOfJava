package com.werth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareOperations {
    public static void main(String[] args) {
        // TODO: 1/4/21 Comparator For String Length
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


        // TODO: 1/4/21 Using Comparable Interface @Override on ZComparablePerson
        // Here we have altered the compareTo method to sort by age. We could also do weight or name.length...

        ZComparablePerson matt = new ZComparablePerson("Matt", 33, 195.0);
        ZComparablePerson ally = new ZComparablePerson("Ally", 25, 136.1);
        ZComparablePerson amanda = new ZComparablePerson("Amanda", 31, 144.3);

        List<ZComparablePerson> people = new ArrayList<>();
        people.add(matt);
        people.add(amanda);
        people.add(ally);

        people.stream()
                .sorted((per1, per2) -> per1.compareTo(per2))
                .forEach(per -> System.out.println(per.getName()));

    }
}
