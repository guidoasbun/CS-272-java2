package Projects.Inheritance.Part1;

/**
 Represents a vehicle of any type.
 */

public class Vehicle
{
    private double value;
    private double mileage;

    public Vehicle(double aValue)
    {
        value = aValue;
        mileage = 0;
    }

    public void move(double milesMoved)
    {
        mileage = mileage + milesMoved;
    }

    public double getValue()
    {
        return value;
    }

    public double getMileage()
    {
        return mileage;
    }
}
