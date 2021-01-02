package com.werth;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        // // TODO: 1/2/21 Create a HashMap using Streams
        //
        //      Map<String, Long> map = Arrays.stream(arr)
        //                .collect(Collectors.groupingBy)        //You could also add a .filter(String::length) <- Method Reference
        //                        word->word,                    //Or you can call Function.identity() instead of word->word
        //                        Collectors.counting()
        //                ));


        String[] arr = {"this", "is", "a", "string", "is", "a"};
        Map<String, Long> map = Arrays.stream(arr)
                .collect(Collectors.groupingBy(      //You could also add a .filter(String::length) <- Method Reference
                        word -> word,                    //Or you can call Function.identity() instead of word->word
                        Collectors.counting()
                ));
        System.out.println(map);
    }
}
