package edu07.homeworks.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class EmployeeMain {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>(Employee.getEmployeeComparator());
        set.add(new ContractEmployee("l4k4", "Olesya", "154661", 6, 200));
        set.add(new SalariedEmployee("15d5", "Ronald", "446168", 500000));
        set.add(new ContractEmployee("cs4s", "Marta", "415478", 8, 100));
        System.out.println(set);

    }
}
