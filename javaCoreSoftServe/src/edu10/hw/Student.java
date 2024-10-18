package edu10.hw;

import java.util.*;

public class Student {
    static Scanner scanner = new Scanner(System.in);
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public static void printStudents(List<Student> list, int course) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> NameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Student> CourseComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getCourse(), o2.getCourse());
        }
    };

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nikolas", 123));
        students.add(new Student("Michael", 456));
        students.add(new Student("Camille", 123));
        students.add(new Student("Vasilisa", 123));
        students.add(new Student("Marina", 456));

        System.out.println("Input course code: ");
        int course = scanner.nextInt();
        scanner.nextLine();
        printStudents(students, course);

        System.out.println("*".repeat(10));
        students.sort(NameComparator);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("*".repeat(10));
        students.sort(CourseComparator);
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
