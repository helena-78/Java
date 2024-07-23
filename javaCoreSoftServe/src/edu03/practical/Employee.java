package edu03.practical;

import java.lang.System.*;

import static java.lang.System.out;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    static double totalSum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    public Employee() {
        this.name = "";
        this.rate = 0;
        this.hours = 0;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public double getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee { name = '" + name + '\'' + ", rate = " + rate + ", hours = " + hours + " }";
    }

    public double getBonuses() {
        return 0.1 * getSalary();
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("elena", 12.5, 12);
        Employee employee2 = new Employee("max", 10, 8);
        Employee employee3 = new Employee("anastasiia", 11.3);

        out.println(employee1);
        out.println(employee2);
        out.println(employee3);

        out.println("total salary of all employees is: " + (employee1.getSalary() + employee2.getSalary() + employee3.getSalary()));

    }
}
