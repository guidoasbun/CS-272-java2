package Sep29Generics.Projects.Project3;

import java.util.ArrayList;

public class ArrayOps
{
    /**
     This method goes through the array of integers identified by
     the only parameter, creating a new ArrayList from the array,
     eliminating duplicates from the original array.
     @param theArray, an array of integer
     @return uniqueIntAL, the new ArrayList

     */
    public static ArrayList copyArray(int[] anArray)
    {
        ArrayList<Integer> uniqueIntAL = new ArrayList<Integer>();

        for (int element : anArray)
        {
            if (!uniqueIntAL.contains(element))
            {
                uniqueIntAL.add(element);
            }
        }

        return uniqueIntAL;
    }
}
