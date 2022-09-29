package Sep29Generics.ConceptCheckInClass;

import org.w3c.dom.ls.LSOutput;

public class ConceptCheckGenerics
{
    public static void main(String[] args)
    {
        final int PARING_LOTS = 5;

        int countResult;
        Integer searchValue;

        Integer[] parkingSpaces = new Integer[PARING_LOTS];

        parkingSpaces[0] = 100;
        parkingSpaces[1] = 200;
        parkingSpaces[2] = 400;
        parkingSpaces[3] = 300;
        parkingSpaces[4] = 100;

        searchValue = 400;

        countResult = GenericArrayMethod.count(parkingSpaces, searchValue);
        System.out.println("We have " + countResult + " parking lot(s) that has " + searchValue + "spaces");
    }
}
