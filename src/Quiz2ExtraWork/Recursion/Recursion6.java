package Quiz2ExtraWork.Recursion;

// Write a recursive method to compute the following series:
//
// series6(number) = 1/2 + 2/3 + … + number/ (number + 1)

public class Recursion6 {
    public static double series6(int number)
    {
        if (number == 1)
        {
            return 1.0 / 2;
        }
        else
        {
            return number / (number + 1.0) + series6(number - 1);
        }
    }
}
