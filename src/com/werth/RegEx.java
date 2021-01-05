package com.werth;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    // TODO: 1/3/21 Using Pattern & Matcher
    public static String[] removeOddStrings(String[] strings) {
        String pattern = "c[o0][o0]kies";
        Pattern pat = Pattern.compile(pattern);

        for (int i = 0; i < strings.length; i++) {
            Matcher matcher = pat.matcher(strings[i]);
            if (matcher.find()) strings[i] = "cookies";
        }
        return strings;
    }
    
    public static void main(String[] args) {
        String[] strings = {"co0kies", "c00kies", "c0okies"};
        System.out.println(Arrays.toString(removeOddStrings(strings)));

        // TODO: 1/3/21 Using ReplaceAll() 
        String data = "000 Hi^My@Na!me I%s M!att";
        
        String data2 = data.replaceAll("[^a-zA-Z]", "");
        System.out.println(data2);

        String data3 = data.replaceAll("\\W", "");
        System.out.println(data3);

        // TODO: 1/5/21 Split

        String str = "this is a string";
        String[] split = str.split(" ");
        System.out.println(Arrays.toString(split));
    }
}
