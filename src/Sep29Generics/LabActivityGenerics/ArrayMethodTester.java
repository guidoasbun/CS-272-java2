package Sep29Generics.LabActivityGenerics;

import java.util.Scanner;

public class ArrayMethodTester
{
    public static void test1()
    {
        final int NUMBER_OF_BUILDINGS = 3;

        Double[] buildingCosts = new Double[NUMBER_OF_BUILDINGS];
        ArrayMethod.initialize(1234567.89, buildingCosts);
        ArrayMethod.display("Initialized Costs ($)", buildingCosts);
    }

    public static void test2()
    {
        int NUMBER_OF_BUILDINGS = 4;

        Double[] buildingCosts = new Double[NUMBER_OF_BUILDINGS];

        Scanner buildingCostInput = new Scanner(System.in);
        int count = 0;
        while (count < buildingCosts.length)
        {
            System.out.print("Enter the cost of building " + (count + 1) + ": ");
            buildingCosts[count] = buildingCostInput.nextDouble();
            count++;
        }
        buildingCostInput.close();
        ArrayMethod.display("Building Costs (Euros)", buildingCosts);
    }
}
