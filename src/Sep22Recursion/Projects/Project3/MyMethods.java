package Sep22Recursion.Projects.Project3;

public class MyMethods
{

    // Complete the multiply method in the MyMethods class so that it returns the
    // product of the non-negative integer n multiplied by the integer m.
    // Use recursion and addition. Do not use multiplication!
    public static int multiply(int n, int m)
    {
        if (n == 0)
            return 0;

        int simplerResult = multiply(n - 1, m);

        // your work goes here
        return simplerResult + m;
    }

}
