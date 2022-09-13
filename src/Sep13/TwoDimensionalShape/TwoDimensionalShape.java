package Sep13.TwoDimensionalShape;

public abstract class TwoDimensionalShape {
    // Instance Variables
    private String units;
    // Constructors
    public TwoDimensionalShape(String units) {
        this.units = units;
    }
    // Instance Methods

    // Abstract Methods
    public abstract double area();
}
