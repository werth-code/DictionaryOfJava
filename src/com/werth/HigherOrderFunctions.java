package com.werth;

import java.util.function.Predicate;
import static com.werth.Streams.functionTest; // functionTest() from Streams!

public class HigherOrderFunctions {

    public static void main(String[] args) {
        // TODO: 1/5/21 Higher Order Functions - functions that take other functions

        XTree xTree = new XTree(1, "Evergreen", true);
        Predicate<XTree> check = xTree1 -> xTree.getTreeInGoodHealth();
        functionTest(xTree, check);     // --> From Streams
    }
}
