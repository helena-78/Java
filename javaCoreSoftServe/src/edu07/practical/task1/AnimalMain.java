package edu07.practical.task1;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(false, "meow"),
                new Dog(true, "huff"),
                new Dog(false, "huff"),
                new Cat(false, "meow")};
        for (Animal animal : animals) {
            animal.feed();
            animal.voice();
        }
    }
}
