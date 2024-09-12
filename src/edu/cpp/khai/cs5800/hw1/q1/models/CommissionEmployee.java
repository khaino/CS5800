package edu.cpp.khai.cs5800.hw1.q1.models;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSale;

    private final static String EMP_TYPE = "Commission";

    public CommissionEmployee(String firstName,
                              String lastName,
                              String security,
                              double commissionRate,
                              double grossSale) {
        super(firstName, lastName, security);
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    @Override
    public String getEmploymentType() {
        return EMP_TYPE;
    }

    @Override
    public String toString() {
        return String.format("%s| Commission Rate: %-5s | Gross Sale: %-10s",
                super.toString(),
                this.getCommissionRate(),
                this.getGrossSale());
    }
}
