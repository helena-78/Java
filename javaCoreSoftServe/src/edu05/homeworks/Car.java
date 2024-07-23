package edu05.homeworks;

import java.util.Scanner;
import java.util.Arrays;

public class Car {
    public static Scanner sc;
    private String type;
    private int productionYear;
    private double engineCapacity;

    public Car(String type, int productionYear, double engineCapacity) {
        this.type = type;
        this.productionYear = productionYear;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{ " + "type= " + type + ", productionYear= " + productionYear + ", engineCapacity= " + engineCapacity + " }";
    }

    public static void main(String[] args) {
        Car car1 = new Car("Sedan", 2020, 1794);
        Car car2 = new Car("minivan", 2022, 1785);
        Car car3 = new Car("sports", 2023, 1587);
        Car car4 = new Car("hatchback", 2023, 1654);
        Car[] cars = {car1, car2, car3, car4};
        sc = new Scanner(System.in);
        boolean isCertainYear=false;

        System.out.println("enter certain model year: ");
        int year = sc.nextInt();
        for (Car car : cars) {
            if (year == car.productionYear) {
                System.out.println(car);
                isCertainYear=true;
            }
        }
        if(isCertainYear){
            for (int i = 0; i < cars.length - 1; i++) {
                for (int j = 0; j < cars.length - i - 1; j++) {
                    if (cars[j].productionYear > cars[j + 1].productionYear) {
                        var temp = cars[j];
                        cars[j] = cars[j + 1];
                        cars[j + 1] = temp;
                    }
                }
            }
            System.out.println("sorted array: " + Arrays.toString(cars));
        } else{
            System.out.println("there is no model with this production year");
        }

        sc.close();
    }
}
