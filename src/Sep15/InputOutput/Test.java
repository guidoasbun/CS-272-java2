package Sep15.InputOutput;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws IOException {
        // CONSTANT DECLARATION AND INITIALIZATION
        final String INPUT_FILE = "src/Sep15/InputOutput/Open.txt";
        final String OUTPUT_FILE = "src/Sep15/InputOutput/Save.txt";

        // VARIABLE DECLARATION
        int buildingFloors;
        double constructionPrice;
        String stateAbbreviation;
        String constructionCompany;

        // OBJECT CREATION
        Scanner fileInput = new Scanner(new File(INPUT_FILE));
        PrintWriter fileWriter = new PrintWriter(OUTPUT_FILE);

        // SOLUTION
        buildingFloors = fileInput.nextInt();
        fileInput.nextLine();
        constructionPrice = fileInput.nextDouble();
        fileInput.nextLine();
        stateAbbreviation = fileInput.next();
        fileInput.nextLine();
        stateAbbreviation = fileInput.nextLine();
        fileInput.close();

        fileWriter.println("Output text, variables, constants, ...");
        fileWriter.printf("Formatted output of text, variables, constants, ...");
        fileWriter.print("Output text, variables, constants, ...");
        fileWriter.close();
    }
}
