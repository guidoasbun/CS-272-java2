package Oct27SortingAlgorithms.LabActivitySortingAlgorithms;

// Programmer: Guido Asbun
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sort {
    // Methods
    public static String[] Selection(String filename) throws IOException {
        // Variable Creation
        Scanner fileInput = new Scanner(new File(filename));
        int numberOfWordsInFile = fileInput.nextInt();

        System.out.println(numberOfWordsInFile);

        if(numberOfWordsInFile <= 0) {
            throw new IllegalArgumentException("Can not create array using 0 words");
        }
        else {
            fileInput.nextLine();
            String[] array = new String[numberOfWordsInFile];

            // While Loop to enter all words in file into array
            while (fileInput.hasNext()) {
                for (int i = 0; i < numberOfWordsInFile; i++) {
                    array[i] = fileInput.nextLine();
                }
            }
            fileInput.close();

            // Selection Sort Algorithm
            // Selection Sort Variables
            int minimumPosition;
            String swapStorage;

            for (int currentPosition = 0; currentPosition < array.length - 1; currentPosition++) {
                minimumPosition = currentPosition;
                for (int index = currentPosition + 1; index < array.length; index++) {
                    if (array[index].compareToIgnoreCase(array[minimumPosition]) < 0) {
                        minimumPosition = index;
                    }
                }
                swapStorage = array[minimumPosition];
                array[minimumPosition] = array[currentPosition];
                array[currentPosition] = swapStorage;
            }

            return array;
        }
    }
}
