package Sep13.TwoDimensionalShape;

public class Square extends TwoDimensionalShape implements Comparable<Square> {
    // Instance Variables
    private double length;

    public Square(double length, String units) {
        super(units);
        this.length = length;
    }

    @Override
    public double area()
    {
        return Math.pow(length, 2);
    }

    @Override
    public int compareTo(Square object)
    {
        // Convert to a common length or area
        // This would work if the units are the same

        if (this.area() == object.area())
            return 0;
        else if (this.area() > object.area())
            return 1;
        else // this.area() < object.area()
            return -1;
    }
}
