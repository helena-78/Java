package edu11.practical;

import java.util.Scanner;

public class Task1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("input 1st string: ");
        String first = scanner.nextLine();
        System.out.println("input 2 nd string: ");
        String second = scanner.nextLine();
        if (second.contains(first)) {
            System.out.println("second string contains the first");
        }
        scanner.close();
    }
}
