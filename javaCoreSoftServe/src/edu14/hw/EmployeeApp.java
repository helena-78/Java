package edu14.hw;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EmployeeApp {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );
        Optional<String> popularName = Employee.mostPopularName(employeeList.stream());
        popularName.ifPresent(System.out::println);
    }
}
