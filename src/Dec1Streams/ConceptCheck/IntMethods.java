package Dec1Streams.ConceptCheck;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class IntMethods {
    // STATIC FIELDS

    // STATIC METHODS

    // Calculate the sum of all element values excluding the first and last element
    // Return the result of the calculation
    public static int sumExcludingFirstAndLast(int[] array)
    {
        // Add Java Code Segment Here
        return IntStream.of(array).limit(array.length - 1).skip(1).sum();
    }

    // Use parallel processing to return an array that contains sorted element values
    public static double[] sortUsingParallelProcessing(double[] array)
    {
        // Add Java Code Segment Here
        return DoubleStream.of(array).parallel().sorted().toArray();
    }



}
