package Nov1ImplementingArrayLists.LabActivityImplementingArrayLists;

// Programmer: Guido Asbun

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DynamicArray<E> {
    // INSTANCE VARIABLES
    private final int INITIAL_SIZE = 8;
    private int numberOfElements;
    private E[] array;

    // CONSTRUCTORS
    public DynamicArray() {
        numberOfElements = 0;
        array = (E[]) new Object[INITIAL_SIZE];
    }

    // Instance Methods
    public void addToEnd(E element) {
        if(array.length == 0) {
            E[] largerArray = (E[]) new Object[INITIAL_SIZE];
            array = largerArray;
        } else if (numberOfElements == array.length) {
            E[] largerArray = (E[]) new Object[2 * numberOfElements];
            for(int i = 0; i < numberOfElements; i++) {
                largerArray[i] = array[i];
            }
            array = largerArray;
        }
        array[numberOfElements] = element;
        numberOfElements++;
    }

    public E remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("ArrayList index can not one a negative number");
        } else if (index >= numberOfElements) {
            throw new IndexOutOfBoundsException("ArrayList index exceeds the the last element index");
        }

        E removedElement = (E) array[index];

        for (; index < numberOfElements -1; index++) {
            array[index] = array[index + 1];
        }

        array[numberOfElements - 1] = null;
        numberOfElements--;
        return removedElement;
    }

    public E get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("ArrayList index can not one a negative number");
        } else if (index >= numberOfElements) {
            throw new IndexOutOfBoundsException("ArrayList index exceeds the the last element index");
        }
        return array[index];
    }

    public void set(int index, E element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("ArrayList index can not one a negative number");
        } else if (index >= numberOfElements) {
            throw new IndexOutOfBoundsException("ArrayList index exceeds the the last element index");
        }
        array[index] = element;
    }

    public int occurrences(E element) {
        int count = 0;
        for (int i = 0; i < numberOfElements; i++) {
            if (array[i].equals(element)) {
                count++;
            }
        }
        return count;
    }

    public void saveToFile(String fileName) throws FileNotFoundException {
        PrintWriter fileOutput = new PrintWriter(fileName);

        for (int i = 0; i < numberOfElements; i++) {
            fileOutput.println(array[i]);
        }

        fileOutput.close();
    }
}
