package edu10.practical.task2;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String position;
    private double salary;
    private LocalDate birthday;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String position, double salary, LocalDate birthday) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
