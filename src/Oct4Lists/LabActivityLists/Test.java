package Oct4Lists.LabActivityLists;

public class Test
{
    public static void main(String[] args)
    {
        Registration student1 = new Registration("John Doe", "Fall 2019");
        student1.addCourse("CS1111");
        System.out.println("Is class in the list: " + student1.search("CS1111"));

    }
}
