package Sep08.ConceptCheckInheritance;
// PROGRAMMER: Guido Asbun

public class Cylinder extends GeometricSolid
{
    // INSTANCE VARIABLES
    private double radius;
    private double height;

    // CONSTRUCTORS

    // INSTANCE METHODS
    @Override
    public String getInfo()
    {
        return ("Cylinder");
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " - Cylinder";
    }
}
