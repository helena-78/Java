package edu06.practical;


public abstract class Car {
    protected String model;
    protected int speed;
    protected int productionYear;

    public Car(String model, int speed, int productionYear) {
        this.model = model;
        this.speed = speed;
        this.productionYear = productionYear;
    }

    public abstract void run();

    public abstract void stop();
}

class Truck extends Car {
    public Truck(String model, int speed, int productionYear) {
        super(model, speed, productionYear);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", productionYear=" + productionYear +
                '}';
    }

    public void run() {
        System.out.println("Car " + toString() + " is running");
    }

    public void stop() {
        System.out.println("Car " + toString() + " is stopped");
    }
}

class Sedan extends Car {
    public Sedan(String model, int speed, int productionYear) {
        super(model, speed, productionYear);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", productionYear=" + productionYear +
                '}';
    }

    public void run() {
        System.out.println("Car " + toString() + " is running");
    }

    public void stop() {
        System.out.println("Car " + toString() + " is stopped");
    }
}

class CarMain {
    public static void main(String[] args) {
        Car[] cars = {new Sedan("Toyota Camry", 85, 2020),
                new Truck("Ford", 0, 2020),
                new Truck("Ford", 50, 2005),
                new Sedan("Toyota Camry", 105, 2021),
                new Sedan("Toyota Camry", 0, 2023)};
        for (Car car : cars) {
            if (car.speed == 0) {
                car.stop();
            } else {
                car.run();
            }
        }
    }
}

