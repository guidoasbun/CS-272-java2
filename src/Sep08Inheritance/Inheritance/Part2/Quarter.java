package Sep08Inheritance.Inheritance.Part2;

/**
 A quarter with a state theme.
 */
public class Quarter extends Coin
{
    // your work here
    private final String state;
    /**
     Constructs a quarter.
     @param aValue the monetary value of the quarter.
     @param aName the name of the quarter
     */
    public Quarter(String aState)
    {
        // your work here
        super(0.25, "Quarter");
        state = aState;
    }

    @Override
    public String getDescription()
    {
        // your work here
        return super.getDescription() + ", state=" + state;
    }
}