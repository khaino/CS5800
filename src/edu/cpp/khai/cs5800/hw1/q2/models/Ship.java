package edu.cpp.khai.cs5800.hw1.q2.models;

public class Ship {
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    protected String getShipInfo() {
        return String.format("Name: %-16s| Year Built: %-4s", this.getName(), this.getYearBuilt());
    }

    public void print() {
        System.out.println(this.getShipInfo());
    }
}
