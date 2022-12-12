package Dec1Streams.LabActivityStreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Pipeline {
    public int[] sort(int[] array, int numberOfSmallestElementsToRemove, int numberOfLargestElementsToRemove) {
        return IntStream
                .of(array)
                .sorted()
                .skip(numberOfSmallestElementsToRemove)
                .limit(array.length - numberOfSmallestElementsToRemove - numberOfLargestElementsToRemove)
                .toArray();
    }

    public int summation(int[] array, int numberOfSmallestElementsToRemove, int numberOfLargestElementsToRemove) {
        return IntStream
                .of(array)
                .sorted()
                .skip(numberOfSmallestElementsToRemove)
                .limit(array.length - numberOfSmallestElementsToRemove - numberOfLargestElementsToRemove)
                .sum();
    }

    public OptionalDouble average(int[] array, int numberOfSmallestElementsToRemove, int numberOfLargestElementsToRemove) {
        return IntStream
                .of(array)
                .sorted()
                .skip(numberOfSmallestElementsToRemove)
                .limit(array.length - numberOfSmallestElementsToRemove - numberOfLargestElementsToRemove)
                .average();
    }

    public int numberOfProcessors() {
        return Runtime.getRuntime().availableProcessors();
    }
}
