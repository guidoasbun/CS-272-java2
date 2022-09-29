package Sep20ExceptionHndling.ConceptCheckExceptions;

import java.io.IOException;

public class ConceptCheckCatchingExceptions
{
    public static void main(String[] args)
    {
        try
        {
            ConceptCheckThrowingExceptions.writeDataToFile("OutputFile.txt", "Java Programming CS 272");
        }
        catch (IOException exception)
        {
            System.out.println("Catching the runtime error that occurred");
        }

        try
        {
            ConceptCheckThrowingExceptions.checkFileType("inputFile.txt");
        }
        catch(IllegalArgumentException exception)
        {
            System.out.println(exception.toString());
        }
    }
}
