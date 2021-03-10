package com.werth;

public class CommaOperator {

    public static void main(String[] args) {

        String[] strings = {"String", "Something", "Another Thing"};

        for (int i = 1, j = i-1; i < strings.length; i++) {
            System.out.println("i = " + i + " j = " + j);
        }

    }
}
