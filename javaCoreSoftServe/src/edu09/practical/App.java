package edu09.practical;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<HeavyBox<String, Integer>> list = new ArrayList<>();
        list.add(new HeavyBox<>("books", 5));
        list.add(new HeavyBox<>("laptop", 2));
        list.add(new HeavyBox<>("weights", 10));

        for (HeavyBox<String, Integer> heavyBox : list) {
            System.out.println(heavyBox);
        }

        System.out.println("\n" + "*".repeat(10) + "Change the weight of the first box by 1" + "*".repeat(10));
        HeavyBox<String, Integer> firstBox = list.get(0);
        firstBox.setWeight(1);
        System.out.println(list);

        System.out.println("\n" + "*".repeat(10) + "Remove the last box" + "*".repeat(10));
        list.remove(list.size() - 1);
        System.out.println(list);

        System.out.println("\n" + "*".repeat(10) + "Remove all boxes" + "*".repeat(10));
        list.clear();
        System.out.println(list);


    }
}
