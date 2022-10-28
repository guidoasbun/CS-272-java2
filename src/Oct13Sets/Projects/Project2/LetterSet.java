package Oct13Sets.Projects.Project2;

import java.util.Set;
import java.util.TreeSet;

public class LetterSet
{
    public Set<String> makeLetterSet(String str)
    {
        // TODO: Complete method
        Set<String> set = new TreeSet<String>();
        for (int index = 0; index < str.length(); index++)
        {
            set.add(str.substring(index, index + 1));
        }
        return set;
    }
}