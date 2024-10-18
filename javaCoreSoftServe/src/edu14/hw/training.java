package edu14.hw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

record Person(int age, String name) {}
public class training {
    public static void addElementsToList(List<String> list) {
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("forth");
    }

    public static void main(String[] args) throws IOException {
        /*stream is a sequence of objects from the source. Source can be Collections, generators, arrays, files etc.
        *Instead of writing loops and conditionals, you can use high-level methods like filter(), map(), reduce(), etc.*/
        List<String> list = Arrays.asList("abc", "", "bc", "abcd", "", "jkl");
        Stream<String> s = list.stream();//Returns a sequential stream considering collection as its source
        System.out.println(list);
        System.out.println("*".repeat(10));
        s.forEach(System.out::println);

        Stream<Integer> randomNumber = Stream.generate(() -> new Random().nextInt(100)).limit(10).sorted();//sort from small to large
        System.out.println("*".repeat(10));
        randomNumber.forEach(System.out::println);

        LongStream str = LongStream.range(0, 100);
        System.out.println("*".repeat(10));
        str.forEach(System.out::println);

        List<String> strings = Arrays.asList("abc", "", "bc", "abcd", "", "jkl");
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println(strings);
        System.out.println(filtered);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream()
                .map(i -> i * i)
                .distinct()//чтобы не повторялись числа
                .toList();
        System.out.println("*".repeat(10));
        System.out.println(squaresList);

        List<String> strings1 = Arrays.asList("abc", "", "eg", "abcd", "", "jkl");
        long count = strings1.stream()//long потому что .count() возвращает данные типа long.
                .filter(String::isEmpty)
                .count();
        System.out.println("*".repeat(10));
        System.out.println(count);

        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6);
        int numbers1 = numbersList.stream().reduce(0, Integer::sum);
        System.out.println("*".repeat(10));
        System.out.println(numbers1);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(54, "Alice"));
        persons.add(new Person(18, "Bob"));
        persons.add(new Person(32, "Dave"));
        persons.add(new Person(28, "Charlie"));

        System.out.println("*".repeat(10));
        persons.stream()
                .reduce((p1, p2) -> p1.age() > p2.age() ? p1 : p2)//усли п1 больше п2, возвращает п1. условие ? истина : ложь
                .ifPresent(System.out::println);

        Person result = persons.stream()
                .reduce(new Person(0, ""), (p1, p2) ->
                        new Person(p1.age() + p2.age(), p1.name() + p2.name()));
        System.out.println("Age and names of all persons is " + result);

        Integer ageSum = persons.stream()
                .reduce(0, (sum, p) -> sum + p.age(), Integer::sum);
        System.out.println("Age of all persons is " + ageSum);

        List<Integer> numbers3 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        boolean hasAnyGreaterThan20 = numbers3.stream()
                .map(i -> i * i) // Square each number
                .distinct()      // Remove duplicates
                .anyMatch(i -> i > 20); // Check if any element is greater than 20
        System.out.println("*".repeat(10));
        System.out.println("Is there any squared number greater than 20? " + hasAnyGreaterThan20);

        List<Integer> numbers4 = Arrays.asList(5, 3, 8, 1, 9, 4);
        System.out.println("*".repeat(10));
        System.out.println("Processing in order:");
        numbers4.stream()
                .parallel()           // Process the stream in parallel
                .forEachOrdered(i -> System.out.println("Processing: " + i));

        List<Integer> listNum = Arrays.asList ( 1, 2, 3, 4 );
        int result1 = listNum.parallelStream().reduce(5, Integer::sum);
        System.out.println("*".repeat(10));
        System.out.println(result1);

        List<String> listA = Arrays.asList("Start", "Second", "Third", "Fourth");
        System.out.println("*".repeat(10));
        System.out.println("List: " + listA);
        List<String> unmodifiableList = listA.stream().toList();
        //Now if we try to modify the result List, we'll get an UnsupportedOperationException:
        //unmodifiableList.add("last");
        System.out.println("Unmodifiable List: " + unmodifiableList);

        List<String> listB = Arrays.asList("Start", "Start", "Third", "Fourth");
        Set<String> result2 = listB.stream().collect(toSet());
        System.out.println("*".repeat(10));
        System.out.println(result2);

        List<String> listC = Arrays.asList("Start","Start", "Ok", "Third", "Fourth");
        Map<String, Integer> result3 = listC.stream().collect(toMap(Function.identity(), String::length, (item, identicalItem) -> item));
        System.out.println("*".repeat(10));
        System.out.println(result3);

        List<Integer> numbers2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers2.stream()
                .mapToInt((x) -> x).summaryStatistics();//The mapToInt method is used to convert each
        // element in the stream into an int. The lambda expression (x) -> x simply returns the integer value of each element.
        System.out.println("*".repeat(10));
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

        //optional нужен для того чтобы операции проходили даже если одно из значений равно null.
        // например чтобы было возможно поситать 0+10=10
        /*Integer value1 = null;
        Integer value2 = 10;
        System.out.println(sum1(value1, value2));//NullPointerException*/
        Integer value1 = null;
        Integer value2 = 10;
        // Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);
        // Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());
        System.out.println(sum(a, b));    // sum1(value1, value2)

    }
    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        // Optional.orElse - returns the value if present otherwise returns
        // the default value passed.
        Integer value1 = a.orElse(0);
        // Optional.get - gets the value, value should be present
        Integer value2 = b.get();
        return value1 + value2;
    }

    /*public static Integer sum1(Integer v1, Integer v2) {
        if ((v1 != null) && (v2 != null)) {
            return v1 + v2;
        }
        return v1 + v2;
    }*/

}
