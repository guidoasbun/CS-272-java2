package Sep08Inheritance.Inheritance.Part1;

public class CarTester
{
    public static void main(String[] args)
    {
        Vehicle myCar = new Car(20000);
        System.out.println(myCar.getValue());
        System.out.println("Expected: 20000.0");
        myCar.move(10000);
        System.out.println(myCar.getValue());
        System.out.println("Expected: 17500.0");
        myCar.move(30000);
        System.out.println(myCar.getValue());
        System.out.println("Expected: 10000.0");
        myCar.move(40000);
        System.out.println(myCar.getValue());
        System.out.println("Expected: 0.0");
        myCar.move(10000);
        System.out.println(myCar.getValue());
        System.out.println("Expected: 0.0");
    }
}
