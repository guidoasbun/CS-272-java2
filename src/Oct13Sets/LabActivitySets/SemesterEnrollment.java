package Oct13Sets.LabActivitySets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Programmer: Guido Asbun

public class SemesterEnrollment {
    // Variable Creation
    private String studentName;
    private int studentNumber;

    // Object Creation
    Set<String> courseSet = new TreeSet<>();

    // Constructors
    public SemesterEnrollment(String studentName, int studentNumber) {
        if (studentName.equals("")) {
            throw new IllegalArgumentException("Invalid Student Name: can not create an enrollment for a student with an empty name");
        } else {
            this.studentName = studentName;
        }
        if (studentNumber < 0) {
            throw new IllegalArgumentException("Invalid Student Number: can not create an enrollment for a student that does not have a number that is positive");
        } else {
            this.studentNumber = studentNumber;
        }
    }

    public SemesterEnrollment(String filename) throws IOException
    {
        Scanner fileInput = new Scanner(new File(filename));

        String studentName = fileInput.nextLine();
        int studentNumber = fileInput.nextInt();
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        while(fileInput.hasNext())
        {
            String course = fileInput.nextLine();
            courseSet.add(course);
        }

        fileInput.close();
    }

    // Methods
    public void setStudentName(String studentName) {
        if (studentName.equals("")) {
            throw new IllegalArgumentException("Invalid Student Name: can not update using an empty student name");
        } else {
            this.studentName = studentName;
        }
    }

    public void setStudentNumber(int studentNumber) {
        if (studentNumber < 0) {
            throw new IllegalArgumentException("Invalid Student Number: can not update using a student number that is not positive");
        } else {
            this.studentNumber = studentNumber;
        }
    }

    public void register(String course) {
        if (course.equals("")) {
            throw new IllegalArgumentException("Invalid Course: can not register for an empty course");
        } else {
            courseSet.add(course);
        }
    }

    public void drop(String course) {
        if (course.equals("")) {
            throw new IllegalArgumentException("Invalid Course: can not drop an empty course");
        } else {
            courseSet.remove(course);
        }
    }

    public boolean search(String course) {
        if (course.equals("")) {
            throw new IllegalArgumentException("Invalid Course: can not search for an empty course");
        } else {
            return courseSet.contains(course);
        }
    }

    public void save(String filename) throws IOException {
        PrintWriter fileOutput = new PrintWriter(filename);
        fileOutput.println(studentName);
        fileOutput.println(studentNumber);
        for (String course : courseSet) {
            fileOutput.println(course);
        }
        fileOutput.close();
    }
}
