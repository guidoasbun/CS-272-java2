package Sep29Generics.ConceptCheckInClass;

import java.util.ArrayList;

public class ListArrayTester
{
    public static void main(String[] args)
    {
        // Constant declaration and init

        // Variable declaration
        Double appPriceElement;

        // Object Creation
        ArrayList<Double> appPrice = new ArrayList<Double>(); // $

        // Solution
        appPrice.add(1.99);
        appPrice.add(2.99);
        appPrice.add(3.99);

        appPriceElement = appPrice.get(1); // Second element, index = 1
        System.out.println("App price is $ " + appPriceElement);

    }
}
