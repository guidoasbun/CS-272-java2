package Sep29Generics.ConceptCheckInClass;

public class GenericArrayMethod
{
    // Static Fields

    // Static Methods
    public static <T> int count(T[] array, T searchValue)
    {
        int counter = 0;
        for (int index = 0; index < array.length; index++)
        {
            if(array[index].equals(searchValue))
            {
                counter++;
            }
        }
        return counter;
    }
}
