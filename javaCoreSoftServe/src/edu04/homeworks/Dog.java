package edu04.homeworks;

public class Dog {
    private String name;
    private Breed breed;
    private double age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Dog(String name, Breed breed, double age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Ronny", Breed.BERNESE, 5);
        Dog dog1 = new Dog("Remi", Breed.SPANIEL, 4);
        Dog dog2 = new Dog("Archie", Breed.SAMOYED, 6);
        Dog[] dogs = {dog, dog1, dog2};
        double maxAge = Double.MIN_VALUE;
        String oldestDogName = null;
        Breed oldestDogBreed = null;
        boolean areWithTheSameName = false;
        for (int i = 1; i < dogs.length; i++) {
            if (dogs[i].name.equals(dogs[i - 1].name)) {
                System.out.println("there are two dogs with the same name");
                areWithTheSameName = true;
            }
        }
        if (!areWithTheSameName) {
            System.out.println("there are no two dogs with the same name");
        }
        for (Dog value : dogs) {
            if (maxAge < value.age) {
                maxAge = value.age;
                oldestDogName = value.name;
                oldestDogBreed = value.breed;
            }
        }
        System.out.println("the name and the breed of the oldest dog: " + oldestDogName + ", " + oldestDogBreed);
    }
}
