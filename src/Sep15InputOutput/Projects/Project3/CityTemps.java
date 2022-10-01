package Sep15InputOutput.Projects.Project3;

/**
 Reads a file of month names and average temperatures in Celsius,
 and writes a file containing month names and average temperatures
 in Celsius.
 */

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class CityTemps
{
    public static void main(String[] args)
            throws FileNotFoundException
    {
        String inputFileName = "src/Sep15InputOutput/Projects/Project3/celsius.txt";
        String outputFileName = "fahrenheit.txt";

        // TODO: Open the input and output files.
        // Read records from the input file.
        // Calculate the temperature in Fahrenheit.
        // Write each line to the output file with the temperature
        // in Fahrenheit.

        Scanner fileInput = new Scanner(new FileReader(inputFileName));
        PrintWriter fileOutput = new PrintWriter(outputFileName);

        while (fileInput.hasNext())
        {
            String month = fileInput.next();
            double celsius = fileInput.nextDouble();
            double fahrenheit = celsius * 9 / 5 + 32;
            fileOutput.println(month + " " + fahrenheit);
        }
        fileInput.close();
        fileOutput.close();
    }
}
