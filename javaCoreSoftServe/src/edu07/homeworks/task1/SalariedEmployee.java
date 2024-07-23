package edu07.homeworks.task1;

import java.util.Comparator;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double annualSalary;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double annualSalary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12;
    }

}
