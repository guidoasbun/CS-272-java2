package Oct4Lists.Projects.Project3;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUtil
{
    /**
     Add s1 as a new first element and s2 as a new last element
     of the linked list.
     */
    public static void processList(LinkedList<String> list, String s1, String s2)
    {
        list.addFirst(s1);
        list.addLast(s2);
    }

    // this method is used to check your work
    public static LinkedList<String> check(String[] values, String s1, String s2)
    {
        LinkedList<String> list = new LinkedList<String>();
        for (String s : values)
            list.addLast(s);

        processList(list, s1, s2);
        return list;
    }
}