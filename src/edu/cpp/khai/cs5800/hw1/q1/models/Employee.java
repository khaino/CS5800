package edu.cpp.khai.cs5800.hw1.q1.models;

public class Employee {
    private String firstName;
    private String lastName;
    private String security;

    private final static String EMP_TYPE = "Employee";

    public Employee(String firstName, String lastName, String security) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.security = security;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmploymentType() {
        return EMP_TYPE;
    }

    @Override
    public String toString() {
        return String.format(
                "First Name: %-10s| Last Name: %-10s| SSN: %-10s| Employment Type: %-10s",
                this.getFirstName(),
                this.getLastName(),
                this.getSecurity(),
                this.getEmploymentType()
        );
    }
}
