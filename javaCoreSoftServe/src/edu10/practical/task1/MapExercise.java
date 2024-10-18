package edu10.practical.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise {
    static Scanner scanner = new Scanner(System.in);
    public static int getId(String prompt) {
        System.out.println(prompt);
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public static String getName(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static void findEmployeeByName(Map<Integer, String> employeeMap, String name) {
        boolean found = false;
        for (Map.Entry<Integer, String> m : employeeMap.entrySet()) {
            if (m.getValue().equals(name)) {
                System.out.println("Employee ID: " + m.getKey());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No employee with this name.");
        }
    }
    public static void findEmployeeByID(Map<Integer, String> employeeMap, int id) {
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee name with such an ID: " + employeeMap.get(id));
        } else {
            System.out.println("No employee with provided ID.");
        }
    }
    public static void main(String[] args) {
        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(1,"Charlie Puth");
        employeeMap.put(2,"Ronald Tommson");
        employeeMap.put(3,"Alice Clinton");
        employeeMap.put(4,"Chloe Puth");
        employeeMap.put(5,"Rina Nagachika");
        employeeMap.put(6,"Tim Clinton");
        employeeMap.put(7,"Matt McCallen");
        for (Map.Entry<Integer, String> m : employeeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        findEmployeeByID(employeeMap, getId("Enter an ID of the user you're willing to find: "));
        findEmployeeByName(employeeMap, getName("Enter a name of the employee to find their ID: "));

    }
}
