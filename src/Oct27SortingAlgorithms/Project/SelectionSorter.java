package Oct27SortingAlgorithms.Project;

/**
 Your task is to modify the selection sort algorithm so that you find the largest element and
 swap it to the last position, then continue with the next-largest element and so on.
 */
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
        int maxIndex = 0;
        for (int i = 1; i <= to; i++)
        {
            if (array[i] > array[maxIndex])
            {
                maxIndex = i;
            }
        }
        return maxIndex;
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
