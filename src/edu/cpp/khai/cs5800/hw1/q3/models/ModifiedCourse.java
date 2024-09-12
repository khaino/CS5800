package edu.cpp.khai.cs5800.hw1.q3.models;

import java.util.List;

public class ModifiedCourse {
    private static final int NUMBER_OF_INSTRUCTORS = 2;
    private static final int NUMBER_OF_TEXTBOOKS = 2;

    private String name;
    private List<Instructor> instructors;
    private List<Textbook> textbooks;

    public ModifiedCourse(
            String name,
            List<Instructor> instructors,
            List<Textbook> textbooks
    ) throws Exception {
        this.name = name;
        this.setInstructors(instructors);
        this.setTextbooks(textbooks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) throws Exception {
        if (instructors == null || instructors.size() != NUMBER_OF_INSTRUCTORS) {
            String msg = String.format("Only %s instructors can be added!", NUMBER_OF_INSTRUCTORS);
            throw new Exception(msg);
        }
        this.instructors = instructors;
    }

    public List<Textbook> getTextbooks() {
        return textbooks;
    }

    public void setTextbooks(List<Textbook> textbooks) throws Exception {
        if (textbooks == null || textbooks.size() != NUMBER_OF_TEXTBOOKS) {
            throw new Exception(String.format("Only %s textbooks can be added!",
                    NUMBER_OF_TEXTBOOKS));
        }

        this.textbooks = textbooks;
    }

    public void print() {
        System.out.printf("Course Name: %s%n", this.getName());
        System.out.println("Instructors:");
        for (Instructor instructor : this.getInstructors()) {
            System.out.printf(" %s%n", instructor);
        }
        System.out.println("Textbooks:");
        for (Textbook textbook : this.getTextbooks()) {
            System.out.printf(" %s%n", textbook);
        }
    }
}
