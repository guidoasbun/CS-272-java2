package Oct11Queues.Projects;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class InputBuffer {
    // INSTANCE VARIABLES
    Queue<String> buffer = new LinkedList<String>();

    // CONSTRUCTORS
    public InputBuffer() {

    }

    public InputBuffer(String[] array) {
        Collections.addAll(buffer, array);
    }

    // INSTANCE METHODS

    public void addToBuffer(String[] text) {
        Collections.addAll(buffer, text);
    }

    // Create a Remove From Buffer method that recieves an integer
    // Number of Lines, retrieves Number Of Lines Strings from the Buffer,
    // then returns a String array that contains the information retrieved
    // from the Buffer.

    public String[] removeFromBuffer(int numOfLines) {
        String[] removedLines = new String[numOfLines];
        for (int index = 0; index < numOfLines && !buffer.isEmpty(); index++) {
            removedLines[index] = buffer.remove();
        }
        return removedLines;
    }

}
