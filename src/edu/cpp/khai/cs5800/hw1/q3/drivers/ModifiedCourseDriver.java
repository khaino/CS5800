package edu.cpp.khai.cs5800.hw1.q3.drivers;

import edu.cpp.khai.cs5800.hw1.q3.models.Instructor;
import edu.cpp.khai.cs5800.hw1.q3.models.ModifiedCourse;
import edu.cpp.khai.cs5800.hw1.q3.models.Textbook;

import java.util.ArrayList;
import java.util.List;

public class ModifiedCourseDriver {
    public static void main(String[] args) throws Exception {
        ModifiedCourse course = new ModifiedCourse("Advanced Software Engineering", getInstructors(), getTextbooks());
        course.print();
    }

    private static List<Instructor> getInstructors() {
        List<Instructor> instructors = new ArrayList<>();

        instructors.add(new Instructor("Mohammad", "Husain", "8-41"));
        instructors.add(new Instructor("Nima", "Davarpanah", "8-49"));

        return instructors;
    }

    private static List<Textbook> getTextbooks() {
        List<Textbook> textbooks = new ArrayList<>();

        textbooks.add(new Textbook("Clean Code", "Robert C. Martin", "Pearson"));
        textbooks.add(new Textbook("Design Patterns", "Erich Gamma", "Addison"));

        return textbooks;
    }
}
