package edu.cpp.khai.cs5800.hw1.p1.models;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    private final static String EMP_TYPE = "Salary";

    public SalariedEmployee(String firstName, String lastName, String security, float weeklySalary) {
        super(firstName, lastName, security);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String getEmploymentType() {
        return EMP_TYPE;
    }

    @Override
    public String toString() {
        return String.format("%s| Weekly Salary: %-10s", super.toString(), this.getWeeklySalary());
    }
}
