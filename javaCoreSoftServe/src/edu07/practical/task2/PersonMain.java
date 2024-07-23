package edu07.practical.task2;

public class PersonMain {
    public static void main(String[] args) {
        Person[] people = {new Teacher(), new Cleaner(), new Student()};
        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
