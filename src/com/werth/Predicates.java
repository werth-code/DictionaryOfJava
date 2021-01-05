package com.werth;

import java.util.ArrayList;
import java.util.function.Predicate;
import static com.werth.Streams.functionTest; //Our functionTest() is from Streams!

public class Predicates {
    public static void main(String[] args) {
        // TODO: 1/5/21 Higher Order Functions - functions that take other functions

        XTree xTreex = new XTree(1, "Evergreen", true);
        Predicate<XTree> check = xTree1 -> xTreex.getTreeInGoodHealth();
        functionTest(xTreex, check);     // --> From Streams


        ArrayList<XTree> xForest = XTreeActions.createSetOfTrees(1, 1, "Evergreen", true);
        xForest.add(new XTree(1, "Apple", false));
        xForest.add(new XTree(1, "Pear", true));
        xForest.add(new XTree(1, "Cherry", false));
        xForest.add(new XTree(1, "Chestnut", false));
        xForest.add(new XTree(1, "Cherry", true));
        xForest.add(new XTree(1, "Maple", false));
        xForest.add(new XTree(1, "Dogwood", true));


        // Create reusable predicates to pass into Predicate accepting functions.
        Predicate<XTree> checkCherry = xTree -> xTree.getTreeType().equals("Cherry");
        Predicate<XTree> checkHealth = xTree -> xTree.getTreeInGoodHealth().equals(true);

        XTree cherry = xForest.stream()
                .filter(checkCherry.and(checkHealth)) // We can chain Predicate functions
                .findFirst()
                .orElseThrow(NullPointerException::new); // Throw an exception with streams!

        functionTest(cherry, checkCherry);
        functionTest(cherry, checkCherry.and(checkHealth)); // We can also chain Predicates here

    }
}
