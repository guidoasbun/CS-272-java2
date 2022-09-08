package Sep08.LabActivityInheritance;

// PROGRAMMER: Guido Asbun
public class Cylinder extends GeometricSolid{
    // INSTANCE VARIABLES
    private double radius;
    private double height;

    // CONSTRUCTORS
    public Cylinder()
    {
        radius = 1;
        height = 1;
        super.setUnits("nanometers");
        super.setMaterial("Polyethylene");
    }

    public Cylinder(double radius, double height, String units, String material, String description)
    {
        super(units, material, description);
        this.radius = radius;
        this.height = height;
    }

    // INSTANCE METHODS
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    public void setDescription(String description)
    {
        super.setDescription(description);
    }

    public String getDescription()
    {
        return super.getDescription() + " - Cylinder";
    }

    public double volume()
    {
        return height * Math.PI * Math.pow(radius, 2);
    }
}
