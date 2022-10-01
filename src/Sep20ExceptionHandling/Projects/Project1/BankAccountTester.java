package Sep20ExceptionHandling.Projects.Project1;

public class BankAccountTester
{
    public static void main(String[] args)
    {
        test(1000, 10);
        System.out.println("Expected: constructed");
        test(-1000, 10);
        System.out.println("Expected: illegal argument");
        test(1000, -10);
        System.out.println("Expected: illegal argument");
    }

    public static void test(double initialBalance, double rate)
    {
        try
        {
            BankAccount account = new BankAccount(initialBalance, rate);
            System.out.println("constructed");
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("illegal argument");
        }
        catch (Exception ex)
        {
            System.out.println("another error");
        }
    }
}
