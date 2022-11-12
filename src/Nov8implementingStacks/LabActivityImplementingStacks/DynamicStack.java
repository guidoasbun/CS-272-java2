package Nov8implementingStacks.LabActivityImplementingStacks;

import Nov1ImplementingArrayLists.LabActivityImplementingArrayLists.DynamicArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DynamicStack<E> {
    // Instance Variables
    private DynamicArray<E> stack;

    // Constructor
    public DynamicStack() {
        stack = new DynamicArray<E>();
    }

    public DynamicStack(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));

        while (input.hasNext()) {
            stack.addToEnd((E) input.nextLine());
        }
        input.close();
    }

    // Methods
    public void push(E element) {
        stack.addToEnd(element);
    }

    public boolean empty() {
        return stack.getNumberOfElements() == 0;
    }

    public E peek() {
        System.out.println("this.empty() = " + this.empty());

        if (this.empty()) {
            throw new RuntimeException("Caused by Dynamic Stack Peek Method");
        } else {
            return stack.get(stack.getNumberOfElements() - 1);
        }
    }

    public E pop() {
        if (stack.getNumberOfElements() == 0) {
            throw new RuntimeException("Caused by Dynamic Stack Peek Method");
        } else {
            return stack.remove(stack.getNumberOfElements() - 1);
        }
    }

    public void saveToFile(String filename) throws IOException {
        PrintWriter output = new PrintWriter(filename);
        for (int index = 0; index < stack.getNumberOfElements(); index++) {
            output.println(stack.get(index));
        }
        output.close();
    }

}
