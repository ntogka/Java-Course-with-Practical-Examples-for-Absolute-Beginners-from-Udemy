package expert.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueApp {

    public static void main(String[] args) {

        Queue<Integer> bankQueueNumber = new PriorityQueue<>();

        //de dexetai null
        bankQueueNumber.add(34);
        bankQueueNumber.offer(32);
        bankQueueNumber.offer(31);
        bankQueueNumber.offer(33);
        bankQueueNumber.offer(30);
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
