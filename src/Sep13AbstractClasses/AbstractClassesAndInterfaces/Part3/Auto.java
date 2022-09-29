package Sep13AbstractClasses.AbstractClassesAndInterfaces.Part3;

public class Auto implements Movement
{
    private String carModel;
    private String licensePlate;
    private int position;

    public Auto(String model, String licenseNum)
    {
        carModel = model;
        licensePlate = licenseNum;
        position = 0;
    }

    /**
     Moves the auto to a new position
     @param distance incremental amount to move
     */
    public void move(int distance)
    {
        position += distance;
    }

    /**
     Returns the current position of the auto
     @return current position
     */
    public String getPosition()
    {
        return carModel + " at position " + position;
    }
}
