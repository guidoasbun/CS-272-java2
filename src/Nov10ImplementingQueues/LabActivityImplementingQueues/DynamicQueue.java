package Nov10ImplementingQueues.LabActivityImplementingQueues;

import Nov3LinkedLists.LabActivityImplementingLinkedLists.SinglyLinkedList;

import java.io.FileNotFoundException;

public class DynamicQueue<E> {
    // INSTANCE VARIABLES
    private SinglyLinkedList<E> queue;

    // CONSTRUCTORS
    public DynamicQueue(){
        queue = new SinglyLinkedList<E>();
    }

    public DynamicQueue(E[] array){
        queue = new SinglyLinkedList<E>();
        for (E e : array) {
            queue.addLast(e);
        }
    }

    // INSTANCE METHODS
    public void offer(E element) {
        queue.addLast(element);
    }

    public E poll(){
        return (queue.removeFirst());
    }

    public E peek(){
        return (queue.getFirst());
    }

    public int getSize() {
        return (queue.getSize());
    }

    public void saveToFile(String filename) throws FileNotFoundException {
        queue.saveToFile(filename);
    }
}
