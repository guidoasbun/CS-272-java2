package Sep20.LabActivityExceptionHandling;

// Programmer Guido Asbun

import java.io.IOException;
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
        {
            if(radius < 0)
            {
                throw new IllegalArgumentException("Radius is negative");
            }
            if(radius == 0)
            {
                throw new IllegalArgumentException("Radius is zero");
            }
            this.radius = radius;
        }
    }

    public void setUnits(String units)
    {
        if(Objects.equals(units, ""))
        {
            throw new IllegalArgumentException("Invalid units");
        }
        this.units = units;
    }

    public void userInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double inputRadius = (input.nextDouble());

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
        String inputUnits = (input.next());

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
        String outputFileName = (input.next());

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

    public void saveFile(String fileName, double radius, String units) throws IOException
    {

        if(!fileName.endsWith(".txt"))
        {
            throw new IllegalArgumentException("Invalid file type");
        }
        if(fileName.equals(""))
        {
            throw new IllegalArgumentException("Invalid file name");
        }



    }


}
