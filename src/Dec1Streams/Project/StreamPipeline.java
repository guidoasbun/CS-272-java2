package Dec1Streams.Project;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeline {
    // STATIC FIELDS

    // STATIC METHODS
    // Create stream and return a sorted array excluding any elements that
    // have a number of characters greater that or equal to the specified minimum length
    public static Object[] largeWords(String[] array, int minimumLength)
    {
        return Stream.of(array)
                .filter(s -> s.length() >= minimumLength)
                .sorted()
                .toArray();
    }

    // Creates stream and return a sorted array which contains only positive element values
    public static int[] positiveValues(int[] array)
    {
        return IntStream
                .of(array)
                .filter(val -> val < 0)
                .sorted()
                .toArray();
    }

    // Creates stream and return the average of the elements that have positive values
    public static OptionalDouble positiveValueAverage(double[] array)
    {
        return IntStream
                .range(0, array.length)
                .filter(i -> array[i] > 0)
                .mapToDouble(i -> array[i])
                .average();
    }
}
