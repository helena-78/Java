package edu11.practical;

import java.util.Scanner;

public class Task2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("lastname: ");
        String lastName = scanner.nextLine();
        System.out.println("first name: ");
        String firstName = scanner.nextLine();
        System.out.println("middle name");
        String middleName = scanner.nextLine();

        char firstNameInitial = firstName.charAt(0);
        char middleNameInitial = middleName.charAt(0);
        System.out.println("Last name and initials: " + lastName + " " + Character.toUpperCase(firstNameInitial) + ". " + Character.toUpperCase(middleNameInitial) + ".\n"
                + "First name: " + firstName
                + "\nFirst name, middle name, and last name: " + firstName + " " + middleName + " " + lastName);

        scanner.close();
    }
}
