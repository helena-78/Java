package edu11.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static Scanner scanner = new Scanner(System.in);

    public static List<String> currencyOccurrences(String sentence) {
        List<String> currencies = new ArrayList<>();
        String pattern = "\\$[0-9]+\\.([0-9]{2})";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);
        while (m.find()) {
            currencies.add(m.group());
        }
        return currencies;
    }

    public static void main(String[] args) {
        System.out.println("input a text containing several instances of US currency format: ");
        String sentence = scanner.nextLine();
        List<String> currencyOccurrence = currencyOccurrences(sentence);
        System.out.println(currencyOccurrence);
        scanner.close();
    }
}
