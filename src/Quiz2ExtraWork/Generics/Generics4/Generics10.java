package Quiz2ExtraWork.Generics.Generics4;

import java.util.ArrayList;

// Create a method that return the largest element in an ArrayList
public class Generics10 {
    public static <E extends Comparable<E>> E max(ArrayList<E> list)
    {
        E max = list.get(0);
        for (E e : list)
        {
            if (e.compareTo(max) > 0)
            {
                max = e;
            }
        }
        return max;
    }
}
