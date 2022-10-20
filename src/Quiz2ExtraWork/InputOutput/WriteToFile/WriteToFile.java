package Quiz2ExtraWork.InputOutput.WriteToFile;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
    // Create a method outputs the negative numbers of array to a file.
    public static void negativeNumbers(int[] array, String filename) throws IOException {
        PrintWriter fileOutput = new PrintWriter(filename);

        for (int elem : array) {
            if (elem < 0) {
                fileOutput.println(elem);
            }
        }
        fileOutput.close();
    }

    // Create a method outputs the negative numbers of array to a file.
    public static void positiveNumbers(int[] array, String filename) throws IOException {
        PrintWriter fileOutput = new PrintWriter(filename);

        for (int elem : array) {
            if (elem > 0) {
                fileOutput.println(elem);
            }
        }
        fileOutput.close();
    }

    // Create a method outputs the odd numbers of array to a file.
    public static void oddNumbers(int[] array, String filename) throws IOException {
        PrintWriter fileOutput = new PrintWriter(filename);

        for (int elem : array) {
            if (!(elem % 2 == 0)) {
                fileOutput.println(elem);
            }
        }
        fileOutput.close();
    }
}
