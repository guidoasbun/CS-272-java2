package Sep29Generics.Projects.Project2;

import java.util.ArrayList;

public class ArrayOps
{
    /**
     This method goes through the array of integers identified by
     the only parameter, creating a new ArrayList from the array,
     but in reverse order.
     @param theArray, an array of integers
     @return reversedArr, the new ArrayList of Integers

     */
    public static ArrayList copyReverse(int[] anArray)
    {
        ArrayList<Integer> reversedArr = new ArrayList<Integer>();

        for (int i = anArray.length - 1; i >= 0; i--)
        {
            reversedArr.add(anArray[i]);
        }

        return reversedArr;
    }
}
