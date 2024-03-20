package com.ephemzy.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(7);
        queue.enQueue(1);
        queue.enQueue(3);
        queue.enQueue(3);
        queue.enQueue(3);
//        queue.enQueue(7);


//        queue.show();

//        queue.deQueue();
//        queue.deQueue();

//        queue.enQueue(9);
//        queue.enQueue(2);

        queue.show();

        System.out.println("Size:" + queue.getSize());
        System.out.println("Size:" + queue.isEmpty());
    }
}
