package Sep15.ParticipationActivity;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ParticipationActivity
{
    public static void main(String[] args) throws IOException
    {
        // CONSTANT DECLARATION AND INITIALIZATION
        final String INPUT_FILE = "src/Sep15/ParticipationActivity/PurchaseOrder.txt";
        final String OUTPUT_FILE = "src/Sep15/ParticipationActivity/OrderAccounting.txt";

        // VARIABLE DECLARATION
        String productDescription;
        int quantity;
        double unitPrice; // $
        String vendor;
        double total; // $

        // OBJECT CREATION
        Scanner fileInput = new Scanner( new File(INPUT_FILE) );
        PrintWriter fileWriter = new PrintWriter(OUTPUT_FILE);

        // SOLUTION
        productDescription = fileInput.nextLine();
        quantity = fileInput.nextInt();
        fileInput.nextLine();
        unitPrice = fileInput.nextDouble();
        fileInput.nextLine();
        vendor = fileInput.nextLine();

        fileInput.close();

        // Add Java Code Segment Here
        fileWriter.println("Vendor: " + vendor);
        fileWriter.println("Product Description: " + productDescription);
        fileWriter.print("Unit Price: ");
        fileWriter.printf("%15s %2.2f %n", "$",unitPrice);
        total = quantity * unitPrice;
        fileWriter.print("Total: ");
        fileWriter.printf("%15s %2.2f %n", "$",total);

        fileWriter.close();

    }
}
