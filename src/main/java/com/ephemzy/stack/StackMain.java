package com.ephemzy.stack;

public class StackMain {
    /**
     * LIFO: Last in first out
     * */
    public static void main(String[] args) {

        DynamicStack stack = new DynamicStack();
        stack.push(15);
        stack.push(8);
        stack.push(8);
        stack.show();

        stack.push(8);
        stack.push(8);
        stack.push(3);
        stack.show();

        stack.push(4);
        stack.push(2);
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

        stack.pop();
        stack.show();

    }
}
