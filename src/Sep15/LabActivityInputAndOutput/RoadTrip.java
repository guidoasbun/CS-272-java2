package Sep15.LabActivityInputAndOutput;

// PROGRAMMER: Guido Asbun

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

import java.io.IOException;

public class RoadTrip
{
    public static void main(String[] args) throws IOException {
        // CONSTANT DECLARATION AND INITIALIZATION
        final String INPUT_FILE1 = "src/Sep15/LabActivityInputAndOutput/Input1.txt";
        final String INPUT_FILE2 = "src/Sep15/LabActivityInputAndOutput/Input2.txt";
        final String OUTPUT_FILE1 = "src/Sep15/LabActivityInputAndOutput/Output1.txt";
        final String OUTPUT_FILE2 = "src/Sep15/LabActivityInputAndOutput/Output2.txt";
        final String PROGRAMMER = "Guido Asbun";

        averageSpeed(INPUT_FILE1, OUTPUT_FILE1, PROGRAMMER);
        averageSpeed(INPUT_FILE2, OUTPUT_FILE2, PROGRAMMER);
    }

    public static void averageSpeed(String inputFile, String outputFile, String programmer) throws IOException
    {
        // Variable Declaration
        String carModel;
        double tripDistance;
        String distanceUnit;
        double tripTime;
        String timeUnit;
        String driverName;

        // Object Creation
        Scanner fileInput = new Scanner(new File(inputFile));
        PrintWriter fileWriter = new PrintWriter(outputFile);

        // File Input
        carModel = fileInput.nextLine();
        tripDistance = fileInput.nextDouble();
        distanceUnit = fileInput.next();
        tripTime = fileInput.nextDouble();
        timeUnit = fileInput.next();
        fileInput.nextLine();
        driverName = fileInput.nextLine();
        fileInput.close();

        // Calculations
        double averageSpeed = tripDistance / tripTime;

        // File Output
        fileWriter.println("Trip Information");
        fileWriter.println(carModel);
        fileWriter.printf("Trip Distance:%11.4f", tripDistance);
        fileWriter.println(" " + distanceUnit);
        fileWriter.printf("Trip Time:%15.4f", tripTime);
        fileWriter.println(" " + timeUnit);
        fileWriter.printf("Average Speed:%15.4f", averageSpeed);
        fileWriter.println(" " + distanceUnit + " per " + timeUnit);
        fileWriter.printf("Driver Name:%18s %n", driverName);
        fileWriter.printf("Programmer: %s %n", programmer);
        fileWriter.close();
    }
}

