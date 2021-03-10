package com.werth;

import java.io.*;
import java.util.*;

// Suppose we have some input data describing a graph of relationships between parents and children over multiple generations. The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique positive integer identifier.
//
// For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:
//
// 1   2    4   15
//  \ /   / | \ /
//   3   5  8  9
//    \ / \     \
//     6   7    11
//
//
// Sample input/output (pseudodata):
//
// parentChildPairs = [
//     (1, 3), (2, 3), (3, 6), (5, 6), (15, 9),
//     (5, 7), (4, 5), (4, 8), (4, 9), (9, 11)
// ]
//
//
// Write a function that takes this data as input and returns two collections: one containing all individuals with zero known parents, and one containing all individuals with exactly one known parent.
//
//
// Output may be in any order:
//
// findNodesWithZeroAndOneParents(parentChildPairs) => [
//   [1, 2, 4, 15],       // Individuals with zero parents
//   [5, 7, 8, 11]        // Individuals with exactly one parent
// ]
//
// n: number of pairs in the input

// taking in 2d array
// always a parent as first elements, child as second elements
// if they have a parent they will appear as second elements
// return 2d array of [ [no parents], [parents] ]

// map[3]: [1,2] [6]: [3, 5] [9]: [15, 4] if key, they have a parent
// ArrayList parents = [2nd Elements]
// ArrayList noparents = [1st Elements] remove any values that are in the second from 1st array
// map[ele]  = 1
// for loop
// int ele1, int ele2

// { 3: [1, 2] , 6: [3] }

public class ParentsChildren {

    public static void main(String[] argv) {
        int[][] parentChildPairs = new int[][] {
                {1, 3}, {2, 3}, {3, 6}, {5, 6}, {15, 9}, {5, 7},
                {4, 5}, {4, 8}, {4, 9}, {9, 11}
        };

        nodeWithAndWithoutParents(parentChildPairs);

    }

    public static int[][] nodeWithAndWithoutParents(int[][] pairs) {

        List<Integer> parents = new ArrayList<>();
        List<Integer> noParents = new ArrayList<>();

        for(int i = 0; i < pairs.length; i++) {
            noParents.add(pairs[i][0]);
            parents.add(pairs[i][1]);
        }

        for(int i = 0; i < parents.size(); i++) {
            if(noParents.contains(parents.get(i))) {
                noParents.remove(i);
            }
        }

        System.out.println(parents);
        System.out.println(noParents);

        return null;
    }


}
