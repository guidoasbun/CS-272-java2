package Sep15InputOutput.Projects.Project1;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Your task is to open a file, read all words in the file,
// and find the longest word in the file. If there are multiple
// words with the same length, return the first of the maximum
// length words.

public class FileAnalyzer
{
    /**
     @param inputFileName the name of the input file
     */
    public static String longestWord(String inputFileName)
            throws FileNotFoundException
    {
        // Open the file
        Scanner fileInput = new Scanner(new FileReader(inputFileName));

        // Read the file
        String longestWord = "";
        while (fileInput.hasNext())
        {
            String word = fileInput.next();
            if (word.length() > longestWord.length())
            {
                longestWord = word;
            }
        }

        return longestWord;
    }
}