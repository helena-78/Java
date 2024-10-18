package edu10.hw;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Don't");
        set1.add(" ");
        set1.add("Worry");
        set2.add(" ");
        set2.add("Be");
        set2.add("Calm");
        set2.add("Worry");

        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));
    }
}
