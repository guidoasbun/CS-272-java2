package Sep29Generics.LabActivityGenerics;

import java.util.Arrays;

public class ArrayMethod
{
    public static <T> void display(String description, T[] array)
    {
        System.out.println(description);
        for (T t : array)
        {
            System.out.println(t);
        }
    }

    public static <T> void initialize(T value, T[] array)
    {
        Arrays.fill(array, value);
    }
}
