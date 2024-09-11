package edu.cpp.khai.cs5800.hw1.q1.models;

public class BaseEmployee extends Employee {
    private double baseSalary;

    private final static String EMP_TYPE = "Base";

    public BaseEmployee(String firstName, String lastName, String security, double baseSalary) {
        super(firstName, lastName, security);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String getEmploymentType() {
        return EMP_TYPE;
    }

    @Override
    public String toString() {
        return String.format("%s| Base: %-10s", super.toString(), this.getBaseSalary());
    }
}
