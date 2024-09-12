package edu.cpp.khai.cs5800.hw1.q3.models;

public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void print() {
        System.out.printf("Course Name: %s%n", this.getName());
        System.out.printf("Instructor %s%n", this.instructor);
        System.out.printf("Textbook %s%n", this.textbook);
    }
}
