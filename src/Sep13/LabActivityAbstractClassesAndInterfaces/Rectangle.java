package Sep13.LabActivityAbstractClassesAndInterfaces;

// PROGRAMMER: Guido Asbun

public class Rectangle extends TwoDimensionalShape implements Comparable<Rectangle>
{
    // Instance Variables
    private double width;
    private double height;

    // Constructors
    public Rectangle()
    {
        super();
        width = 1;
        height = 1;
    }

    public Rectangle (double width, double height, String units, String lineColor, String fillColor)
    {
        super(units, lineColor, fillColor);
        this.width = width;
        this.height = height;
    }

    // Instance Methods
    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getWidth()
    {
        return width;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    @Override
    public double area()
    {
        return width * height;
    }

    @Override
    public double perimeter()
    {
        return 2 * (width + height);
    }

    // Comparable Interface Methods
    @Override
    public int compareTo(Rectangle object)
    {
        if (this.getFillColor().compareToIgnoreCase(object.getFillColor()) == 0)
            return 0;
        else if (this.getFillColor().compareToIgnoreCase(object.getFillColor()) > 0)
            return 1;
        else // this.getFillColor().compareToIgnoreCase(object.getFillColor()) < 0
            return -1;
    }
}
