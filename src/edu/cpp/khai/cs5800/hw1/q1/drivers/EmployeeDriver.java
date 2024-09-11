package edu.cpp.khai.cs5800.hw1.q1.drivers;

import edu.cpp.khai.cs5800.hw1.q1.models.*;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee[] employees = createEmployees();
        printEmployees(employees);
    }

    private static Employee[] createEmployees() {
        Employee[] employees = new Employee[6];

        employees[0] = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        employees[1] = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        employees[2] = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        employees[3] = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        employees[4] = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        employees[5] = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);

        return employees;
    }

    private static void printEmployees(Employee[] employees) {
        System.out.println("------------------All Employees------------------");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
