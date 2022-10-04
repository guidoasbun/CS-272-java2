package Oct4Lists.ConceptCheck;

import java.util.Iterator;
import java.util.LinkedList;

public class LessonNotesLinkedLists
{
    public static void main(String[] args)
    {
        // Objet Creation
        LinkedList<String> partyInvitationList = new LinkedList<String>();

        // Solution
        partyInvitationList.addLast("John Doe");
        partyInvitationList.addFirst("Jill Smith");
        partyInvitationList.addFirst("Jack Jones");

        System.out.println("Number of people invited to the party: " + partyInvitationList.size());
        System.out.println("Is \"Jill Doe\" on the invitation list? " + partyInvitationList.contains("Jill Doe"));
        partyInvitationList.removeFirst();

        // Option 1
        System.out.println("Party invitation List Option 1:");
        Iterator<String> iterator = partyInvitationList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // Option 2
        System.out.println("Party invitation List Option 2:");
        for (String element : partyInvitationList)
        {
            System.out.println(element);
        }
    }
}
