package com.werth;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Streams {
    public static void main(String[] args) {

        // // TODO: 1/5/21 Use .get() if an optional is returned
        // // TODO: 1/2/21 Create a HashMap using Streams

        String[] arr = {"this", "is", "a", "string", "is", "a"};

        Map<String, Long> map = Arrays.stream(arr)
                .collect(Collectors.groupingBy(      //You could also add a .filter(String::length) <- Method Reference
                        word -> word,                    //Or you can call Function.identity() instead of word->word
                        Collectors.counting()
                ));
        System.out.println(map);

        // TODO: 1/4/21 Sorting Using A Comparator

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

        // .... OR ....

        strings.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        // TODO: 1/4/21 Map From String To Int MapToInt(String::length)
        
        String[] strs = {"Hello", "I", "Am", "String", "Which", "String", "is", "longest"};
        //String[] noStrs = {};

        Arrays.stream(strs)
                .sorted(compareLength)
                .mapToInt(String::length)
                .forEach(System.out::println);

        //// TODO: 1/4/21 Optionals using .get() to retrieve value - .orElse("Do something else!")

        System.out.println(Optional.of(Arrays.stream(strs)
                .max(Comparator.comparingInt(String::length))
                .orElse("Not Found"))
                .get());


        // TODO: 1/4/21 ifPresent() do something.. / findFirst() instance of something..
        Stream.of(1,2,3,4,5,6)
              .filter(e -> e > 2)
                .findFirst()
                .ifPresent(System.out::println); //If present will resolve our stream if the item is present!


        System.out.println(" --- --- --- ");

        // TODO: 1/5/21 .distinct() - limits to only one instance of the element - Strings, Integers etc.

        Integer[] integers = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6};

        Stream.of(integers)
                .distinct()
                .forEach(System.out::println);

        String[] strings1 = {"hi", "hi", "hello", "hello", "you", "you", "look", "nice"};

        Stream.of(strings1)
                .distinct()
                .forEach(System.out::println);


        System.out.println(" --- --- --- ");

        // TODO: 1/5/21 using .rangeClosed you can gain access to element at i

        List<String> strings2 = Arrays.asList(strings1);

        IntStream.rangeClosed(1, strings2.size())
                .mapToObj(i -> String.format("%d. %s", i, strings2.get(i - 1)))
                .forEach(System.out::println);


        System.out.println(" --- --- --- ");
        // TODO: 1/5/21 Stepping through with Streams, using i

        List<String> str5000 = new ArrayList<>();
        str5000.add("andy");
        str5000.add("zach");
        str5000.add("barb");
        str5000.add("ying");
        str5000.add("candice");
        str5000.add("xi");

        IntStream.iterate(0, i -> i + 1)
                .mapToObj(i -> String.format("%d. %s", i + 1, str5000.get(i)))
                .limit(str5000.size())
                .forEach(System.out::println);

        System.out.println(" --- --- --- ");
        // TODO: 1/5/21 .peek() great for debugging.

        str5000.stream()
                .peek(name -> System.out.println("=======>" + name))
                .filter(letter -> letter.startsWith("b"))
                .forEach(System.out::println);



        System.out.println(" --- --- --- ");
        // Follows Open Closed Principle - you are able to keep your variables encapsulated by passing a function -
        // instead of modifying your existing code base.

        // TODO: 1/5/21 Higher Order Functions - functions that take other functions

        ArrayList<XTree> xForest = XTreeActions.createSetOfTrees(1, 1, "Evergreen", true);
        xForest.add(new XTree(1, "Apple", false));
        xForest.add(new XTree(1, "Pear", true));
        xForest.add(new XTree(1, "Cherry", false));
        xForest.add(new XTree(1, "Chestnut", false));
        xForest.add(new XTree(1, "Cherry", true));
        xForest.add(new XTree(1, "Maple", false));
        xForest.add(new XTree(1, "Dogwood", true));


        Predicate<XTree> checkCherry = xTree -> xTree.getTreeType().equals("Cherry");
        Predicate<XTree> checkHealth = xTree -> xTree.getTreeInGoodHealth().equals(true);

        XTree cherry = xForest.stream()
                .filter(checkCherry.and(checkHealth))
                .findFirst()
                .orElseThrow(NullPointerException::new);

        functionTest(cherry, checkCherry);
        functionTest(cherry, checkCherry.and(checkHealth));
    }

    public static void functionTest(XTree xTree, Predicate<XTree> checker) {
        if(checker.test(xTree)) {
            System.out.println(xTree.returnAllTreeInfo());
        }
    }

}
