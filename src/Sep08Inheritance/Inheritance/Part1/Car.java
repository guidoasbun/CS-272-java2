package Sep08Inheritance.Inheritance.Part1;

/**
 Represents a car.
 */
public class Car extends Vehicle
{
    // Do NOT add any instance variables

    public Car(double purchasePrice)
    {
        // TODO: Complete
        super(purchasePrice);
    }

    // TODO: Override the getValue method
    @Override
    public double getValue()
    {

        double value = super.getValue();
        double mileage = super.getMileage();
        double adjustedValue = value - (mileage * 0.25);
        return adjustedValue > 0 ? adjustedValue : 0;
    }
}
