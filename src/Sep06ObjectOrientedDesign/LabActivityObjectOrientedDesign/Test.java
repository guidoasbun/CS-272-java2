package Sep06ObjectOrientedDesign.LabActivityObjectOrientedDesign;


public class Test {
    public static void main(String[] args) {
        GlobalPositioningLocation location1 = new GlobalPositioningLocation();
        GlobalPositioningLocation location2 = new GlobalPositioningLocation(34.123, -118.456, 100, "meters");

        System.out.println("Location 1: " + location1.getLatitude() + ", " + location1.getLongitude() + ", " + location1.getElevation() + " " + location1.getElevationUnits());
        System.out.println("Location 2: " + location2.getLatitude() + ", " + location2.getLongitude() + ", " + location2.getElevation() + " " + location2.getElevationUnits());
    }
}
