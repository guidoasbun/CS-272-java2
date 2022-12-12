package Quiz3ExtraWork.Lists;

// Class File

// UML Diagram
//
// ===============================================================
//                            NewBorns
// ===============================================================
// - babyName: LinkedList
// ===============================================================
// + NewBorns(filename: String)
//
// + newBaby(newBornBabyName: sString): int
// + retrieveLastBabyName(): String
// + displayBabyNames(): void
// + searchBabyNames(babyNameToSearchFor: String): boolean
// ===============================================================


import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class NewBorns2 {
    // Instance Variables
    private LinkedList<String> babyName;

    // Constructors
    public NewBorns2(String filename) throws IOException {
        babyName = new LinkedList<>();
        Scanner fileInput = new Scanner(new File(filename));
        while (fileInput.hasNext()) {
            babyName.add(fileInput.nextLine());
        }
        fileInput.close();
    }

    // Instance Methods
    public int newBaby(String newBornBabyName) {
        babyName.addLast(newBornBabyName);
        return babyName.size();
    }

    public String retrieveLastBabyName() {
        return babyName.getLast();
    }

    public void displayBabyNames() {
        for (String elem: babyName) {
            System.out.print(elem + ", ");
        }
    }

    public boolean searchBabyNames(String babyNameToSearchFor) {
        return babyName.contains(babyNameToSearchFor);
    }
}
