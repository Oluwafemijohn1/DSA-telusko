package com.ephemzy.linkedlist;

public class RunnerClass {
    /**
     * Benefit if Linked list:
     * Linked list is expandable
     * It can be reduced in size
     * <p>
     * Drawbacks:
     * It is slow
     * Has O(n) for searching
     * <p>
     *
     * Benefit of array:
     * We can fetch an item randomly
     * <p>
     * */
    public static void main(String[] args) {
        // Java implementations
//        LinkedList<Object> list = new java.util.LinkedList<>();
//        list.add(4);
//        list.add(1, 12);
//
//        System.out.println(list);


        // Custom implementations

        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(12);
        list.insert(18);
        list.insertAt(0, 55);
        list.insertAtTheStart(35);
        list.show();

    }
}
