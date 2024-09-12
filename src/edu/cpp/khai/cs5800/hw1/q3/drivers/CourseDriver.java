package edu.cpp.khai.cs5800.hw1.q3.drivers;

import edu.cpp.khai.cs5800.hw1.q3.models.Course;
import edu.cpp.khai.cs5800.hw1.q3.models.Instructor;
import edu.cpp.khai.cs5800.hw1.q3.models.Textbook;

public class CourseDriver {
    public static void main(String[] args) {
        Instructor  instructor = new Instructor("Nima", "Davarpanah","8-49");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
        Course course = new Course("Advanced Software Engineering", instructor, textbook);
        course.print();
    }
}
