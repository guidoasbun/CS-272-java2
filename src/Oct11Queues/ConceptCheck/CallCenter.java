package Oct11Queues.ConceptCheck;

import java.util.LinkedList;
import java.util.Queue;

public class CallCenter {
    public static void main(String[] args)
    {
        // CONSTANT DECLARATION AND INITIALIZATION

        // VARIABLE DECLARATION
        String currentCustomer;
        String nextCustomerToBeHelped;

        // OBJECT CREATION
        Queue<String> customerNameQueue = new LinkedList<>();

        // SOLUTIONS

        // Add Elements to the Queue
        customerNameQueue.offer("James Gosling");
        customerNameQueue.offer("Dennis Richie");
        customerNameQueue.offer("Ken Thompson");

        // Remove an Element from the Queue
        currentCustomer = customerNameQueue.poll();
        System.out.println("Now assisting: " + currentCustomer);

        // Retrieve an Element from the Queue
        nextCustomerToBeHelped = customerNameQueue.peek();
        System.out.println("Next customer to be helped: " + nextCustomerToBeHelped);


    }
}
