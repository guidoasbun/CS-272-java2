package Oct4Lists.Projects.Project2;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUtil
{
    /**
     Remove all but the first two elements.
     */
    public static void processList(LinkedList<String> list)
    {
        int listLength = list.size();
        while (listLength > 2)
        {
            list.removeLast();
            listLength--;
        }
    }


    // this method is used to check your work
    public static LinkedList<String> check(String[] values)
    {
        LinkedList<String> list = new LinkedList<String>();
        for (String s : values)
            list.addLast(s);

        processList(list);
        return list;
    }
}