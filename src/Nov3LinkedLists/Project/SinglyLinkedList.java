package Nov3LinkedLists.Project;

public class SinglyLinkedList<E> {
    // INSTANCE VARIABLES
    private int size;
    private SinglyLinkedListNode<E> head;
    private SinglyLinkedListNode<E> tail;

    // CONSTRUCTORS
    public SinglyLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    // INSTANCE METHODS
    public void addFirst(E element) {
        SinglyLinkedListNode<E> newNode = new SinglyLinkedListNode<E>(element, head);
        head = newNode;
        size++;
        if (tail == null) // Now there is only 1 node in list
        {
            tail = newNode;
        }
    }

    public int matches(E element) {
        int count = 0;
        SinglyLinkedListNode<E> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getElement().equals(element)) {
                count++;
            }
            currentNode = currentNode.getNextNode();
        }
        return count;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}