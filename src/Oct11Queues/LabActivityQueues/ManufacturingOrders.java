package Oct11Queues.LabActivityQueues;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ManufacturingOrders {
    // OBJECT CREATION
    Queue<String> manufacturingOrderQueue;

    // CONSTRUCTOR
    public ManufacturingOrders() {
        manufacturingOrderQueue = new LinkedList<>();
    }

    public ManufacturingOrders(String filename) throws IOException {
        manufacturingOrderQueue = new LinkedList<>();
        Scanner fileInput = new Scanner(new File(filename));
        while (fileInput.hasNext()) {
            String order = fileInput.nextLine();
            manufacturingOrderQueue.offer(order);
        }
        fileInput.close();
    }

    // Instance Methods
    public void newOrderPlaced(String customer) {
        if ((customer == null) || (customer.equals(""))) {
            throw new IllegalArgumentException("Invalid Order: can not add order to the manufacturing queue");
        } else {
            manufacturingOrderQueue.offer(customer);
        }
    }

    public String orderShipped() {
        if (manufacturingOrderQueue.peek() == null) {
            throw new IllegalArgumentException("Empty queue: no order was shipped");
        } else {
            return  manufacturingOrderQueue.poll() + " You oder has shipped";
        }
    }

    public String workInProgress() {
        if (manufacturingOrderQueue.peek() == null) {
            throw new IllegalArgumentException("Empty queue: no order is currently being worked on");
        } else {
            return manufacturingOrderQueue.peek();
        }
    }
}
