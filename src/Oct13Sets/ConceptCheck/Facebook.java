package Oct13Sets.ConceptCheck;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Facebook {
    public static void main(String[] args) {
        // CONSTANT DECLARATION AND INITIALIZATION

        // VARIABLE DECLARATION
        int numberOfAccountsFollowing;
        String searchValue;
        boolean valueFound;

        // OBJECT CREATION
        Set<String> followingAccountOrderedSet = new LinkedHashSet<String>();
        Scanner keyboardInput = new Scanner(System.in);

        // SOLUTIONS

        // Adding elements to the set
        followingAccountOrderedSet.add("@Facebook");
        followingAccountOrderedSet.add("@Blizzard");
        followingAccountOrderedSet.add("@CACommColleges");
        followingAccountOrderedSet.add("@Blizzard"); // Ignored

        // Removing an element from the set
        followingAccountOrderedSet.remove("@Blizzard");

        // Determine the Cardinality
        numberOfAccountsFollowing = followingAccountOrderedSet.size();

        // Get the Search Value
        System.out.print("Enter the account that to search for: ");
        searchValue = keyboardInput.nextLine();
        keyboardInput.close();

        // Determine if the Set Contains a Specific Value
        valueFound = followingAccountOrderedSet.contains(searchValue);

        // Display Set Elements
        System.out.println("Facebook Account Set Elements");
        for (String element : followingAccountOrderedSet) {
            System.out.println(element);
        }
    }
}
