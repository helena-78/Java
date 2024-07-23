package edu05.practical;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public static int getNumber(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', departmentNumber=" + departmentNumber + ", salary=" + salary + "}";
    }

    public static void descendingOrder(Employee[] array) {
        System.out.println("sorting the array in descending order by salary: ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].salary < array[j + 1].salary) {
                    var tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        for (Employee value : array) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Jannis Smith", 1, 15000);
        Employee employee1 = new Employee("Rashid Taylor", 1, 15500);
        Employee employee2 = new Employee("Kateryna Shevchenko", 2, 25000);
        Employee employee3 = new Employee("Nina Semenova", 2, 20000);
        Employee employee4 = new Employee("Mattia Silvestri", 2, 10500);
        Employee[] employees = {employee, employee1, employee2, employee3, employee4};
        int departmentNumber = getNumber("input department number: ");

        System.out.println("people from this department: ");
        for (Employee value : employees) {
            if (departmentNumber == value.departmentNumber) {
                System.out.println(value.toString());
            }
        }
        descendingOrder(employees);
    }
}
