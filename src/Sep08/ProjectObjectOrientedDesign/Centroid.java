package Sep08.ProjectObjectOrientedDesign;
// PROGRAMMER: John Doe

/*
 * Instructions: Correct all of the errors in the code.
 */
public class Centroid {
    // INSTANCE VARIABLES
    private double xPosition;
    private double yPosition;
    private double zPosition;
    private String units;

    // CONSTRUCTORS
    public Centroid()
    {
        xPosition = 0;
        yPosition = 0;
        zPosition = 0;
        units = "mm";
    }

    public Centroid(String units) {
        xPosition = 1;
        yPosition = 1;
        zPosition = 1;
        this.units = units;
    }

    public Centroid(double xPosition, double yPosition, double zPosition, String units)
    {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.zPosition = zPosition;
        this.units = units;
    }

    // INSTANCE METHODS
    // Getters
    public double getxPosition() {
        return xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public double getzPosition() {
        return zPosition;
    }

    public String getUnits() {
        return units;
    }

    // Setters

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public void setzPosition(double zPosition) {
        this.zPosition = zPosition;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
