package edu11.practical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static Scanner scanner = new Scanner(System.in);

    public static boolean usernameCheckRequirements(String username) {
        String pattern = "[a-zA-Z0-9_]{3,15}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(username);
        return m.matches();
    }

    public static void printValidUsernames(List<String> list) {
        System.out.println("Valid usernames:");
        for (String user : list) {
            if (usernameCheckRequirements(user)) {
                System.out.println(user);
            }
        }
    }

    public static void newUsername(List<String> list) {
        String username;
        System.out.println("New username: ");
        username = scanner.nextLine();
        list.add(username);
    }

    public static void main(String[] args) {
        List<String> usernamesList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            newUsername(usernamesList);
        }
        printValidUsernames(usernamesList);
        scanner.close();
    }
}
