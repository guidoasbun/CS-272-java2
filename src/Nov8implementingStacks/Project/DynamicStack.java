package Nov8implementingStacks.Project;

import Nov1ImplementingArrayLists.LabActivityImplementingArrayLists.DynamicArray;

public class DynamicStack<E> {
    // INSTANCE VARIABLES
    DynamicArray<E> stack;

    // CONSTRUCTORS
    public DynamicStack() {
        stack = new DynamicArray<E>();
    }

    public DynamicStack(E element) {
        stack = new DynamicArray<E>();
        stack.addToEnd(element);
    }

    public DynamicStack(E[] array) {
        stack = new DynamicArray<E>();
        for (E element : array) {
            stack.addToEnd(element);
        }
    }

    // INSTANCE METHODS
    public void push(E element) {
        stack.addToEnd(element);
    }

    public E pop() {

        if (stack.getNumberOfElements() == 0) {
            throw new RuntimeException("Empty Stack");
        }
        return (stack.remove(stack.getNumberOfElements() - 1));
    }

    public E peek() {


        if (stack.getNumberOfElements() == 0) {
            throw new RuntimeException("Empty Stack");
        }
        return (stack.get(stack.getNumberOfElements() - 1));
    }

    public boolean empty() {
        if (stack.getNumberOfElements() == 0) {
            return (true);
        } else {
            return (false);
        }
    }
}
