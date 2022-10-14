package Oct4Lists.Projects.Project1;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUtil
{
    /**
     deletes all but the first two linked list entries
     */
    public static void processList(ListIterator iter)
    {
        // Your work here
        int count = 0;
        while (iter.hasNext())
        {
            iter.next();
            count++;
            if (count > 2)
            {
                iter.remove();
            }
        }
    }


    // This method is used to check your work
    public static LinkedList<String> check(String[] values)
    {
        LinkedList<String> list = new LinkedList<String>();
        for (String s : values) list.add(s);

        processList(list.listIterator());

        return list;
    }

}