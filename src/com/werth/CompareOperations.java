package com.werth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        ZComparablePerson charles = new ZComparablePerson("Charles", 45, 212.8);

        List<ZComparablePerson> people = new ArrayList<>();
        people.add(matt);
        people.add(amanda);
        people.add(ally);
        people.add(charles);

        people.stream()
                .sorted((per1, per2) -> per1.compareTo(per2))
                .forEach(per -> System.out.println(per.getName()));

        System.out.println(" --- --- --- ");

        // TODO: 1/4/21 We could also do a Comparator here...
        // This is another easy way to do a custom compare. Just pass in type and a lambda and you can sort!

        Comparator<ZComparablePerson> perCompare = (per1, per2) -> per1.getAge() - per2.getAge();

        List<ZComparablePerson> ageSort = (List<ZComparablePerson>) people.stream()
                .sorted(perCompare)
                .collect(Collectors.toList());

        ageSort.forEach(per -> System.out.println(per.getName()));
    }
}
