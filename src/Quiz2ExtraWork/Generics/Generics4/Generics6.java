package Quiz2ExtraWork.Generics.Generics4;

// Create a generic method that returns the maximum element
// contained in a two-dimensional array

public class Generics6 {
    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];
        for (E[] es : list) {
            for (E e : es) {
                if (e.compareTo(max) > 0) {
                    max = e;
                }
            }
        }
        return max;
    }
}