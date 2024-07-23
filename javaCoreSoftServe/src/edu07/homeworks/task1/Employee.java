package edu07.homeworks.task1;

import java.util.Comparator;

public abstract class Employee implements Payment {
    private String employeeId;
    private String name;
    static EmployeeComparator employeeComparator = new EmployeeComparator();

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public static EmployeeComparator getEmployeeComparator() {
        return employeeComparator;
    }

    @Override
    public abstract double calculatePay();

    @Override
    public String toString() {
        return "\nEmployee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", averageMonthlyWage='" + calculatePay() + '\'' +
                '}';
    }

    public static class EmployeeComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o2.calculatePay(), o1.calculatePay());
        }
    }
}
