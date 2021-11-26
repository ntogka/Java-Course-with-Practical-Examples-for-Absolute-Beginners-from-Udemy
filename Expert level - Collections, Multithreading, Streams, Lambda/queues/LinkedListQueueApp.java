package expert.queues;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueApp {

    public static void main(String[] args) {

        Queue<Integer> bankQueueNumber = new LinkedList<>();

        bankQueueNumber.add(30);
        bankQueueNumber.offer(31);
        bankQueueNumber.offer(32);
        bankQueueNumber.offer(33);
        bankQueueNumber.offer(34);
        System.out.println(bankQueueNumber);

        System.out.println("The first costumer in the queue has the number: " + bankQueueNumber.element());

        System.out.println("Customer with number " + bankQueueNumber.remove() + " is called.");
        System.out.println(bankQueueNumber);

        System.out.println("Customer with number " + bankQueueNumber.poll() + " is called.");
        System.out.println(bankQueueNumber);

        bankQueueNumber.remove(33);
        System.out.println("Customer with number 33 is removed from the queue.");
        System.out.println(bankQueueNumber);


    }

}
