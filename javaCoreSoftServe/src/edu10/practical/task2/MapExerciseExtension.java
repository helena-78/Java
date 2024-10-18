package edu10.practical.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class MapExerciseExtension {
    static Scanner scanner = new Scanner(System.in);
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void addEmployee(Map<Integer, Employee> map, Employee[] employees, Set<String> employeeNames) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (!employeeNames.contains(employee.getName())) {
                map.put(i + 1, employee);
                employeeNames.add(employee.getName());
            }
        }
    }

    public static void addAdditionalInformation(Map<Integer, Employee> map, Employee[] employees, Set<String> employeeNames) {
        String name;
        String position = "";
        double salary = 0;
        LocalDate birthDate = null;
        boolean employeeExists = false;

        System.out.println("Name of the employee additional info should be added about:");
        name = scanner.nextLine();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employeeExists = true;
                System.out.println("input position: ");
                position = scanner.nextLine();
                System.out.println("input salary: ");
                salary = scanner.nextDouble();
                scanner.nextLine();
                while (birthDate == null) {
                    try {
                        System.out.println("input date of birth (yyyy-MM-dd): ");
                        birthDate = LocalDate.parse(scanner.nextLine(), formatter);
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
                    }
                }
                employee.setPosition(position);
                employee.setSalary(salary);
                employee.setBirthday(birthDate);
                break;
            }
        }
        if (!employeeExists) {
            System.out.println("Employee not found.");
        }
    }

    public static void editInformation(Map<Integer, Employee> map, Employee[] employees, Set<String> employeeNames) {
        System.out.println("Input id of an employee to edit the information: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (map.containsKey(id)) {
            Employee employee = map.get(id);
            System.out.println("What do you want to change? <name/position/salary/birthday>");
            switch (scanner.nextLine()) {
                case "name":
                    System.out.println("Input new name: ");
                    String newName = scanner.nextLine();
                    if (employeeNames.contains(newName)) {
                        System.out.println("There already is an employee with this name.");
                    } else {
                        employee.setName(newName);
                    }
                    break;
                case "position":
                    System.out.println("Input new position: ");
                    String newPosition = scanner.nextLine();
                    employee.setPosition(newPosition);
                    break;
                case "salary":
                    System.out.println("Input new salary: ");
                    double newSalary = scanner.nextDouble();
                    scanner.nextLine();
                    employee.setSalary(newSalary);
                    break;
                case "birthday":
                    System.out.println("Input new birthday: ");
                    LocalDate newBirthday = LocalDate.parse(scanner.nextLine(), formatter);
                    scanner.nextLine();
                    employee.setBirthday(newBirthday);
                    break;
            }
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void sortMap(Map<Integer, Employee> map) {
        System.out.println("Sort a map by? <id/name/position>");
        List<Map.Entry<Integer, Employee>> entries = new ArrayList<>(map.entrySet());
        switch (scanner.nextLine()) {
            case "id":
                entries.sort(Map.Entry.comparingByKey());
                break;
            case "name":
                entries.sort(Map.Entry.comparingByValue(Comparator.comparing(Employee::getName, Comparator.nullsFirst(String::compareTo))));
                break;
            case "position":
                entries.sort(Map.Entry.comparingByValue(Comparator.comparing(Employee::getPosition, Comparator.nullsFirst(String::compareTo))));
                break;
        }

        for (Map.Entry<Integer, Employee> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void printMap(Map<Integer, Employee> map) {
        for (Map.Entry<Integer, Employee> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static void main(String[] args) {
        boolean continueTask;
        Map<Integer, Employee> employeeMap = new HashMap<>();
        Set<String> employeeNames = new HashSet<>();
        Employee[] employees = {
                new Employee("Alina Koval"),
                new Employee("Alina Kazan"),
                new Employee("Anna Shu"),
                new Employee("Otto Shu"),
                new Employee("Alice Woods"),
                new Employee("Teo Woods"),
                new Employee("Aki Yoshimura")
        };
        addEmployee(employeeMap, employees, employeeNames);
        printMap(employeeMap);

        do {
            continueTask = false;
            addAdditionalInformation(employeeMap, employees, employeeNames);
            System.out.println("Continue to put additional information? <yes/no>");
            if (scanner.nextLine().equals("yes")) {
                continueTask = true;
            }
        } while (continueTask);
        printMap(employeeMap);

        do {
            continueTask = false;
            editInformation(employeeMap, employees, employeeNames);
            System.out.println("Continue to edit information? <yes/no>");
            if (scanner.nextLine().equals("yes")) {
                continueTask = true;
            }
        } while (continueTask);
        printMap(employeeMap);

        sortMap(employeeMap);
    }
}
