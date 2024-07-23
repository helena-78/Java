package edu07.practical.task1;

public class Cat implements Animal {
    private boolean isHungry;
    private String voice;

    public Cat(boolean isHungry, String voice) {
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
            System.out.println("The cat is not hungry");
        } else {
            System.out.println("The cat is hungry");
        }
    }
}
