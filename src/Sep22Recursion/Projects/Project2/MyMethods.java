package Sep22Recursion.Projects.Project2;

public class MyMethods
{
    public static int reverseInt(int value)
    {
        if (value == 0) {
            return 0;
        } else {
            return reverseInt(value/10) + (value%10)*powerOfTen(numberOfDigits(value)-1);
        }
    }

    public static int powerOfTen(int exponent)
    {
        if (exponent <= 0) return 1;
        else return 10 * powerOfTen(exponent-1);
    }

    public static int numberOfDigits(int value)
    {
        if (value < 10) return 1;
        else return 1 + numberOfDigits(value/10);
    }
}
