package Oct27SortingAlgorithms.Project;

public class SelectionSorter {
    /**
     Sorts the array managed by this selection sorter.
     */
    public static void sort(int[] array)
    {
        // TODO: add loop bounds
        for (int currentPosition = array.length - 1; currentPosition > 0 ; currentPosition--)
        {
            int maximumIndex = maximumPosition(array, currentPosition);
            swap(array, maximumIndex, currentPosition);
        }
    }

    /**
     Finds the largest element in a subrange of the array.
     @param to the last position in a to compare
     @return the position of the largest element in the
     range array[0] . . . array[to]
     */
    public static int maximumPosition(int[] array, int to)
    {
        // your work here
        return 0;
    }

    /**
     Swaps two entries of the array.
     */
    private static void swap(int[] array, int maximumIndex, int currentPosition)
    {
        int temp = array[maximumIndex];
        array[maximumIndex] = array[currentPosition];
        array[currentPosition] = temp;
    }

}
