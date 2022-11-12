package Nov1ImplementingArrayLists.Project;

public class DynamicArray<E> {
    // INSTANCE VARIABLES
    final int INITIAL_SIZE = 8;
    int numberOfElements;
    E[] array;

    // CONSTRUCTORS
    public DynamicArray() {
        numberOfElements = 0;
        array = (E[]) new Object[INITIAL_SIZE];
    }

    // INSTANCE METHODS
    public void addToEnd(E element) {
        if (array.length == 0) // If the array has 0 elements then create a default size array
        {
            E[] largerArray = (E[]) new Object[INITIAL_SIZE];
            array = largerArray;
        } else if (numberOfElements == array.length) // Double the array capacity if the array is full
        {
            // Create a new array that is twice
            E[] largerArray = (E[]) new Object[2 * array.length];

            // Copy array elements
            for (int index = 0; index < array.length; index++) {
                largerArray[index] = array[index];
            }

            // Set the array to be the new array
            array = largerArray;
        }
        // Add the element to the array
        array[numberOfElements] = element;
        numberOfElements++;
    }

    // Standard Getter Method
    public int getNumberOfElements() {
        return numberOfElements;
    }

    // Removes all of the elements from the list
    public void clear() {
        numberOfElements = 0;
        array = (E[]) new Object[INITIAL_SIZE];
    }

    // Returns the number of elements in the array that have the specific search value.
    public int matches(E searchValue) {
        int numberOfMatches = 0;
        for (int index = 0; index < numberOfElements; index++) {
            if (array[index].equals(searchValue)) {
                numberOfMatches++;
            }
        }
        return numberOfMatches;
    }

    // Returns true if the array is empty or false if it is not
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

}
