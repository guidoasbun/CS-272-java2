package Sep22Recursion.LabActivityRecursion;
// PROGRAMMER: Guido Asbun

public class Mathematics
{
    public static double fractionSeries(int number)
    {
        if (number == 2) // base case
        {
            return (1.0 / number) * 1.0;
        }
        else if (number == 1)
        {
            throw new IllegalArgumentException("Infinite Loop Error: number can not be 1");
        }
        else if (number == 0)
        {
            throw new IllegalArgumentException("Division by zero error: number can not be zero");
        }
        else if (number < 0)
        {
            throw new IllegalArgumentException("Infinite Loop Error: number can not be negative");
        }
        else // recursive call
        {
            return (1.0 / number) + fractionSeries(number - 1);
        }
    }
}

        // if (number == 1)
        // {
        //     throw new IllegalArgumentException("Infinite loop error: number can not be 1");
        // }
        // else if (number == 0)
        // {
        //     throw new IllegalArgumentException("Division by zero error: number can not be zero");
        // }
        // else if (number < 0)
        // {
        //     throw new IllegalArgumentException("Infinite loop error: number can not be negative");
        // }
        // else
        // {
        //     return (1.0 / number) + fractionSeries(number - 1);
        // }
