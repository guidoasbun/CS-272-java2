package Projects.AbstractClassesAndInterfaces.Part3;

public class MovementTester
{
    public static void main(String[] args)
    {

        Movement myAuto = new Auto("Nissan Altima","JKX14R");
        myAuto.move(35);
        Movement myShip = new Ship(45,"Sea Serpent");
        myShip.move(60);
        System.out.println(myAuto.getPosition() + ", " + myShip.getPosition());
        System.out.println("Expected: Nissan Altima at position 35, Sea Serpent at position 60");
    }

    private void moveAuto(Auto anAuto, int distance)
    {
        anAuto.move(distance);
    }

    private void moveShip(Ship aShip, int distance)
    {
        aShip.move(distance);
    }
}
