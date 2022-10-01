package Sep15InputOutput.Projects.Project2;

/**
 Reads a file of exam scores and calculates the average score.
 */


import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class ExamAverage
{
    public static void main(String[] args)
            throws FileNotFoundException
    {
        String inputFileName = "src/Sep15InputOutput/Projects/Project2/scores.txt";
        String outputFileName = "examScoreAverage.txt";

        // TODO: Open the input and output files.
        // Read records from the input file.
        // Calculate the average score.
        // Write each exam score, the count of scores read,
        // and the average score to the output file.

        Scanner fileInput = new Scanner(new FileReader(inputFileName));
        PrintWriter fileOutput = new PrintWriter(outputFileName);

        int count = 0;
        double total = 0;
        while (fileInput.hasNext())
        {
            double score = fileInput.nextInt();
            total = total + score;
            count++;
            fileOutput.println("Score " + count + ": " + score);
        }
        fileInput.close();

        double average = total / count;
        fileOutput.println("Number of scores read: " + count);
        fileOutput.println("Average Score: " + average);

        fileOutput.close();
    }
}
