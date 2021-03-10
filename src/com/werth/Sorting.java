package com.werth;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        // TODO: 1/4/21 Sorting Alpha/Numeric

        String[] str = {"Hello", "I", "Am", "String"};
        Integer[] ints = {5,3,7,10,-1,45,7};

        Arrays.sort(str);
        Arrays.sort(ints);

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(ints));

        // based on a method reference to length...
        Arrays.sort(str, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(str));

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


        // TODO: 1/5/21

        ArrayList<XTree> xForest = XTreeActions.createSetOfTrees(1, 1, "Evergreen", true);
        xForest.add(new XTree(1, "Apple", true));
        xForest.add(new XTree(1, "Pear", true));
        xForest.add(new XTree(1, "Walnut", true));
        xForest.add(new XTree(1, "Chestnut", true));
        xForest.add(new XTree(1, "Cherry", true));
        xForest.add(new XTree(1, "Maple", true));
        xForest.add(new XTree(1, "Dogwood", true));

        //Here you can sort with Comparator.comparing and pass in something to sort by.
        xForest.sort(Comparator.comparing(XTree::getTreeType));
        xForest.forEach(tree-> System.out.println(tree.getTreeType()));



    }
}
