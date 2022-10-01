package Sep20ExceptionHandling.Projects.Project2;

// TODO: Determine whether a or b do not represent an integer
// by catching the NumberFormatException. If either one is not an integer,
// use the value 0 when computing the sum.

public class Numbers
{
    public int add(String a, String b)
    {

        int x;
        int y;
        try
        {
            x = Integer.parseInt(a);
        }
        catch (NumberFormatException exception)
        {
            x = 0;
        }
        try
        {
            y = Integer.parseInt(b);
        }
        catch (NumberFormatException exception)
        {
            y = 0;
        }
        return x + y;
    }
}
