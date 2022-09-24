package Sep22.Recursion;

import java.io.File;

public class totalFiles {
    public static int totalFiles(File directory)
    {
        int total = 0;
        File[] directoryFiles = directory.listFiles();
        for (int index = 0; index < directoryFiles.length; index++)
        {
            if (directoryFiles[index].isDirectory())
            {
                total += totalFiles(directoryFiles[index]);
            } else
            {
                if (directoryFiles[index].isHidden())
                {
                    total++; // Not a directory, therefore it is a file
                }
            }
        }
        return (total);
    }
}