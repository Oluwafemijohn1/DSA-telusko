package com.ephemzy.tree;

public class TreeMain {
    public static void main(String[] args) {
        BinarySearch tree = new BinarySearch();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);


        tree.postOrder();
    }
}
