package edu11.hw;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void greetingMessage(String name) {
        String[] greetings = {
                "Hello, %s.",
                "Hi, %s!",
                "Hey, %s!",
                "Greetings, %s.",
                "Good to see you, %s."
        };
        Random random = new Random();
        int index = random.nextInt(greetings.length);
        String selectedGreeting = greetings[index];
        System.out.printf(selectedGreeting, name);
    }

    public static String fullName() {
        System.out.println("input name and surname: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String pattern = "^([a-zA-Z]+)([ \\-][a-zA-Z]+)$";
        Pattern p = Pattern.compile(pattern);
        Matcher m;
        String fullName;

        while (true) {//continue to execute until it encounters a break
            fullName = fullName();
            m = p.matcher(fullName);

            if (m.matches()) {
                String name = m.group(1);
                greetingMessage(name);
                break;
            } else {
                System.out.println("invalid data.");
            }
        }

        scanner.close();
    }
}
