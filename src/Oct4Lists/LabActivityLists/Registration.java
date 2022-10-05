package Oct4Lists.LabActivityLists;

// Programmer: Guido Asbun

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Registration
{
    // Instance variables
    private String student;
    private String semester;
    LinkedList<String> courseList = new LinkedList<String>();

    // Constructor
    public Registration(String student, String semester)
    {
        this.student = student;
        this.semester = semester;
    }

    // Instance Methods
    public void display()
    {
        System.out.println("Student: " + student);
        System.out.println("Semester: " + semester);
        System.out.println("Course List");

        for (String element : courseList)
        {
            System.out.println(element);
        }
        System.out.println();
    }

    public void addCourse(String course)
    {
        ArrayList<String> courseListAllowed = new ArrayList<String>();
        courseListAllowed.add("CS131");
        courseListAllowed.add("CS150");
        courseListAllowed.add("CS170");
        courseListAllowed.add("CS216");
        courseListAllowed.add("CS257");
        courseListAllowed.add("CS272");

        if(!courseListAllowed.contains(course))
        {
            throw new IllegalArgumentException();
        }
        if (courseList.contains(course))
        {
            throw new IllegalArgumentException();
        }

        courseList.addLast(course);
        display();
    }

    public void undo()
    {
        if (courseList.size() == 0)
        {
            throw new NoSuchElementException("Unable to search an empty list");
        }
        courseList.removeLast();
        display();
    }

    public boolean search(String course)
    {
        if (courseList.size() == 0)
        {
            throw new NoSuchElementException("Unable to search an empty list");
        }
        return courseList.contains(course);
    }
}
