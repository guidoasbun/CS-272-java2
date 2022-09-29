package Sep22Recursion.Recursion;

public class Recursion
{
    public static int exponentiation(int base, int power)
    {
        if (power == 1)
        {
            return base;
        }
        else
        {
            return base * exponentiation(base, power - 1);
        }
    }

    public static int exponentiation2(int base, int power) {
        if (power == 0)
        {
            return 1;
        }
        else
        {
            return base * exponentiation2(base, power - 1);
        }
    }

    public static int exponentiation3(int base, int power)
    {
        if (power == 0)
        {
            return 1;
        }
        if (power == 1)
        {
            return base;
        }
        else
        {
            return base * exponentiation3(base, power - 1);
        }
    }
}
