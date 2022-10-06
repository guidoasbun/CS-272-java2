package Sep29Generics.Projects.Project1;

import java.util.Arrays;

public class GenericArray
{
    /**
     @param array is a generic array
     @param value all array elements are set to this value
     */
    public static <T> void setAll(T[] array, T value)
    {
        Arrays.fill(array, value);
    }
}
