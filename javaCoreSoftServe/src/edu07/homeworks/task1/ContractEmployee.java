package edu07.homeworks.task1;

import java.util.Comparator;

public class ContractEmployee extends Employee {
    private String federalTaxIdMember;
    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, int hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

}
