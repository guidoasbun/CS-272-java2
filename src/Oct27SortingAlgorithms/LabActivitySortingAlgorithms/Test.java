package Oct27SortingAlgorithms.LabActivitySortingAlgorithms;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String[] array = Sort.Selection("src/Oct27SortingAlgorithms/LabActivitySortingAlgorithms/test1.txt");
        int number = 1;
        for (String s : array) {
            System.out.println(number + " - " +s);
            number++;
        }
    }
}
