package Oct18Maps.ConceptCheck;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class ConceptCheckMaps
{
    public static void main(String[] args)
    {
        // CONSTANT DECLARATION AND INITIALIZATION

        // VARIABLE DECLARATION
        String searchKey;
        String collegeLocation;

        // OBJECT CREATION
        Map<String, String> collegeUnorderedMap = new HashMap<String, String>();
        Scanner keyboardInput = new Scanner(System.in);

        // SOLUTION
        // Put Key/Value Pairs
        collegeUnorderedMap.put("Orange Coast College", "Orange");
        collegeUnorderedMap.put("Golden West College", "Orange");
        collegeUnorderedMap.put("Fresno City College", "Fresno");
        collegeUnorderedMap.put("San Diego City College", "San Diego");
        collegeUnorderedMap.put("Norco College", "Riverside");

        // Remove Map Key/Value Pairs
        collegeUnorderedMap.remove("Golden West College");

        // Keyboard Input
        System.out.print("Enter the name of the college to search for: ");
        searchKey = keyboardInput.nextLine();

        // Get Map Value
        collegeLocation = collegeUnorderedMap.get(searchKey);
        System.out.println(searchKey + " is located in " + collegeLocation + " County.");

        // Map For Each
        System.out.println("California Community College");
        collegeUnorderedMap.forEach((key, value)->
                {
                    System.out.println(key + " is located in " + value);
                }
                );
    }
}