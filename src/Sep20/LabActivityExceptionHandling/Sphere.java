package Sep20.LabActivityExceptionHandling;

// Programmer Guido Asbun

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class Sphere
{
    private double radius;
    private String units;

    public Sphere()
    {
        radius = 1;
        units = "millimeters";
    }

    public double getRadius() {
        return radius;
    }

    public String getUnits() {
        return units;
    }

    public void setRadius(double radius)
    {
        if(radius < 0)
        {
            throw new IllegalArgumentException("Radius is negative");
        }
        else if(radius == 0)
        {
            throw new IllegalArgumentException("Radius is zero");
        }
        else
        {
            this.radius = radius;
        }
    }

    public void setUnits(String units)
    {
        if(Objects.equals(units, ""))
        {
            throw new IllegalArgumentException("Invalid units");
        }
        else
        {
            this.units = units;
        }

    }

    public void userInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double inputRadius = (input.nextDouble());
        input.nextLine();

        try
        {
            setRadius(inputRadius);
        }
        catch (IllegalArgumentException exception)
        {
            System.out.println(exception.toString());
        }

        System.out.println("Sphere Radius Updated");
        System.out.print("Enter the units: ");
        String inputUnits = (input.nextLine());

        try
        {
            setUnits(inputUnits);
        }
        catch (IllegalArgumentException exception)
        {
            System.out.println(exception.toString());
        }

        System.out.println("Sphere Units Updated");
        System.out.print("Enter output filename: ");
        String outputFileName = (input.nextLine());

        try
        {
            saveFile(outputFileName, radius, units);
        }
        catch (IOException exception)
        {
            System.out.println(exception.toString());
        }

        System.out.println("Sphere Data Saved");
        input.close();
    }

    public static void saveFile(String fileName, double radius, String units) throws IOException
    {
        if(!fileName.endsWith(".txt"))
        {
            throw new IllegalArgumentException("Invalid file type");
        }

        if(Objects.equals(fileName, ""))
        {
            throw new IllegalArgumentException("Invalid file name");
        }

        PrintWriter fileWriter = new PrintWriter(fileName);
        fileWriter.println("Sphere");
        fileWriter.println(radius);
        fileWriter.println(units);
        fileWriter.close();
    }
}
