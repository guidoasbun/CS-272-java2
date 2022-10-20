package Quiz2ExtraWork.Recursion;

// Write a recursive method to compute the following series:
//
// mSeries(number) = 1 + 1/2 + 1/3 + … + 1/number

public class Recursion4 {
    public static double mSeries(int number)
    {
        if (number == 1)
        {
            return 1;
        }
        else
        {
            return 1.0 / number + mSeries(number - 1);
        }
    }
}
