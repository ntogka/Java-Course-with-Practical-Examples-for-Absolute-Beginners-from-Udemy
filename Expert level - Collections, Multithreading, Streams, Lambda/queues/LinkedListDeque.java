package expert.queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDeque {

    public static void main(String[] args) {

        Deque<Integer> bankQueueNumber = new LinkedList<>();

        bankQueueNumber.addLast(30);
        bankQueueNumber.offerLast(31);
        bankQueueNumber.addFirst(32);
        bankQueueNumber.offerFirst(33);
        bankQueueNumber.offer(34);
        System.out.println(bankQueueNumber);

        System.out.println("The first costumer in the queue has the number: " + bankQueueNumber.getFirst());

        System.out.println("Customer with number " + bankQueueNumber.removeFirst() + " is called.");
        System.out.println(bankQueueNumber);

        System.out.println("Customer with number " + bankQueueNumber.pollLast() + " is called.");
        System.out.println(bankQueueNumber);

        bankQueueNumber.remove(33);
        System.out.println("Customer with number 33 is removed from the queue.");
        System.out.println(bankQueueNumber);


    }

}
