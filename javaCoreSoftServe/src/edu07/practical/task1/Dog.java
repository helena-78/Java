package edu07.practical.task1;

public class Dog implements Animal {
    private boolean isHungry;
    private String voice;

    public Dog(boolean isHungry, String voice) {
        this.isHungry = isHungry;
        this.voice = voice;
    }

    @Override
    public void voice() {
        System.out.println(voice);
    }

    @Override
    public void feed() {
        if (!isHungry) {
            System.out.println("The dog is not hungry");
        } else {
            System.out.println("The dog is hungry");
        }
    }
}
