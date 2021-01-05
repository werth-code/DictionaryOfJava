package com.werth;

import java.util.ArrayList;
import java.util.List;

public abstract class XGroupOfTrees {
    private List<XTree> trees;

    public XGroupOfTrees() {
        this.trees = new ArrayList<>();
    }

    public void addManyTress(List<XTree> trees) {
        trees.forEach(tree -> this.trees.add(tree));
    }

    public void addSingleTree(XTree tree) {
        trees.add(tree);
    }

    public void removeTree(XTree tree) {
        trees.remove(tree);
    }

    public void removeAllTrees() {
        trees.clear();
    }

    public List<XTree> getTrees() {
        return trees;
    }
}
