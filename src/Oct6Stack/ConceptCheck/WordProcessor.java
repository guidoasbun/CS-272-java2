package Oct6Stack.ConceptCheck;

import java.util.Stack;

public class WordProcessor
{
    public static void main(String[] args)
    {
        // Variable Declaration
        String commandRemoved;

        // Object Creation
        Stack<String> wordProcessorCommandStack = new Stack<String>();

        // Solution

        // Add Elements to the Stack
        wordProcessorCommandStack.push("Type: Java Programming");
        wordProcessorCommandStack.push("Select: All");
        wordProcessorCommandStack.push("Set color: Blue");
        wordProcessorCommandStack.push("Set style: Bold");
        wordProcessorCommandStack.push("et color: Red");

        // Remove an Element from the Stack
        commandRemoved = wordProcessorCommandStack.pop();
        System.out.println("Command that was removed: " + commandRemoved);
        System.out.println("Undo: " + wordProcessorCommandStack.pop());

        // Get Top Element from the Stack
        System.out.println("Last command executed: " + wordProcessorCommandStack.peek());

        // Is the stack empty
        System.out.println("Is the stack empty? " + wordProcessorCommandStack.empty());


    }
}
