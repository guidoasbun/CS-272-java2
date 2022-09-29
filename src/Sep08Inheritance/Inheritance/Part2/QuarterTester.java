package Sep08Inheritance.Inheritance.Part2;

public class QuarterTester
{
    public static void main(String[] args)
    {
        Coin c = new Quarter("Michigan");
        System.out.println(c.getDescription());
        System.out.println("Expected: Quarter, value=0.25, state=Michigan");
    }
}
