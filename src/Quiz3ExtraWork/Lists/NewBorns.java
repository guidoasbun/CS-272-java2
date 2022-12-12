package Quiz3ExtraWork.Lists;

// Class File

// UML Diagram
//
// ===============================================================
//                            NewBorns
// ===============================================================
// - babyName: ArrayList
// ===============================================================
// + NewBorns(filename: String)
//
// + newBaby(newBornBabyName: sString): int
// + retrieveBabyName(index: int): String
// + correctBabyName(correctedBabyName: String, index: int): void
// + searchBabyNames(babyNameToSearchFor: String): boolean
// ===============================================================

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NewBorns {
    // Instance Variables
    private ArrayList<String> babyName;

    // CONSTRUCTORS
    // Overloaded constructor takes all the names from the specified
    //    filename and stores them in an array list.  Text file
    //    has one name per line.
    public NewBorns(String filename) throws IOException {
        babyName = new ArrayList<String>();
        Scanner inputFile = new Scanner(new File(filename));
        while (inputFile.hasNext()) {
            babyName.add(inputFile.nextLine());
        }
        inputFile.close();
    }

    // INSTANCE METHODS
    // Method New Baby updates the array list to include to the
    //    New Born Baby Name.
    //    Returns the number of elements in the array list
    public int newBaby(String newBabyBornName){
        babyName.add(newBabyBornName);
        return babyName.size();
    }

    // Method Retrieve Baby Name returns the value associated with that
    //    index position.
    //    If appropriate throw an IllegalArguementException with the
    //    message "Method Retrieve Baby Name"
    public String retrieveBabyName(int index) {
        if (babyName.size() == 0 || index < 0 || index >= babyName.size()) {
            throw new IllegalArgumentException("Method Retrieve Baby Name");
        } else {
            return babyName.get(index);
        }
    }

    // Method Correct Baby Name modifies the array list element at the
    //    specified index poistion.
    //    If appropriate throw an IllegalArguementException with the
    //    message "Method Correct Baby Name"
    public void correctBabyName(String correctedBabyName, int index) {
        if (babyName.size() == 0 || index < 0 || index >= babyName.size()) {
            throw new IllegalArgumentException("Method Correct Baby Name");
        } else {
            babyName.set(index, correctedBabyName);
        }
    }

    // Method Search Baby Names returns true if the baby name to search
    //    for is in the array list or false if it is not
    public boolean searchBabyNames(String babyNameToSearchFor) {
        return babyName.contains(babyNameToSearchFor);
    }


}
