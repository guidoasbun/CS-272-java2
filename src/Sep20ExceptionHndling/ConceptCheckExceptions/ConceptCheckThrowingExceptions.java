package Sep20ExceptionHndling.ConceptCheckExceptions;

import java.io.IOException;
import java.io.PrintWriter;

public class ConceptCheckThrowingExceptions
{
    // STATIC FIELDS

    // STATIC METHODS
    public static void writeDataToFile(String fileName, String data) throws IOException
    {
        PrintWriter outputFile = new PrintWriter(fileName);
        outputFile.println(data);
        outputFile.close();
    }

    public static void checkFileType(String filename)
    {
        // endsWith, contains, indexOf, substring,
        // if(!filename.endsWith(".java"))
        // if(!filename.contains(".java")) NOT WORK
        if(!filename.endsWith(".java"))
        {
            throw new IllegalArgumentException("The file must be a java file");
        }
    }
}
