package edu.cpp.khai.cs5800.hw1.p1.models;

public class HourlyEmployee extends Employee {
    private float wage;
    private float hoursWorked;

    private final static String EMP_TYPE = "Hourly";

    public HourlyEmployee(String firstName, String lastName, String security, float wage, float hoursWorked) {
        super(firstName, lastName, security);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getEmploymentType() {
        return EMP_TYPE;
    }

    @Override
    public String toString() {
        return String.format(
                "%s| Hourly Wage: %-10s| Hours Worked: %-10s",
                super.toString(),
                this.getWage(),
                getHoursWorked()
        );
    }
}
