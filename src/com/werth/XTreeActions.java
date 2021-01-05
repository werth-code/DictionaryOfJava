package com.werth;

import java.util.ArrayList;

public interface XTreeActions {

        static ArrayList<XTree> createSetOfTrees(Integer numberOfTrees, Integer treeAge, String treeType, Boolean inGoodHealth)  {
            if (numberOfTrees <= 0) return null;
            ArrayList<XTree> trees = new ArrayList<>();
            for(int i = 0; i < numberOfTrees; i++) {
                XTree tree = new XTree(treeAge, treeType, inGoodHealth);
                trees.add(tree);
            }
            return trees;
        }
}