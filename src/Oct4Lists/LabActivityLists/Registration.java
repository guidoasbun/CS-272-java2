package Oct4Lists.LabActivityLists;

import java.util.*;

public class Registration
{
    private String student;
    private String semester;
    LinkedList<String> courseList = new LinkedList<String>();

    public Registration(String student, String semester)
    {
        this.student = student;
        this.semester = semester;
    }

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
        ArrayList<String> courseListNotAllowed = new ArrayList<String>();
        courseListNotAllowed.add("CS131");
        courseListNotAllowed.add("CS150");
        courseListNotAllowed.add("CS170");
        courseListNotAllowed.add("CS216");
        courseListNotAllowed.add("CS257");
        courseListNotAllowed.add("CS272");

        if(courseListNotAllowed.contains(course))
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
