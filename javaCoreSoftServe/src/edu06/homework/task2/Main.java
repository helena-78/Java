package edu06.homework.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Smith", 19, 12900.22);
        Developer developer = new Developer("Johnny Smith", 23, 129000.22, "junior java developer");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
