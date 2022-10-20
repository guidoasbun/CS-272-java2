package Quiz2ExtraWork.InputOutput.ReadFromFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    // Create a method that returns the minimum value contained in the input file
    public static int minimum(String filename) throws IOException
    {
        Scanner fileInput = new Scanner(new File(filename));
        int minNumber = fileInput.nextInt();
        fileInput.nextLine();

        while(fileInput.hasNext())
        {
            int numToCompare = fileInput.nextInt();
            fileInput.nextLine();
            if (numToCompare < minNumber)
            {
                minNumber = numToCompare;
            }
        }
        fileInput.close();

        return minNumber;
    }

    // Create a method that returns the maximum value contained in the input file
    public static int maximum(String filename) throws IOException
    {
        Scanner fileInput = new Scanner(new File(filename));
        int maxNumber = fileInput.nextInt();
        fileInput.nextLine();

        while(fileInput.hasNext())
        {
            int numToCompare = fileInput.nextInt();
            fileInput.nextLine();
            if(numToCompare > maxNumber)
            {
                maxNumber = numToCompare;
            }
        }
        fileInput.close();

        return maxNumber;
    }

    // Create a method that returns the number of times that the search value appears in the input file
    public static int occurances(int searchValue, String filename) throws IOException
    {
        Scanner fileInput = new Scanner(new File(filename));
        int numOfTimes = 0;

        while(fileInput.hasNext())
        {
            int numToCompare = fileInput.nextInt();
            fileInput.nextLine();

            if(numToCompare == searchValue)
            {
                numOfTimes++;
            }
        }
        fileInput.close();

        return numOfTimes;
    }
}
