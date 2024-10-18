package edu10.hw;

import edu10.practical.task2.Employee;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        Set<String> firstNames = new HashSet<>();
        personMap.put("Chekhov", "Jan");
        personMap.put("Woods", "Fillip");
        personMap.put("Ivanova", "Jelena");
        personMap.put("Dzvinka", "Nina");
        personMap.put("Bondarenko", "Jan");
        personMap.put("Ishikawa", "Rina");
        personMap.put("Toomet", "Fillip");
        personMap.put("Kaminskiy", "Jan");
        personMap.put("Smith", "Fillip");
        personMap.put("Franklin", "Benjamin");

        for (Map.Entry<String, String> m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        for (String firstName : personMap.values()) {
            if (!firstNames.add(firstName)) {
                System.out.println("there are at least two persons with the same first name " + firstName);
                break;
            }
        }

        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals("Benjamin")) {
                iterator.remove();
                System.out.println("Removed entry with first name Benjamin: " + entry.getKey() + " " + entry.getValue());
            }
        }
        for (Map.Entry<String, String> m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
class DemoMaps {
    public static void main(String[] args) {
        Map<String, String> personMap = createPersonMap();

        System.out.println("Original personMap:");
        printMap(personMap);

        checkForDuplicateFirstNames(personMap);

        removePersonByFirstName(personMap, "Orest");  // You can replace "Orest" with any other first name

        System.out.println("Map after removal:");
        printMap(personMap);
    }

    /**
     * Creates and populates the personMap with ten entries.
     *
     * @return a populated map of last names and first names.
     */
    private static Map<String, String> createPersonMap() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Chekhov", "Jan");
        personMap.put("Woods", "Fillip");
        personMap.put("Ivanova", "Jelena");
        personMap.put("Dzvinka", "Nina");
        personMap.put("Bondarenko", "Jan");
        personMap.put("Ishikawa", "Rina");
        personMap.put("Toomet", "Fillip");
        personMap.put("Kaminskiy", "Jan");
        personMap.put("Smith", "Fillip");
        personMap.put("Franklin", "Benjamin");
        return personMap;
    }

    /**
     * Prints the contents of the provided map.
     *
     * @param map the map to be printed.
     */
    private static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    /**
     * Checks if there are at least two persons with the same first name in the map.
     *
     * @param map the map to be checked.
     */
    private static void checkForDuplicateFirstNames(Map<String, String> map) {
        Set<String> firstNames = new HashSet<>();
        for (String firstName : map.values()) {
            if (!firstNames.add(firstName)) {
                System.out.println("There are at least two persons with the same first name: " + firstName);
                return;
            }
        }
    }

    /**
     * Removes a person from the map based on the provided first name.
     *
     * @param map       the map from which the person should be removed.
     * @param firstName the first name of the person to be removed.
     */
    private static void removePersonByFirstName(Map<String, String> map, String firstName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(firstName)) {
                System.out.println("Removed entry with first name " + firstName + ": " + entry.getKey() + " " + entry.getValue());
                iterator.remove();
                return;
            }
        }
        System.out.println("No entry found with the first name: " + firstName);
    }
}