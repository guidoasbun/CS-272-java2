package Oct4Lists.Projects.Project4;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUtil
{
    /**
     Adds an element to the front and another to the back of a linked list.
     @param list a linked list
     @param front the element to add to the front
     @param back the element to add to the back
     */
    public static void processList(LinkedList<String> list, String front, String back)
    {
        // Your work here
        list.addFirst(front);
        list.addLast(back);
    }

    // This method is used to check your work
    public static LinkedList<String> check(String[] values, String s1, String s2)
    {
        LinkedList<String> list = new LinkedList<String>();
        for (String s : values) list.addLast(s);

        processList(list, s1, s2);
        return list;
    }
}