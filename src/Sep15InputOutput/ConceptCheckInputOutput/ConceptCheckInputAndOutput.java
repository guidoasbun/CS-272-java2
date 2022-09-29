package Sep15InputOutput.ConceptCheckInputOutput;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ConceptCheckInputAndOutput {
    public static void main(String[] args) throws IOException
    {
        // CONSTANT DECLARATION AND INITIALIZATION
        final String INPUT_FILE = "src/Sep15/ConceptCheckInputOutput/PurchaseOrder.txt";

        // VARIABLE DECLARATION
        String productDescription;
        int quantity;
        double unitPrice; // $
        String vendor;

        // OBJECT CREATION
        Scanner fileInput = new Scanner( new File(INPUT_FILE) );

        // SOLUTION

        productDescription = fileInput.nextLine();
        quantity = fileInput.nextInt();
        fileInput.nextLine();
        unitPrice = fileInput.nextDouble();
        fileInput.nextLine();
        vendor = fileInput.nextLine();
        fileInput.close();


        // Tests
        System.out.println(productDescription);
        System.out.println(quantity);
        System.out.println(unitPrice);
        System.out.println(vendor);
    }
}
