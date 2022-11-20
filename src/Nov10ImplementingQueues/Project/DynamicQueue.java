package Nov10ImplementingQueues.Project;


import Nov1ImplementingArrayLists.LabActivityImplementingArrayLists.DynamicArray;

public class DynamicQueue<E> {
    // INSTANCE VARIABLES
    private DynamicArray<E> queue;

    // CONSTRUCTORS
    public DynamicQueue() // Create empty queue
    {
        queue = new DynamicArray<E>();
    }

    public DynamicQueue(E[] array) // Creates a queue that contain the elements from the array (first array element will be the first element in the queue, ... , last array element will be the last element in the queue)
    {
        queue = new DynamicArray<E>();
        for (E element : array) {
            queue.addToEnd(element);
        }
    }

    // INSTANCE METHODS
    public void offer(E element) {
        queue.addToEnd(element);
    }

    public E poll() {
        if (queue.getNumberOfElements() == 0) {
            throw new RuntimeException("Can not poll an empty queue");
        } else {
            return queue.remove(0);
        }
    }

    public E peek() {
        if (queue.getNumberOfElements() == 0) {
            throw new RuntimeException("Can not peek an empty queue");
        } else {
            return queue.get(0);
        }
    }

    public int getSize() {
        return queue.getNumberOfElements();
    }


}
