package edu09.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private int course;
    private double[] grades;

    public Student(String name, String group, int course, double[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public static void filterStudents(List<Student> students) {
        double sum = 0;
        double avr = 0;
        System.out.println("original list: " + students);

        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.get(i).grades.length; j++) {
                sum += students.get(i).grades[j];
            }
            avr = sum / students.get(0).grades.length;
            if (avr < 3) {
                System.out.println("student " + students.get(i).getName() + " is failed");
                students.remove(students.get(i));
            } else {
                System.out.println("student " + students.get(i).getName() + " is promoted to a next level");
            }
            sum = 0;
            avr = 0;
        }
        System.out.println("after removing bad students: " + students);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("students enrolled to the course number " + course + ":");
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                System.out.println(students.get(i).getName());
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Anton Chehov", "Groot", 546, new double[]{2.3, 5, 3.3});
        Student student2 = new Student("Margarita Afonina", "Groot", 546, new double[]{4, 5, 5});
        Student student3 = new Student("Jaroslav Kaminskyi", "Groot", 522, new double[]{4.4, 5, 5});
        Student student4 = new Student("Bad Student", "Groot", 222, new double[]{2, 2, 1});
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        filterStudents(students);
        printStudents(students, 546);
    }
}
