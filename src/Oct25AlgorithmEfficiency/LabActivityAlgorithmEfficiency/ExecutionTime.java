package Oct25AlgorithmEfficiency.LabActivityAlgorithmEfficiency;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExecutionTime {

    // Methods
    public long createOneDimensionalArray(int numberOfElements){
        if (numberOfElements < 0){
            throw new IllegalArgumentException("Can not create random double array using number of elements specified");
        }
        else {
            long startTime = System.nanoTime();

            int[] array = new int[numberOfElements];
            for (int i = 0; i < numberOfElements; i++){
                array[i] = (int) (Math.random() * 100);
            }

            long endTime = System.nanoTime();
            return endTime - startTime;
        }
    }

    public long createTwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        if (numberOfRows < 0){
            throw new IllegalArgumentException("Can not create random double array using number of rows specified");
        }
        else if (numberOfColumns < 0){
            throw new IllegalArgumentException("Can not create random double array using number of columns specified");
        }
        else {
            long startTime = System.nanoTime();

            int[][] array = new int[numberOfRows][numberOfColumns];
            for (int i = 0; i < numberOfRows; i++){
                for (int j = 0; j < numberOfColumns; j++){
                    array[i][j] = (int) (Math.random() * 100);
                }
            }

            long endTime = System.nanoTime();
            return endTime - startTime;
        }
    }

    public long createHashSet(int numberOfElements) {
        if (numberOfElements < 0){
            throw new IllegalArgumentException("Can not create random double hash set using number of elements specified");
        }
        else {
            long startTime = System.nanoTime();

            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < numberOfElements; i++){
                set.add((int) (Math.random() * 100));
            }

            long endTime = System.nanoTime();
            return endTime - startTime;
        }
    }

    public long createHashTree(int numberOfElements){
        if (numberOfElements < 0){
            throw new IllegalArgumentException("Can not create random double tree set using number of elements specified");
        }
        else {
            long startTime = System.nanoTime();

            Set<Integer> tree = new TreeSet<>();
            for (int i = 0; i < numberOfElements; i++){
                tree.add((int) (Math.random() * 100));
            }

            long endTime = System.nanoTime();
            return endTime - startTime;
        }
    }


}
