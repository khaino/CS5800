package edu.cpp.khai.cs5800.hw1.q4.models;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("|--");
        }
        System.out.println(this.name);
    }
}
