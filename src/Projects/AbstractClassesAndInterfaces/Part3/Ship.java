package Projects.AbstractClassesAndInterfaces.Part3;

/**
 Represents a ship.
 */
public class Ship implements Movement
{
    private int sizeInFeet;
    private String boatName;
    private int position;

    public Ship(int size, String name)
    {
        sizeInFeet = size;
        boatName = name;
        position = 0;
    }

    /**
     Moves the ship to a new position
     @param distance incremental amount to move
     */
    public void move(int distance)
    {
        position += distance;
    }

    /**
     Returns the current position of the ship
     @return current position
     */
    public String getPosition()
    {
        return boatName +" at position " + position;
    }
}