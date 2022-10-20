package Oct18Maps.LabActivityMaps;

//Programmer: Guido Asbun

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ReportCard {

    // Variable Creation
    private String studentName;
    private int studentNumber;

    // Object Creation
    Map<String, String> gradeMap;

    // Constructors
    public ReportCard(String studentName, int studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        gradeMap = new LinkedHashMap<>();
    }

    public ReportCard(String filename) throws IOException {

        Scanner fileInput = new Scanner(new File(filename));
        String studentName = fileInput.nextLine();
        int studentNumber = fileInput.nextInt();
        fileInput.nextLine();

        this.studentName = studentName;
        this.studentNumber = studentNumber;
        gradeMap = new LinkedHashMap<>();

        while (fileInput.hasNext()) {
            String course = fileInput.nextLine();
            String grade = fileInput.nextLine();
            gradeMap.put(course, grade);
        }
        fileInput.close();

    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    // Methods
    public void enterGrade(String course, String letterGrade) {
        gradeMap.put(course, letterGrade);
    }

    public void dropCourse(String course) {
        if (gradeMap.get(course) != null) {
            gradeMap.remove(course);
        } else {
            throw new IllegalArgumentException("Invalid Course: can not drop a class that is not in the course map");
        }
    }

    public int courses() {
        return gradeMap.size();
    }

    public String letterGrade(String course) {
        if (gradeMap.get(course) != null) {
            return gradeMap.get(course);
        } else {
            throw new IllegalArgumentException("Invalid Course: can not get the letter grade for a course that is not in the map");
        }
    }

    public void saveReportCard(String filename) throws IOException {
        PrintWriter fileOutput = new PrintWriter(filename);
        fileOutput.println(studentName);
        fileOutput.println(studentNumber);

        gradeMap.forEach((key, value) -> {
            fileOutput.println(key);
            fileOutput.println(value);
        });
        fileOutput.close();

    }
}
